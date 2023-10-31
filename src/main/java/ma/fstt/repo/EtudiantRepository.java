package ma.fstt.repo;

import ma.fstt.models.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

}
