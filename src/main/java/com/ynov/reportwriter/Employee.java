package com.ynov.reportwriter;

public class Employee extends Worker {
    /*
	 * ---------------------------------
	 *		Propriétés
	 * ---------------------------------
	 */
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
     * @param salary
     * 			Salaire mensuel.
     * @param holidays
     * 			Nombre de jours de vacances restants.
     */
    public Employee(String firstName, String lastName, long salary, int holidays) {
        // Appelle le constructeur surcharge de Worker
        super(firstName, lastName);
        this.salary = salary;
        this.holidays = holidays;
    }

    /*
	 * ---------------------------------
	 *		Méthodes
	 * ---------------------------------
	 */

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
        // Appelle à la méthode parente de Worker pour une description du prénom et du nom.
        super.print();
        System.out.println(salary+"€/month, "+holidays+" days");
    }
}
