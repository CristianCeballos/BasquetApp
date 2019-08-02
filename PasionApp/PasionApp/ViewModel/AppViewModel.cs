using PasionApp.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace PasionApp.ViewModel
{
    public class AppViewModel
    {
        public List<Equipo> listaEquipo { set; get; }
        public List<Jugador> listaJugadores { set; get; }
        public Equipo equipo { set; get; }
        public PartidoNuevo partido { set; get; }

    }
}
