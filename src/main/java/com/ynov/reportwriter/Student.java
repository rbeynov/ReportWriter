package com.ynov.reportwriter;

public class Student {
    /*
	 * ---------------------------------
	 *		Propriétés
	 * ---------------------------------
	 */
    /** Prénom. */
    String firstName;
    /** Nom. */
    String lastName;
    /** Ecole. */
    String school;

	/*
	 * ---------------------------------
	 *		Constructeurs
	 * ---------------------------------
	 */

    /**
     * Constructeur par défaut.
     */
    public Student() {
    }

    /**
     * Constructeur avec valorisation.
     * @param firstName
     * 			Prenom du salarie.
     * @param lastName
     * 			Nom de famille du salarie.
     * @param school
     * 			Ecole de l'etudiant.
     */
    public Student(String firstName, String lastName, String school) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.school = school;
    }

	/*
	 * ---------------------------------
	 *		Méthodes
	 * ---------------------------------
	 */

    /**
     * Affiche la description d'un etudiant (prenom, nom, ecole).
     */
    public void print() {
        System.out.println(firstName+" "+lastName.toUpperCase());
        System.out.println(school+" School");
    }
}
