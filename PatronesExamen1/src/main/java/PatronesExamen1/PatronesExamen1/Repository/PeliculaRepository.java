/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package PatronesExamen1.PatronesExamen1.Repository;

import PatronesExamen1.PatronesExamen1.Entity.Pelicula;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JordanStevenChavarri
 */
@Repository
public interface PeliculaRepository extends CrudRepository<Pelicula, Long>{
    
}
