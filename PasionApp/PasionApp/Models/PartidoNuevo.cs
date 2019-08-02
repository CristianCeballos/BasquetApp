using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace PasionApp.Models
{
    public class PartidoNuevo
    {
        public int id_equipoLocal { set; get; }
        public int puntosLocal { set; get; }
        public int id_equipoVisitante { set; get; }
        public int puntosVisitate { set; get; }
        public DateTime fecha { set; get; }
        public int id_jugadorDelPartido { set; get; }


        public PartidoNuevo(int el, int pl, int ev, int pv, DateTime fec, int jdp)
        {
            id_equipoLocal = el;
            puntosLocal = pl;
            id_equipoVisitante = ev;
            puntosVisitate = pv;
            fecha = fec;
            id_jugadorDelPartido = jdp;
        }

        public PartidoNuevo() { }

    }
}
