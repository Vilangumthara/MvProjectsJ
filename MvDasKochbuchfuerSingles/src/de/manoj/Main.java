package de.manoj;
/**
 * Einstigspunkt in das program
 */

import de.rhistel.ConsoleReader;

public class Main {

    /**
     * Program Starts here
     *
     * @param args :{@link String} zusatzinfo
     */

    //region 1.Main method
    public static void main(String[] args) {
        // write your code here

        /*
         * Calling the method ProgramName
         */
        programName();

        /*
         * Calling the method chooseRecipie
         */

        choseRecipie();
    }

    private static void choseRecipie()
    {
        /*
         * Declare and init variables
         */
        final int iUserOptionRecipieFredEgg             = 1;
        final int iUserOptionSpagettiMitTomatensauce    = 2;
        final int iUserOptionRecipieCallDeliveryService = 3;
        int       iUserOption                           = -1;

        /*
         * Recipie Ausgabe
         */
        System.out.println("[" + iUserOptionRecipieFredEgg + "] Spiegelei");
        System.out.println("[" + iUserOptionSpagettiMitTomatensauce + "] Spageti Mit Tomaten Sauce");
        System.out.println("[" + iUserOptionRecipieCallDeliveryService + "] Call delivery service");

        /*
         * Read the user entries
         */
        iUserOption = ConsoleReader.readIntOption();

        switch (iUserOption) {
            case iUserOptionRecipieFredEgg:
                showRecipieForFriedEgg();
                break;
            case iUserOptionSpagettiMitTomatensauce:
                showRecipieSpagetiMitTomatenSauce();
                break;
            case iUserOptionRecipieCallDeliveryService:
                showRecipieForCallDeliveryService();
                break;
            default:
                showRecipieForThat();

        }

    }

    private static void showRecipieForThat() {
        System.out.println("Gibt es nicht");
    }

    private static void showRecipieForCallDeliveryService() {
        System.out.println("\nRecipie: Delivery Sevice\n" +
                "#######################################");
        System.out.println("\n06821 / 123456 - www.lieferheld.de/musterlieferant");

    }

    private static void showRecipieSpagetiMitTomatenSauce() {
        System.out.println("\nRecipie: Spagetti mit Tomaten sauce\n" +
                "#######################################");
        System.out.println("\nFolge dem Miracoli-Rezept auf der Packung.\n" +
                "Oder iss Ramen(HeiÃŸes Wasser,Nudel,WÃ¼rze 5 min ziehen  lassen,fertig)");


    }

    private static void showRecipieForFriedEgg() {
        System.out.println("\nRecipie: Fried Egg: \n" +
                "#######################################");
        System.out.println("\nPfanne auf Herd heiÃŸ machen.\n" +
                "Ei aufschlagen, langsam in Pfanne gleiten lassen." +
                "\nMit Maggi, Salz, Pfeffer und Paprika wÃ¼rzen. Garen lassen fertig");


    }


    //endregion

    //region 2.print the program name
    private static void programName() {
        System.out.println("\n***************************************************************");
        System.out.println("*************** Das Kochbuch für Singles **********************");
        System.out.println("***************************************************************\n");
    }
    //endregion


}
