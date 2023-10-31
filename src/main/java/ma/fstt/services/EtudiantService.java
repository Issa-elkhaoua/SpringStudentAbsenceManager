package ma.fstt.services;

import ma.fstt.models.Etudiant;

import java.util.List;

public interface EtudiantService {
    List<Etudiant> getAllEtudiants();
    Etudiant getEtudiantById(Long id);
    Etudiant saveOrUpdateEtudiant(Etudiant etudiant);
    void deleteEtudiant(Long id);
}
