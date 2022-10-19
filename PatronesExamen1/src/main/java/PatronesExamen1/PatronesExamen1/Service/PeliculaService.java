/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronesExamen1.PatronesExamen1.Service;

import PatronesExamen1.PatronesExamen1.Entity.Pelicula;
import PatronesExamen1.PatronesExamen1.Repository.PeliculaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JordanStevenChavarri
 */
@Service
public class PeliculaService implements IPeliculaService {

    @Autowired
    private PeliculaRepository peliculaRepository;

    @Override
    public List<Pelicula> getAllMovies() {
        return (List<Pelicula>) peliculaRepository.findAll();
    }

    @Override
    public Pelicula getMovieById(long id) {
        return (Pelicula) peliculaRepository.findById(id).orElse(null);
    }

    @Override
    public void saveMovie(Pelicula pelicula) {
        peliculaRepository.save(pelicula);
    }

    @Override
    public void deleteMovie(long id) {
        peliculaRepository.deleteById(id);
    }

}
