package com.ynov.reportwriter;

public class Employee {
    /*
	 * ---------------------------------
	 *		Propriétés
	 * ---------------------------------
	 */
    /** Prénom. */
    private String firstName;
    /** Nom. */
    private String lastName;
    /** Salaire mensuel. */
    private long salary;
    /** Jours de vacances restants. */
    private int holidays;


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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName.toUpperCase();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getSalary() {
        return salary;
    }

    public int getHolidays() {
        return holidays;
    }

    public void setHolidays(int holidays) {
        this.holidays = holidays;
    }

    /**
     * Affiche la description d'un employe (prenom, nom, salaire, jours de vacances).
     */
    public void print() {
        System.out.println(firstName+" "+getLastName());
        System.out.println(salary+"€/month, "+holidays+" days");
    }
}
