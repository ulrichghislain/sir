# sir
projet incrementale sir master 1
JPA & Web Service

objectifs

Comprendre les mécanismes des servlets

Réaliser une application web en combinant JPA et les Servlets

Comprendre les principes d'une architecture Rest

Comprendre les bénéfices d'un framework come Jersey

Demarrage de la base de données

sh run-hsqldb-server.sh

Démarrage du manager de la base de données

sh shwo-hsqldb.sh

parametres de connexion à la base de données:

Type: HSQL Database Engine Server

Driver: org.hsqldb.jdbcDriver

User: sa

Password: aucun mot de passe

URL: jdbc:hsqldb:hsql://localhost/

ℹ️ Supprimez le contenu du répertoire data, si vous souhaitez réinitialiser la base de données.

Demarrage de l'application

mvn tomcat7:run
