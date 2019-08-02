using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using PasionApp.Models;
using PasionApp.ViewModel;

namespace PasionApp.Controllers
{
    public class AppController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }

        public IActionResult MostrarEquipos()
        {
            AppViewModel vm = new AppViewModel();
            vm.listaEquipo = new GestorApp().mostrarEquipos();

            return View(vm);
        }

        public IActionResult MostrarEquipo(int id)
        {
            AppViewModel vm = new AppViewModel();
            vm.equipo = new GestorApp().mostrarEquipo(id);
            vm.listaJugadores = new GestorApp().mostrarJugadores(id);
            return View(vm);
        }

        public IActionResult CargarPartido()
        {
            AppViewModel vm = new AppViewModel();
            vm.listaEquipo = new GestorApp().mostrarEquipos();
            vm.listaJugadores = new GestorApp().listaJugadores();

            return View(vm);
        }

        [HttpPost]
        public IActionResult CargarPartido(PartidoNuevo partido)
        {
            AppViewModel vm = new AppViewModel();
            new GestorApp().AgregarPartido(partido);
            //vm.listaClientes = new GestorClientes().mostrarClientes();
            return View("Home, Index");

        }

    }
}