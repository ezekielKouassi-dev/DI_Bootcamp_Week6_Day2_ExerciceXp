/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package di.atos.exercicexpweek6day2;

import java.util.Scanner;

/**
 *
 * @author ezekielkouassi
 */
public class ExerciceXpWeek6Day2 {

    public static void main(String[] args) {

        System.out.println("======= Début Exercice 1 ========");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la note (0-100): ");
        // lecture de la note entrée par l'utilisateur
        int grade = scanner.nextInt();

        // déclaration de la variable pour stocker la note en lettres
        String letterGrade;
        // vérification de la note et détermination de la note en lettres correspondante
        if (grade >= 93 && grade <= 100) {
            letterGrade = "A";
        } else if (grade >= 90 && grade <= 92) {
            letterGrade = "A-";
        } else if (grade >= 87 && grade <= 89) {
            letterGrade = "B+";
        } else if (grade >= 83 && grade <= 86) {
            letterGrade = "B";
        } else if (grade >= 80 && grade <= 82) {
            letterGrade = "B-";
        } else if (grade >= 77 && grade <= 79) {
            letterGrade = "C+";
        } else if (grade >= 70 && grade <= 76) {
            letterGrade = "C";
        } else if (grade >= 60 && grade <= 69) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }

        // Affichage de la note en lettres
        System.out.println("Note en lettres: " + letterGrade);

        System.out.println("====== Fin exercie 1 =========");

        System.out.println("======= Début exercie 2 =======");

        String triangle = "";
        
        for(int i = 1; i <= 7; i++) {
            for(int j = 1; j <= i; j++) {
                triangle += String.valueOf(i);
            }
            System.out.println(triangle);
            triangle = "";
        }

        System.out.println("====== Fin exercice 2 ========");

        System.out.println("====== Début Exercice 3 ========");

        byte age = 10;

        short height = 30000;

        // Déclaration d'une variable de type int nommée "distanceBetweenTwoSatellites" et affectation de la valeur 1000000000
        int distanceBetweenTwoSatellites = 1000000000;
        // Déclaration d'une variable de type long nommée "distanceBetweenTwoGalaxies" et affectation de la valeur 10000000000
        long distanceBetweenTwoGalaxies = 10000000000L;
        // Déclaration d'une variable de type float nommée "rateOfInterest" et affectation de la valeur 6/5f
        float rateOfInterest = 6 / 5f;
        // Déclaration d'une variable de type double nommée "rateOfHike" et affectation de la valeur 456/123d
        double rateOfHike = 456 / 123d;
        // Déclaration d'une variable de type char nommée "capitalA" et affectation de la valeur 'A'
        char capitalA = 'A';
        // Déclaration d'une variable de type boolean nommée "isPossible" et affectation de la valeur true
        boolean isPossible = true;

        // Affichage de la valeur de la variable "age"
        System.out.println("Age is: " + age);

        // Affichage de la valeur de la variable "height"
        System.out.println("Height is: " + height);

        // Affichage de la valeur de la variable "distanceBetweenTwoSatellites"
        System.out.println("Distance between two satellites is: " + distanceBetweenTwoSatellites);

        // Affichage de la valeur de la variable "distanceBetweenTwoGalaxies"
        System.out.println("Distance between two galaxies is: " + distanceBetweenTwoGalaxies);

        // Affichage de la valeur de la variable "rateOfInterest"
        System.out.println("Rate of interest is: " + rateOfInterest);

        // Affichage de la valeur de la variable "rateOfHike"
        System.out.println("Rate of hike is: " + rateOfHike);

        // Affichage de la valeur de la variable "capitalA"
        System.out.println("CapitalA: " + capitalA);

        // Affichage de la valeur de la variable "isPossible"
        System.out.println("isPossible: " + isPossible);
        
        System.out.println("====== Fin Exerrcice 3 ========");
        
        System.out.println("======= Début Exercice 4 ========");
        
        printSum();
        
        System.out.println("==== Fin exercice 4 ========");

    }
    
    public static void printSum() {
        // correction du code
        short numOne = 104;
        short numTwo = 110;
        int sumOfTwoNumbers;
        sumOfTwoNumbers = numOne + numTwo;
        System.out.print("Sum: " + sumOfTwoNumbers);
    }
}
