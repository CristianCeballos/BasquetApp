using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Threading.Tasks;

namespace PasionApp.Models
{
    public class GestorApp
    {
        string cadena = "Data Source=DESKTOP-69T3JGA;Initial Catalog=PasionDB;User ID=sa;Password=homero2011";

        public List<Equipo> mostrarEquipos()
        {
            List<Equipo> salida = new List<Equipo>();
            SqlConnection conn = new SqlConnection(cadena);
            conn.Open();

            SqlCommand comm = new SqlCommand("select * from Equipos", conn);
            SqlDataReader dr = comm.ExecuteReader();

            while (dr.Read())
            {
                int id_equipo = dr.GetInt32(0);
                string nombre = dr.GetString(1);
                string ciudad = dr.GetString(2);
                string entrenador = "";
                string foto = dr.GetString(4);
                string logo = dr.GetString(5);

                Equipo eq = new Equipo(id_equipo,nombre,ciudad, entrenador, foto, logo);
                salida.Add(eq);
            }

            conn.Close();
            return salida;

        }

        public Equipo mostrarEquipo(int id)
        {
            Equipo salida = new Equipo();
            SqlConnection conn = new SqlConnection(cadena);
            conn.Open();

            SqlCommand comm = new SqlCommand("exec DatosEquipo "+id, conn);
            SqlDataReader dr = comm.ExecuteReader();

            while (dr.Read())
            {
                int id_equipo = 0;
                string nombre = dr.GetString(0);
                string ciudad = dr.GetString(1);
                string entrenador = "";
                string foto = dr.GetString(2);
                string logo = dr.GetString(3);

                salida = new Equipo(id_equipo, nombre, ciudad, entrenador, foto, logo);
                
            }

            conn.Close();
            return salida;

        }

        public List<Jugador> mostrarJugadores(int id)
        {
            List<Jugador> salida = new List<Jugador>();
            SqlConnection conn = new SqlConnection(cadena);
            conn.Open();

            SqlCommand comm = new SqlCommand("exec JugadoresEquipo " + id, conn);
            SqlDataReader dr = comm.ExecuteReader();

            while (dr.Read())
            {
                int id_jugador = 0;
                string nombre = dr.GetString(0);
                int id_equipo = 0;

                Jugador j = new Jugador(id_jugador, nombre, id_equipo);
                salida.Add(j);

            }

            conn.Close();
            return salida;

        }

        public List<Jugador> listaJugadores()
        {
            List<Jugador> salida = new List<Jugador>();
            SqlConnection conn = new SqlConnection(cadena);
            conn.Open();

            SqlCommand comm = new SqlCommand("select id_jugador, nombre from jugadores", conn);
            SqlDataReader dr = comm.ExecuteReader();

            while (dr.Read())
            {
                int id_jugador = dr.GetInt32(0);
                string nombre = dr.GetString(1);
             
                Jugador j = new Jugador();
                j.id_jugador = id_jugador;
                j.nombre = nombre;
                salida.Add(j);

            }

            conn.Close();
            return salida;

        }

        public void AgregarPartido(PartidoNuevo partido)
        {


            SqlConnection conn = new SqlConnection(cadena);
            conn.Open();

            SqlCommand comm = new SqlCommand("exec CrearPartidos @equipoLocal, @puntosLocal, @equipoVisitante, @puntosVisitante, @fecha, @jugadorPartido", conn);

            comm.Parameters.Add(new SqlParameter("@equipoLocal", partido.id_equipoLocal));
            comm.Parameters.Add(new SqlParameter("@puntosLocal", partido.puntosLocal));
            comm.Parameters.Add(new SqlParameter("@equipoVisitante", partido.id_equipoVisitante));
            comm.Parameters.Add(new SqlParameter("@puntosVisitante", partido.puntosVisitate));
            comm.Parameters.Add(new SqlParameter("@fecha", partido.fecha));
            comm.Parameters.Add(new SqlParameter("@jugadorPartido", partido.id_jugadorDelPartido));

            comm.ExecuteNonQuery();

            conn.Close();


        }
    }
}
