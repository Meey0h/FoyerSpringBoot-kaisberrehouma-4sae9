package tn.esprit.foyerspringboot.services;

import tn.esprit.foyerspringboot.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite(Universite universite);
    Universite updateUniversite(Universite universite);
    void deleteUniversite(Long id);
    List<Universite> getAllUniversites();
}
