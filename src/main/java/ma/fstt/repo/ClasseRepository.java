package ma.fstt.repo;

import ma.fstt.models.Classe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ClasseRepository extends JpaRepository<Classe, Long> {
    // Des méthodes personnalisées pour trouver des classes, par exemple, par enseignant
    List<Classe> findByEnseignantId(Long enseignantId);
}
