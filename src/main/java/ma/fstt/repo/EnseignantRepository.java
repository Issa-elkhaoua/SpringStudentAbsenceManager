package ma.fstt.repo;

import ma.fstt.models.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnseignantRepository extends JpaRepository<Enseignant, Long> {
    // Toute autre méthode de requête spécifique à vos besoins métier peut être déclarée ici
}
