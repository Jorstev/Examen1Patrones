/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package PatronesExamen1.PatronesExamen1.Service;

import PatronesExamen1.PatronesExamen1.Entity.Pelicula;
import java.util.List;

/**
 *
 * @author JordanStevenChavarri
 */
public interface IPeliculaService {
    public List<Pelicula> getAllMovies();
    public Pelicula getMovieById(long id);
    public void saveMovie(Pelicula pelicula);
    public void deleteMovie(long id);
}
