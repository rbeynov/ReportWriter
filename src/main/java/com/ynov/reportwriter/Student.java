package com.ynov.reportwriter;

public class Student extends Worker {
    /*
	 * ---------------------------------
	 *		Propriétés
	 * ---------------------------------
	 */
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
        // Appelle le constructeur par défault de Worker
        // Cette instruction est systématiquement ajouté dans les constructeurs par défaut et il serait donc possible de s'en passer
        super();
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
        // Appelle le constructeur surcharge de Worker
        super(firstName, lastName);
        this.school = school;
    }

	/*
	 * ---------------------------------
	 *		Méthodes
	 * ---------------------------------
	 */

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
        // Appelle à la méthode parente de Worker pour une description du prénom et du nom.
        super.print();
        System.out.println(school+" School");
    }
}
