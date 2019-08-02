using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace PasionApp.Models
{
    public class Equipo
    {
        public int id_equipo { set; get; }
        public string nombre { set; get; }
        public string ciudad { set; get; }
        public string entrenador { set; get; }
        public string foto { set; get; }
        public string logo { set; get; }

        public Equipo(int id, string nom, string ciud, string entre, string fot, string log)
        {
            id_equipo = id;
            nombre = nom;
            ciudad = ciud;
            entrenador = entre;
            foto = fot;
            logo = log;
        }

        public Equipo() { }


    }
}
