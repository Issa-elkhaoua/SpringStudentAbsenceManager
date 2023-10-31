package ma.fstt.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "etudiant")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    private String nom;

    private String prenom;

//    @Temporal(TemporalType.DATE)
    private LocalDate date;

    // Relation bidirectionnelle si nécessaire
    @ManyToOne
    @JoinColumn(name = "classe_id", nullable = false)
    private Classe classe;

}
