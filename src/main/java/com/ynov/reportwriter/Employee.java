package com.ynov.reportwriter;

public class Employee {
    /*
	 * ---------------------------------
	 *		Propriétés
	 * ---------------------------------
	 */
    /** Prénom. */
    String firstName;
    /** Nom. */
    String lastName;
    /** Salaire mensuel. */
    long salary;
    /** Jours de vacances restants. */
    int holidays;


	/*
	 * ---------------------------------
	 *		Constructeurs
	 * ---------------------------------
	 */

    /**
     * Constructeur par défault.
     */
    public Employee() {

    }

    /**
     * Constructeur avec valorisation.
     * @param firstName
     * 			Prenom du salarie.
     * @param lastName
     * 			Nom de famille du salarie.
     * @param salary
     * 			Salaire mensuel.
     * @param holidays
     * 			Nombre de jours de vacances restants.
     */
    public Employee(String firstName, String lastName, long salary, int holidays) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.holidays = holidays;
    }

    /*
	 * ---------------------------------
	 *		Méthodes
	 * ---------------------------------
	 */

    /**
     * Affiche la description d'un employe (prenom, nom, salaire, jours de vacances).
     */
    public void print() {
        System.out.println(firstName+" "+lastName.toUpperCase());
        System.out.println(salary+"€/month, "+holidays+" days");
    }
}
