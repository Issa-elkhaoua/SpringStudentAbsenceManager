package ma.fstt.controleur;

import ma.fstt.models.Absence;
import ma.fstt.models.Classe;
import ma.fstt.models.Etudiant;
import ma.fstt.services.AbsenceService;
import ma.fstt.services.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/absences")
public class AbsenceController {

    @Autowired
    private AbsenceService absenceService;

    @Autowired
    private EtudiantService etudiantService;

    @GetMapping("/add")
    public String add(Model model){
        List<Etudiant> etudiants = etudiantService.getAllEtudiants();
        model.addAttribute("absence" , new Absence());
        model.addAttribute("etudiants", etudiants );
        return "addAbsence";
    }

    @PostMapping("/save")
    public String save(@RequestParam("Etudiant") Long EtudiantID, @ModelAttribute Absence absence){
        Etudiant et = etudiantService.getEtudiantById(EtudiantID);
        absence.setEtudiant(et);
        absenceService.saveOrUpdateAbsence(absence);
        return "redirect:/absence/all";
    }


}

