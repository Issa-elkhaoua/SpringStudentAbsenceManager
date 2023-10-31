# SpringStudentAbsenceManager

### **Objectif :**

La finalité principale de cet atelier est de familiariser les participants avec la conception et le développement d'une application web en se basant sur le framework Spring. Les modules utilisés incluent « Spring Data, Spring MVC, Spring IOC et Thymeleaf » par l’intermédiaire du SpringBoot. L’application à réaliser a pour but de gérer les absences des étudiants d'une école maternelle.

### **Outils utilisés** :

- **IDE** : Intellij
- **Gestion de dépendances** : Maven
- **Initialisation du projet** : Spring Boot Initializer
- **Base de données** : MySQL
- **ORM** : JPA, Hibernate
- **Moteur de template** : Thymeleaf

## **Déroulement de l'atelier** :

****Étape 1 : Diagramme de classe****

La première étape consiste à élaborer un diagramme de classes représentant la structure de l'application. Ce diagramme comprend des entités telles que "Étudiant", "Absence", "Classe", “Enseignant”., et illustre leurs relations.

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/574a19cf-96ba-463a-9d7c-55b7276b6679/45b10148-e356-4ece-8178-d71dc3018151/Untitled.png)

****Étape 2 : Création des entités JPA****

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/574a19cf-96ba-463a-9d7c-55b7276b6679/ae110773-02e2-4ef4-bf5e-cbef8026ec15/Untitled.png)

1. **Enseignant** :
    - **`id`** : Un identifiant unique pour chaque enseignant (de type Long).
    - **`nom`** : Le nom de l'enseignant (de type String).
    - **`prenom`** : Le prénom de l'enseignant (de type String).
2. **Classe** :
    - **`id`** : Un identifiant unique pour chaque classe (de type Long).
    - **`nom`** : Le nom ou la désignation de la classe (de type String).
3. **Etudiant** :
    - **`id`** : Un identifiant unique pour chaque étudiant (de type Long).
    - **`date`** : Une date, qui pourrait être la date de naissance ou la date d'inscription (de type LocalDate).
    - **`nom`** : Le nom de l'étudiant (de type String).
    - **`prenom`** : Le prénom de l'étudiant (de type String).
4. **Absence** :
    - **`id`** : Un identifiant unique pour chaque absence enregistrée (de type Long).
    - **`date`** : La date de l'absence (de type Date).
    - **`motif`** : La raison de l'absence (de type String).
    

****Étape 3 : Mise en place de la couche Repository****

Des interfaces Repository sont créées pour chaque entité. Ces interfaces étendent les interfaces JPA comme JpaRepository pour fournir des méthodes de CRUD (Create, Read, Update, Delete) sans avoir besoin de les implémenter manuellement.

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/574a19cf-96ba-463a-9d7c-55b7276b6679/eaf0074d-143c-4597-aa76-93e7e22d0800/Untitled.png)

****Étape 4 : Élaboration de la couche Service****

Cette couche sert de pont entre la couche contrôleur et la couche Repository. Pour chaque entité, une interface Service est créée avec les méthodes nécessaires. Une classe d'implémentation correspondante est ensuite créée pour chaque interface. L'injection de dépendances est réalisée à l'aide de l'annotation **`@Autowired`** pour injecter les références des Repository dans les classes Service.

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/574a19cf-96ba-463a-9d7c-55b7276b6679/e2e4ca77-43e5-4900-b95f-d7ecf9b2ded1/Untitled.png)

****Étape 5 : Conception de la couche Contrôleur****

En utilisant Spring MVC, des contrôleurs sont mis en place pour gérer les requêtes web. Chaque contrôleur est annoté avec **`@Controller`** et contient des méthodes mappées à des URL spécifiques. Ces méthodes font appel aux services pour obtenir ou modifier les données et renvoyer la vue appropriée.

**Étape 6 : Création des vues CRUD**

Avec Thymeleaf, des vues HTML sont créées pour :

- **CRUD Étudiants** : Permet d'afficher la liste des étudiants, d'ajouter un nouvel étudiant, de modifier ou de supprimer un étudiant existant.

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/574a19cf-96ba-463a-9d7c-55b7276b6679/71b76c3a-579c-473f-91ef-efe2ef9e39a6/Untitled.png)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/574a19cf-96ba-463a-9d7c-55b7276b6679/5ac273c7-f135-4ad1-9bad-e583c42f32d3/Untitled.png)
