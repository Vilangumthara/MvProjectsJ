package de.manoj;

import de.rhistel.ConsoleReader;

public class Main {
    /**
     * program starts here
     *
     * @param args
     */
    public static void main(String[] args) {
        /*
         * ToDo:1 Create the project with name "Topangebote" ====>>> Status ==>> Done
         *  ToDo:2 print some Headlines("************************") ====>>> Status ==>> Done
         *  ToDo:3 define all the variables and functions in the main class ====>>> Status ==>> Done
         *   ToDo:4 Check Login ====>>> Status ==>> Done
         *   ToDo:5 Define this method outside the main class and call this to the main fubction ====>>> Status ==>> Done
         *    ToDo:6 For valid login print topangebote ====>>> Status ==>> Done
         *     ToDo:6.1.install consoleReader and add this to the project library ====>>> Status ==>> Done
         *      ToDo:6.2 Import consoleReader project package ====>>> Status ==>> Done
         */
        // Calling loginCheck method defined outside the main function.
        headlines();
        // Calling loginCheck method defined outside the main function.
        //loginCheck();
        // Calling topangebote method defined outside the main function
       // topangebote();
        checkLoginCredentials();
        topangebote();
    }
    // Create the Method loginCheck outside the main function
    private static void loginCheck() {
        String stgUserName = "Manoj";
        int iPW = 1234;
        Boolean blnUsermsg = true;

        if (stgUserName.equals("Manoj") && (iPW == 1234)) {
            System.out.println(blnUsermsg + "\n" +
                    "\nYou are logged in as : " + stgUserName + "\n" +
                    "\nSearching for your Top Ten Angebote this week !!!!!!!!!!\n" +
                    "!!!!!!!!!!!\n");
        } else {
            System.out.println("Login failed");
        }

    }

    private static void headlines() {
        String stgProjectName = "Topangebote";

        System.out.println("-----------------------------------------------------------------\n" +
                "*-*- " + stgProjectName + " *-*-*\n");
        System.out.println("******************************************************************\n" +
                "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
    }

    // Create Topangebote method outside the Main method
    private static void topangebote() {

        Boolean validLoginCredentials = true;

        String stgAngeboteNumberOne = "1. Damen Hose (Alle große) nür 12,50 €";
        String stgAngeboteNumberTwo = "2.Herren jacke (Alle große) nür 72,50 €";
        String stgAngeboteNumberThree = "3. Milch 10 Liter nür 12,00 €";
        String stgAngeboteNumberFour = "4. Lachs 10 Kilo nür 66,00 €";
        String stgAngeboteNumberFive = "5. Brot 10 Packet nür 12,00 €";
        String stgAngeboteNumberSix = "6. kartoffle 10 Kilo nür 12,00 €";
        String stgAngeboteNumberSeven = "7. Damen jacke (Alle große) nür 72,50 €";
        String stgAngeboteNumberEight = "8. Herren Hose (Alle große) nür 12,50 €";
        String stgAngeboteNumberNine = "9. Katzenfutter 10 Kilo nür 22,50 €";
        String stgAngeboteNumberTen = "10. Butter 2 packung 1,50 €";

        if (validLoginCredentials == true)
        {
            System.out.println("Topangebote this week\n" +
                "------------------------\n" );
            System.out.println(stgAngeboteNumberOne + "\n" +
                    "\n"+ stgAngeboteNumberTwo +"\n" +
                    "\n"+stgAngeboteNumberThree +"\n"+
                    "\n"+stgAngeboteNumberFour +"\n"+
                    "\n"+stgAngeboteNumberFive +"\n"+
                    "\n"+stgAngeboteNumberSix +"\n"+
                    "\n"+stgAngeboteNumberSeven +"\n"+
                    "\n"+stgAngeboteNumberEight +"\n"+
                    "\n"+stgAngeboteNumberNine +"\n"+
                    "\n"+stgAngeboteNumberTen +"\n");
        }

    }
    private static void checkLoginCredentials() {

            String stgValidUserName = "Manoj";
            int iValidUserPin = 1234;
            Boolean validLoginCredentials = true;

            System.out.println("Username: ");
            String strInputedUserName = ConsoleReader.readStringValue();

            System.out.println("UserPassword: ");
            int iInputedUserPassword = ConsoleReader.readIntValue();

            if (strInputedUserName.equals(stgValidUserName) && (iInputedUserPassword==iValidUserPin))
            {
                System.out.println("\nLogin was Successful\n" +
                        "\nvalidLoginCredentials = "+ validLoginCredentials +"\n" );
            }

        else
            {
                System.out.println("Login failed\n" +
                        "validLoginCredentials = false");
            }

        }
        }

