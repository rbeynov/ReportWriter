package com.ynov.reportwriter;

public class Launcher {
    public static void main(String[] args) {
        Employee 		alain 	= new Employee("Alain", "Térieur", 1000, 14);
        Student         alex 	= new Student("Alex", "Ception", "YNOV");
        SubContractor   anna 	= new SubContractor("Anna", "Tomie", 150);
        Employee 		harry 	= new Employee("Harry", "Covert", 1400, 1);
        Student 		justin 	= new Student("Justin", "Calva", "EPITECH");

        Document ultraTopSecret = new Document();
        ultraTopSecret.setContent("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut eu elit magna. Pellentesque at turpis non arcu gravida aliquet pellentesque at massa. Donec nunc elit, tincidunt non egestas a, placerat ac urna. Sed tempus odio nec sodales commodo. Maecenas sit amet imperdiet orci, ut gravida purus.");

        // Chacune des classes precedentes peut être considérée comme
        // un élément imprimable (implémentation d'interface+héritage, liaison de type IS-A)
        // et donc rentrer dans un tableau de Printable
        Printable[] printableElements = new Printable[] {
                alain, alex, anna,
                harry, justin,
                ultraTopSecret
        };

        Printer officePrinter = new Printer();
        officePrinter.setName("Main printer of the office");

        // Affichage des données
        printReport(printableElements, officePrinter);
    }

    /**
     * Permet l'impression d'un rapport.
     * @param elementsToPrint
     * 			Tableau d'éléments imprimables dont on veut afficher les donnees.
     * @param printerToUse
     *          Some printer to send report to.
     */
    public static void printReport(Printable[] elementsToPrint, Printer printerToUse) {
        System.out.println("Great Report that will be printed thanks to '"+printerToUse+"'");
        System.out.println("-------------------\n\n");

        for(int i = 0; i < elementsToPrint.length; i++) {
            // Affichage des infos sur le salarie d'index I
            elementsToPrint[i].print();
            System.out.println(""); // Saute une ligne
        }
    }
}
