package com.ynov.reportwriter;

public class Launcher {
    public static void main(String[] args) {
        Employee 		alain 	= new Employee("Alain", "Térieur", 1000, 14);
        Student         alex 	= new Student("Alex", "Ception", "YNOV");
        SubContractor   anna 	= new SubContractor("Anna", "Tomie", 150);
        Employee 		harry 	= new Employee("Harry", "Covert", 1400, 1);
        Student 		justin 	= new Student("Justin", "Calva", "EPITECH");

        // Chacune des classes precedentes peut être considérée comme
        // un salarié (héritage, liaison de type IS-A)
        // et donc rentrer dans un tableau de salarié
        Worker[] workers = new Worker[] {
                alain, alex, anna,
                harry, justin
        };

        // Affichage des données
        printReport(workers);
    }

    /**
     * Permet l'impression d'un rapport sur les salaries.
     * @param workers
     * 			Tableau de salaries dont on veut afficher les donnees.
     */
    public static void printReport(Worker[] workers) {
        System.out.println("Great Report");
        System.out.println("-------------------\n\n");

        for(int i = 0; i < workers.length; i++) {
            // Affichage des infos sur le salarie d'index I
            workers[i].print();
            System.out.println(""); // Saute une ligne
        }
    }
}
