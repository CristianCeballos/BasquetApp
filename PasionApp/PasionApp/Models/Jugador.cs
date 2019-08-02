using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace PasionApp.Models
{
    public class Jugador
    {
        public int id_jugador { set; get; }
        public string nombre { set; get; }
        public int equipo { set; get; }

        public Jugador(int id, string nom, int eq)
        {
            id_jugador = id;
            nombre = nom;
            equipo = eq;
        }

        public Jugador() { }
    }
}
