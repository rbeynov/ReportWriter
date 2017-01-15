package com.ynov.reportwriter;

public class SubContractor extends Worker {
    /*
	 * ---------------------------------
	 *		Propriétés
	 * ---------------------------------
	 */
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
     * @param dailyRate
     * 			Taux journalier.
     */
    public SubContractor(String firstName, String lastName, long dailyRate) {
        // Appelle le constructeur surcharge de Worker
        super(firstName, lastName);
        this.dailyRate = dailyRate;
    }
	/*
	 * ---------------------------------
	 *		Méthodes
	 * ---------------------------------
	 */

    public long getDailyRate() {
        return dailyRate;
    }

    /**
     * Affiche la description d'un sous traitant (prenom, nom, taux journalier).
     */
    public void print() {
        // Appelle à la méthode parente de Worker pour une description du prénom et du nom.
        super.print();
        System.out.println(dailyRate+"€/day");
    }
}
