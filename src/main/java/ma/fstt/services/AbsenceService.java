package ma.fstt.services;

import ma.fstt.models.Absence;
import ma.fstt.models.Etudiant;

import java.util.List;

public interface AbsenceService {
    List<Absence> getAbsencesByEtudiantId(Long etudiantId);
    Absence saveOrUpdateAbsence(Absence absence);
}


// Répétez pour les autres services (ClasseService, EnseignantService, etc.)
