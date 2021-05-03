1) Cloner le répertoire GitHub

4) Se placer dans le répertoire du projet Maven, là où se trouve le pom.xml. Lancer la commande mvn eclipse:eclipse.

4) Importer le projet en faisant : Import > Existing Maven Projects > Browse > Select file > Finish 

5) Ouvrir le fichier application.properties et rentrer les données ci-dessous (au besoin adapter avec vos propres informations de connexion) :

server.port=8080 

com.bibliotheque.web.apiUrl=http://127.0.0.1:9001

6) Faire run as, lancer la commande spring-boot : run

7) Pour afficher le site rendez-vous sur http://localhost:8080/
