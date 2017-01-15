package com.ynov.reportwriter;

public class SubContractor {
    /*
	 * ---------------------------------
	 *		Propriétés
	 * ---------------------------------
	 */
    /** Prénom. */
    String firstName;
    /** Nom. */
    String lastName;
    /** Taux journalier. */
    long dailyRate;

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

    /**
     * Affiche la description d'un sous traitant (prenom, nom, taux journalier).
     */
    public void print() {
        System.out.println(firstName+" "+lastName.toUpperCase());
        System.out.println(dailyRate+"€/day");
    }
}
