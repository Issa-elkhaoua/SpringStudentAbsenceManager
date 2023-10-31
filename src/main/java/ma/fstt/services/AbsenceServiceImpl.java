package ma.fstt.services;

import ma.fstt.models.Absence;
import ma.fstt.repo.AbsenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbsenceServiceImpl implements AbsenceService {

    @Autowired
    AbsenceRepository absenceRepository;



    @Override
    public List<Absence> getAbsencesByEtudiantId(Long etudiantId) {
        return absenceRepository.findByEtudiantId(etudiantId);
    }

    @Override
    public Absence saveOrUpdateAbsence(Absence absence) {
        return absenceRepository.save(absence);
    }

    // autres implémentations de méthodes...
}

// Répétez pour les autres services (ClasseServiceImpl, EnseignantServiceImpl, etc.)

