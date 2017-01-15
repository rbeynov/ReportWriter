package com.ynov.reportwriter;

public class SubContractor {
    /*
	 * ---------------------------------
	 *		Propriétés
	 * ---------------------------------
	 */
    /** Prénom. */
    private String firstName;
    /** Nom. */
    private String lastName;
    /** Taux journalier. */
    private long dailyRate;

	/*
	 * ---------------------------------
	 *		Constructeurs
	 * ---------------------------------
	 */

    /**
     * Constructeur par défaut.
     */
    public SubContractor() {
    }

    /**
     * Constructeur avec valorisation.
     * @param firstName
     * 			Prenom du salarie.
     * @param lastName
     * 			Nom de famille du salarie.
     * @param dailyRate
     * 			Taux journalier.
     */
    public SubContractor(String firstName, String lastName, long dailyRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dailyRate = dailyRate;
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

    public long getDailyRate() {
        return dailyRate;
    }

    /**
     * Affiche la description d'un sous traitant (prenom, nom, taux journalier).
     */
    public void print() {
        System.out.println(firstName+" "+getLastName());
        System.out.println(dailyRate+"€/day");
    }
}
