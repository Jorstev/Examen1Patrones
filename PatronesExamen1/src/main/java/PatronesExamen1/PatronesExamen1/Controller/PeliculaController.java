/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronesExamen1.PatronesExamen1.Controller;

import PatronesExamen1.PatronesExamen1.Entity.Pelicula;
import PatronesExamen1.PatronesExamen1.Entity.Sala;
import PatronesExamen1.PatronesExamen1.Service.IPeliculaService;
import PatronesExamen1.PatronesExamen1.Service.ISalaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author JordanStevenChavarri
 */
@Controller
public class PeliculaController {

    @Autowired
    private IPeliculaService peliculaService;

    @Autowired
    private ISalaService salaService;

    @GetMapping("/pelicula")
    public String index(Model model) {
        List<Pelicula> listaPeliculas = peliculaService.getAllMovies();
        model.addAttribute("titulo", "Cartelera de Peliculas");
        model.addAttribute("pelicula", listaPeliculas);
        return "pelicula";
    }

    @GetMapping("/delete/{id}")
    public String deleteMovie(@PathVariable("id") long id) {
        peliculaService.deleteMovie(id);
        return "redirect:/pelicula";
    }

    @GetMapping("/peliculaN")
    public String crearPersona(Model model) {
        List<Sala> listaSala = salaService.listaSala();
        model.addAttribute("pelicula", new Pelicula());
        model.addAttribute("salas",listaSala);

        return "crear";
    }

    @PostMapping("/save")
    public String guardarPersona(@ModelAttribute Pelicula pelicula) {//especificar que el objeto tipo persona viene del frontend, para eso utilizamos el @ModelAttribute
        peliculaService.saveMovie(pelicula);
        return "redirect:/pelicula";
    }

}
