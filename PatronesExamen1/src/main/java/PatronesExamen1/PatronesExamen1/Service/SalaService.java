/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronesExamen1.PatronesExamen1.Service;

import PatronesExamen1.PatronesExamen1.Entity.Sala;
import PatronesExamen1.PatronesExamen1.Repository.SalaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JordanStevenChavarri
 */
@Service
public class SalaService implements ISalaService {
    @Autowired
    private SalaRepository salaRepository;

    @Override
    public List<Sala> listaSala() {
        return (List<Sala>) salaRepository.findAll();
    }
    
   
    
}
