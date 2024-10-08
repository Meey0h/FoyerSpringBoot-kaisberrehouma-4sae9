package tn.esprit.foyerspringboot.services;

import tn.esprit.foyerspringboot.entities.Chambre;

import java.util.List;

public interface IChambreService {
    Chambre addChambre(Chambre chambre);
    Chambre updateChambre(Chambre chambre);
    void deleteChambre(Long id);
    List<Chambre> getAllChambres();
}