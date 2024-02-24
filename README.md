# Rapport: Application d'Inversion de Contrôle et Injection de Dépendances

## Introduction
Ce rapport présente un projet Java mettant en œuvre l'Inversion de Contrôle (IoC) et l'Injection de Dépendances (DI) selon les spécifications fournies. L'objectif est de comprendre et d'illustrer les différents mécanismes d'injection de dépendances, notamment l'injection par instanciation statique, par instanciation dynamique, ainsi que l'utilisation du framework Spring avec les versions XML et les annotations.
## Implementation
![image](https://github.com/younes-makhchan/InversionControle-JEE/assets/74161217/93ab1430-aeac-4fa6-983a-0e8c4ea6910e)

DaoImpl.java et IDao.java :  Ces fichiers définissent une interface IDao avec une méthode getData et une implémentation DaoImpl qui retourne une valeur factice à des fins de démonstration.

DaoImplV2.java :Cette classe propose une implémentation alternative de l'interface IDao simulant une autre source de données.

IMetier.java et MetierImpl.java :  Ces fichiers définissent une interface IMetier avec une méthode calcul et une implémentation MetierImpl qui utilise l'interface IDao pour effectuer des calculs.

Injection des Dépendances :

Par Instanciation Statique  : Les dépendances sont injectées en créant manuellement les instances des classes nécessaires.
Par Instanciation Dynamique  : Les dépendances sont injectées en lisant les noms de classe à partir d'un fichier de configuration et en utilisant la réflexion pour créer les instances.
Avec Spring : Les dépendances sont gérées par Spring en utilisant les configurations XML et les annotations respectivement.
