package com.ynov.reportwriter;

/**
 * Classe desigant un salarie. <br />
 * La classe est abstraite: on ne peut pas l'instancier (pas de "Worker worker = new Worker()").
 */
public abstract class Worker implements Printable {
    /*
	 * ---------------------------------
	 *		Propriétés
	 * ---------------------------------
	 */
    /** Prénom. */
    private String firstName;
    /** Nom. */
    private String lastName;

    /*
	 * ---------------------------------
	 *		Constructeurs
	 * ---------------------------------
	 */

    /**
     * Constructeur par défault.
     */
    public Worker() {

    }

    /**
     * Constructeur surcharge.
     * @param firstName
     * 			Prenom du salarie.
     * @param lastName
     * 			Nom de famille du salarie.
     */
    public Worker(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    /**
     * Affiche la description d'un salarie (prenom, nom).
     */
    @Override
    public void print() {
        System.out.println(firstName+" "+getLastName());
    }
}
