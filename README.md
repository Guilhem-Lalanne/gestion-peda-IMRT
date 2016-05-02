# Gestion-peda-IMRT

## Projet d'IUT

Cahier des charges

Il s’agit de créer un logiciel regroupant plusieurs fonctionnalités :  

1. Gestion des différents types de connexion  
2. Gestion de l’emploi du temps  
3. Gestion des intervenants  
4. Gestion des étudiants  
5. Gestion des examens  


Le logiciel devra permettre :  


### 1 Gestion des connexions 

Création des comptes utilisateurs soit par importation soit manuellement avec création automatique de mots de passe.  
Possibilité pour l’administrateur de réinitialiser un mot de passe.  
Possibilité pour l’utilisateur de modifier son mot de passe  
Création de 4 types de comptes :  
  * Enseignant  
  * Etudiant  
  * Secrétaire  
  * Administrateur  
  
Définition pour chaque groupe de droits par défaut  
Modification par l’administrateur des droits d’un utilisateur ou d’un groupe  
Publipostage pour envoi des mots de passe aux utilisateurs  


### 2 Organisation de l’emploi du temps

Création et gestion d’emplois du temps dans une fenêtre faisant apparaitre une semaine avec les heures en ordonnée et les jours en abscisse.  
Changement de semaine par bouton semaine suivante ou précédente  
Possibilité d’afficher l’emploi du temps dans une même fenêtre d’une ou plusieurs promotions  
Création d’un cours par choix dans des listes déroulantes comprenant  
  * L’UE  
  * Le nom de l’enseignant  
  * La promotion  
  * Le groupe  
  * La salle  
  
Un cours ne pourra être créé que si :  
  * La salle est libre  
  * L’enseignant n’a pas déjà un cours à la même heure  
  * Les étudiants n’ont pas déjà un cours à la même heure  
  * Le nombre d’heures dans l’UE n’a pas été atteint  
  
Création de cours récurrent sur plusieurs semaines, mois, semestres ou années  
La création d’un cours devra décrémenter le nombre d’heures dans l’UE.  
Visualisation et impression de l’emploi du temps sur une semaine  
Traçabilité des cours donnés  
Traçabilité des cours annulés  
Fournir l’historique des heures effectuées par UE, par promotion, par étudiant  
Communication des changements d’emploi du temps sur les réseaux sociaux  


### 3 Gestion des intervenants

La fiche de suivi des intervenants devra comprendre :  
  * La civilité  
  * Le nom  
  * Le prénom  
  * Le statut  
  * La discipline  
  * La date de naissance  
  * L’employeur à choisir dans une liste déroulante  
  * L’adresse  
  * Le numéro de téléphone fixe  
  * Le numéro de téléphone mobile  
  * L’adresse mail  

Suivi de la réception des différents documents administratifs à fournir :  
  * Photocopie de la carte nationale d’identité  
  * Photocopie de la carte de sécurité sociale  
  * Justificatif de travail (bulletin de salaire)  
  * Réception de l’arrêté de nomination  
  
Répartition annuelle des UE à chaque enseignant  
Répartition annuelle des heures à chaque enseignant  
Visualisation des heures déjà attribuées à un enseignant, à une UE  
Pour la mise en paiement des heures :  
  * Edition du nombre d’heures faites par un enseignent pour une période donnée  
  * Le paiement des heures ne pourra être fait que si l’arrêté de nomination a bien été reçu  
  * Suivi des heures payées pour un enseignant pour une période donnée  
  * Suivi des heures non payées pour une période donnée  


### 4 Gestion des étudiants

La fiche de suivi des étudiants devra comprendre :  
  * La civilité  
  * Le nom  
  * Le prénom  
  * La date de naissance  
  * L’adresse  
  * Le numéro de téléphone fixe  
  * Le numéro de téléphone mobile  
  * L’adresse mail  
  * La promotion  
  * Le groupe d’appartenance  
  
L’enregistrement de nouveaux étudiants doit pouvoir aussi être réalisé par importation  
Possibilité de modifier les informations d’un étudiant  
Possibilité de marquer comme démissionnaire un étudiant  
Gestion des absences :  
  * Le choix s’effectuera par choix de l’enseignant et de la date. Ce choix devra afficher la liste des étudiants présents dans le cours.  
  * Par défaut tous les étudiants devront être présents.  
  * Saisie du motif d’absence  
  
Edition de bulletin d’absence par étudiant faisant apparaître :  
  * Le nombre d’heures d’absence  
  * Le nombre d’heures d’absence par UE  
  
Suivi des notes obtenues aux partiels  
Suivi des ECTS délivrés en fonction des règles propres à chaque UE.  


### 5 Organisation des examens

Chaque document édité devra l’être à partir de documents pré-remplis  
Edition des convocations pour chaque étudiant avec présélection d’une promotion et possibilité de rajout d’étudiants supplémentaires à partir d’une liste déroulante ne comprenant pas les étudiants déjà sélectionnés. Sélection de la date par calendrier  
Edition des convocations pour chaque examinateur ou surveillant avec choix des examinateurs ou surveillants par case à cocher. Sélection de la date par calendrier  
Edition de PV à partir de documents pré remplis avec sélection des examinateurs ou surveillants de l’UE par case à cocher. Sélection de la date par calendrier  
