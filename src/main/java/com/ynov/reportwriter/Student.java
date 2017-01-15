package com.ynov.reportwriter;

public class Student {
    /*
	 * ---------------------------------
	 *		Propriétés
	 * ---------------------------------
	 */
    /** Prénom. */
    private String firstName;
    /** Nom. */
    private String lastName;
    /** Ecole. */
    private String school;

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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName.toUpperCase();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * Affiche la description d'un etudiant (prenom, nom, ecole).
     */
    public void print() {
        System.out.println(firstName+" "+getLastName());
        System.out.println(school+" School");
    }
}
