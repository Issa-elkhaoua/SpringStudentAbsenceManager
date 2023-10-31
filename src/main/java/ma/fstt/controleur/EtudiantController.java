package ma.fstt.controleur;

import ma.fstt.models.Classe;
import ma.fstt.models.Etudiant;
import ma.fstt.services.ClasseService;
import ma.fstt.services.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/etudiant")
public class EtudiantController {

    @Autowired
    private EtudiantService etudiantService;

    @Autowired
    private ClasseService classeService;

    @GetMapping("/add")
    public String add(Model model){
        List<Classe> classes = classeService.getAllClasses();
        model.addAttribute("etudiant" , new Etudiant());
        model.addAttribute("classes", classes );
        return "addEtudiant";
    }

    @PostMapping("/save")
    public String save(@RequestParam("Classe") Long ClassId, @ModelAttribute Etudiant etudiant){
        Classe cl = classeService.getClasseById(ClassId);
        etudiant.setClasse(cl);
        etudiantService.saveOrUpdateEtudiant(etudiant);
        return "redirect:/etudiant/all";
    }

    @GetMapping("/all")
    public String all(Model model){

        List<Etudiant> mylist = etudiantService.getAllEtudiants();
        model.addAttribute("listetudiants" , mylist);
        return "listEtudiants";
    }

    @GetMapping("/delete/{id}")
    public String delete(Model model , @PathVariable(value = "id") Long id){

        etudiantService.deleteEtudiant(id);
        return "redirect:/etudiant/all";
    }


    @GetMapping("/update/{id}")
    public String update(Model model , @PathVariable(value = "id") Long id){
        Etudiant et = etudiantService.getEtudiantById(id);
        List<Classe> cls = classeService.getAllClasses();
        model.addAttribute("etudiant" , et );
        model.addAttribute("classes", cls );

        return "addEtudiant";
    }


}

