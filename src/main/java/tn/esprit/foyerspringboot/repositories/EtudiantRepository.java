package tn.esprit.foyerspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyerspringboot.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

}
