package ma.fstt.services;

import ma.fstt.models.Classe;
import ma.fstt.models.Etudiant;
import ma.fstt.repo.AbsenceRepository;
import ma.fstt.repo.ClasseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClasseServiceImpl implements ClasseService{

    @Autowired
    ClasseRepository classeRepository;

    @Override
    public List<Classe> getAllClasses() {
        return classeRepository.findAll();
    }

    @Override
    public Classe getClasseById(Long id) {
        return classeRepository.findById(id).orElse(null);
    }
}
