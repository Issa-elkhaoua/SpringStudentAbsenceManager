package ma.fstt.services;

import ma.fstt.models.Classe;
import ma.fstt.models.Etudiant;

import java.util.List;

public interface ClasseService {

    List<Classe> getAllClasses();
    Classe getClasseById(Long id);
}
