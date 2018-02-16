# Projet Middle-Office
## Contexte
Dans le cadre de la matière Méthodes Agiles, nous avons eu à réaliser une api web.
Celle ci utilise le format REST (verb HTTP) pour créer des demandes, qui seront soumis à vote par des tiers.

## Sommaire
Ce git contient l'ensemble de notre analyse, réflexion et développement :
- La racine du projet contient
    - Un pom.xml permettant de build le projet
    - Un Dockerfile pour la mise en conteneur
- Le dossier src contient les sources du projet
- Le dossier doc contient la javadoc du projet
- Le dossier test contient les fichiers de test Postman
- Le dossier ressources contient la backlog
- L'utilisation et la mise en place de l'application est détaillé après

## Fonctionnement
Requete GET sur / pour renvoyer la documentation
Requete GET sur /demandes/create pour accéder au formulaire
Requete POST sur /demandes pour créer une demande
Requete GET sur /demandes pour lister les demandes
Requete GET sur /demande/{id_demande}   pour voir la demande
Requete POST sur /demande/{id_demande}  voter la demande

Les données sont stockés en RAM

## Déployement

Un commit sur master déclenche un hook vers dockerhub pour build matthieujan/projetagile:latest
Un commit sur deploy déclence un hook vers dockerhub pour build matthieujan/projetagile:bsf

Depuis dockerhub : ```docker run -d --name projetagile --publish 80:80 matthieujan/projetagile:{version} ```
