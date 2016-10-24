# FizzBuzz

## Objectifs pédagogiques :
- Découverte de la structure de répertoire normée (issue de Maven)
- Renforcement des connaissances sur la compilation / exécution en ligne de commande
- Découverte des structures de contrôle
- Algorithmie
- Tests unitaires

## Enoncé :
Ecrire un programme permettant l'affichage d'une série d'entier sur la sortie standard (un entier par ligne) en appliquant les règles suivantes :
- Lorsque l'entier est multiple de 3, afficher "Fizz" en lieu et place de l'entier
- Lorsque l'entier est multiple de 5, afficher "Buzz" en lieu et place de l'entier

Le programme sera lancé par la classe **co.simplon.prairie.Main** mais la logique métier sera portée par la classe **co.simplon.prairie.FizzBuzz**.

Les tests unitaires présents dans **co.simplon.prairie.FizzBuzzTest** doivent passer au vert et être enrichis.

## Outils ligne de commande (se placer à la racine du projet) :
- Pour compiler les sources :
  - Windows :
  - Unix : javac src/main/java/co/simplon/prairie/*.java
- Pour compiler les tests : 
  - Windows :
  - Unix : javac -cp "src/main/java:libs/*" src/test/java/co/simplon/prairie/*.java
- Pour lancer les tests : 
  - Windows :
  - Unix : java -cp "src/test/java:libs/*" org.junit.runner.JUnitCore co.simplon.prairie.FizzBuzzTest
- Pour lancer l'application : 
  - Windows :
  - Unix : java -cp "src/test/java" co.simplon.prairie.Main
