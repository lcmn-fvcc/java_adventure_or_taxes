/*
Laura Mills Nelson
Assignment 3
02/07/18
 */
package assign3_millsnelson;

import java.util.Scanner;

/**
 *
 * @author lauracmillsnelson
 */
public class Assign3_MillsNelson
{

    //create scanner
    static Scanner myScan = new Scanner(System.in);

    //menu function to display menu and operate switch statement
    static void Menu()
    {
        //variables
        int Choice = -1;

        //display menu
        System.out.print("Menu:"
                + "\n1. Play A Game"
                + "\n2. Figure Your Tax Rate\n"
                + "\nEnter 1 to play a game, or "
                + "enter 2 to figure your tax rate:  ");
        Choice = Integer.parseInt(myScan.nextLine());

        //switch statement to choose between game or tax calculation
        switch (Choice)
        {
            case 1:
                if_PlayGame();
                break;
            case 2:
                if_FigureTaxRate();
                break;
            default:
                System.out.println("\nThat wasn't a choice!!\n");
        }

    }

    //function to play a game
    static void if_PlayGame()
    {
        //variables
        int Fork = -1;
        int rightItems = -1;
        int leftItems = -1;


        //display game narrative and ask question
        System.out.print("\nYou have chosen to play a game.\n\n"
                + "You are hiking in a beautiful National Park when you come\n"
                + "to a fork in the trail. One trail goes to the right and\n"
                + "the other goes to the left. Enter 1 to go right or 2 to\n"
                + "go left:   ");

        //collect answer
        Fork = Integer.parseInt(myScan.nextLine());

        //IF function to go right at the first fork
        if (Fork == 1)
        {
            //display narrative and ask question
            System.out.print("\nYou have chosen to go right.\n\n"
                    + "After a few minutes, you come across two objects. One\n"
                    + "is an unopened box of Lucky Charms cereal. The other \n"
                    + "is a small glass vial of pixie dust. You must choose \n"
                    + "one of the objects to carry with you. Enter 1 to \n"
                    + "choose the Lucky Charms cereal, or enter 2 to choose\n"
                    + "the vial of pixie dust:   ");

            //collect answer
            rightItems = Integer.parseInt(myScan.nextLine());

            //display choice of Lucky Charms and ask question
            if (rightItems == 1)
            {
                System.out.print("\nYou have chosen the box of Lucky Charms "
                        + "cereal. \n\nAfter a few minutes, you come to \n"
                        + "another fork in the trail. One trail goes to the\n"
                        + "right and the other goes to the left. Enter 1 to\n"
                        + "go right or 2 to go left:  ");

                //collect answer
                Fork = Integer.parseInt(myScan.nextLine());

                //display narrative to go right and WIN
                if (Fork == 1)
                {
                    System.out.print("\nYou have chosen to go right.\n\n"
                            + "After a few minutes, you come upon a \n"
                            + "mischievous-looking leprechaun standing at the\n"
                            + "end of a large rainbow. 'Tis a bearer of\n"
                            + "gifts!', he says, looking at you greedily. \n"
                            + "'What have you brought me?' "
                            + "\nYou offer him your box of Lucky Charms.\n"
                            + "He gobbles it up quickly, gives you a big\n"
                            + "grin, and leads you over the rainbow to his\n"
                            + "big pot of gold, which he shares with you."
                            + "\n\nYOU WIN!!!!!\n\n");
                } //display narrative to go left and LOSE
                else if (Fork == 2)
                {
                    System.out.print("\nYou have chosen to go left. \n\n"
                            + "After a few minutes, you come upon a large\n"
                            + "crevasse. You attempt to cross, first loading\n"
                            + "up on the Lucky Charms cereal for energy.\n"
                            + "Unfortunately, you trip and plummet to your\n"
                            + "death. \n\nYOU LOSE!\n\n");
                } //narrative for any choice other than 1 or 2
                else
                {
                    System.out.println("\nThat wasn't a choice!!");
                }
            } //display choice of pixie dust and ask question
            else if (rightItems == 2)
            {
                System.out.print("\nYou have chosen the vial of pixie dust.\n"
                        + "\n\nAfter a few minutes, you come to another fork\n"
                        + "in the trail. One trail goes to the right and the \n"
                        + "goes to the left. Enter 1 to go right or 2 to go\n"
                        + "left:  ");

                //collect answer
                Fork = Integer.parseInt(myScan.nextLine());

                //display narrative to go right and LOSE
                if (Fork == 1)
                {
                    System.out.print("\nYou have chosen to go right.\n\n"
                            + "After a few minutes, you come upon a \n"
                            + "mischievous-looking leprechaun standing at the\n"
                            + "end of a large rainbow. 'Tis a bearer of\n"
                            + "gifts!', he says, looking at you greedily. \n"
                            + "'What have you brought me?' "
                            + "\nYou offer him your vial of pixie dust.\n"
                            + "He grabs it, sprinkles it over you, and turns\n"
                            + "you into a big pot of gold.\n"
                            + "\n\nYOU LOSE!\n\n");
                } //display narrative to go left and WIN
                else if (Fork == 2)
                {
                    System.out.print("\nYou have chosen to go left. \n\n"
                            + "After a few minutes, you come upon a large\n"
                            + "crevasse. You sprinkle the vial of pixie dust\n"
                            + "over yourself, think of something that makes\n"
                            + "you happy, and magically fly over the\n"
                            + "crevasse, continuing on your way."
                            + "\n\nYOU WIN!!!!!\n\n");
                } //display narrative for any choice other than 1 or 2
                else
                {
                    System.out.println("\nThat wasn't a choice!!");
                }

            } //display narrative for any choice other than 1 or 2
            else
            {
                System.out.println("\nThat wasn't a choice!!");
            }
        } //IF function to go left at first fork
        else if (Fork == 2)
        {
            //display narrative and ask question
            System.out.print("\nYou have chosen to go left."
                    + "\n\nAfter following the path for a few minutes, you \n"
                    + "come across two objects. One is a hot and fresh double\n"
                    + "cheeseburger. The other is a small bouquet of \n"
                    + "four-leafed clovers. You must choose one of the \n"
                    + "objects to carry with you. Enter 1 to choose the \n"
                    + "double cheeseburger, or enter 2 to choose the bouquet \n"
                    + "of four-leafed clovers:   ");

            //collect answer
            leftItems = Integer.parseInt(myScan.nextLine());

            //display choice of cheeseburger and ask question
            if (leftItems == 1)
            {
                System.out.print("\nYou have chosen the double cheeseburger."
                        + "\n\nAfter a few minutes, you come to another fork\n"
                        + "in the trail. One trail goes to the right and the \n"
                        + "other goes to the left. Enter 1 to go right or 2\n"
                        + "to go left:  ");

                //collect answer
                Fork = Integer.parseInt(myScan.nextLine());

                //display choice to go right and LOSE
                if (Fork == 1)
                {
                    System.out.print("\nYou have chosen to go right.\n\n"
                            + "After a few minutes, you come upon a beautiful\n"
                            + "unicorn. The unicorn looks hungry, but all you\n"
                            + "have with you is the double cheeseburger. The\n"
                            + "unicorn smells the cheeseburger, snorts in\n"
                            + "anger and disgust, and stabs you with its\n"
                            + "glittery horn in a single fatal blow.\n"
                            + "\n\nYOU LOSE!\n\n");
                } //display choice to go left and WIN
                else if (Fork == 2)
                {
                    System.out.print("\nYou have chosen to go left. \n\n"
                            + "After a few minutes, you come upon a tired and\n"
                            + "disgruntled-looking trail crew member, who\n"
                            + "accidentally packed for 7 days of meals, \n"
                            + "instead of 8. You hand her the hot double\n"
                            + "cheeseburger and she gratefully scarfs it\n"
                            + "down, then offers to carry your gear for the \n"
                            + "rest of your trip."
                            + "\n\nYOU WIN!!!!!\n\n");
                } //display narrative for any choice other than 1 or 2
                else
                {
                    System.out.println("\nThat wasn't a choice!!");
                }
            } //display choice of four-leafed clovers and ask question
            else if (leftItems == 2)
            {
                System.out.print("\nYou have chosen the bouquet of four-"
                        + "leafed clovers.\n\nAfter a few minutes, you come \n"
                        + "to another fork in the trail. One trail goes to \n"
                        + "the right and the other goes to the left. Enter 1 \n"
                        + "to go right or 2 to go left:  ");

                //collect answer
                Fork = Integer.parseInt(myScan.nextLine());

                //display choice to go right and WIN
                if (Fork == 1)
                {
                    System.out.print("\nYou have chosen to go right.\n\n"
                            + "After a few minutes, you come upon a beautiful\n"
                            + "unicorn. The unicorn looks hungry and sniffs\n"
                            + "at your hand still holding the bouquet of\n"
                            + "four-leafed clovers. You offer the four-leafed\n"
                            + "clovers to the unicorn (which happens to be\n"
                            + "its favorite food) and after munching happily,\n"
                            + "it offers you a flight on its back over the\n"
                            + "whole National Park. \n"
                            + "\n\nYOU WIN!!!!!\n\n");
                } //display choice to go left and LOSE
                else if (Fork == 2)
                {
                    System.out.print("\nYou have chosen to go left. \n\n"
                            + "After a few minutes, you come upon a tired and\n"
                            + "disgruntled-looking trail crew member, who\n"
                            + "accidentally packed for 7 days of meals, \n"
                            + "instead of 8. She sees the bouquet of four-\n"
                            + "leafed clovers in your hand and immediately\n"
                            + "writes you a ticket for picking plants within\n"
                            + "the Park. You protest that you found them\n"
                            + "already picked, and besides, they aren't even\n"
                            + "a native species! But she is so 'hangry' that\n"
                            + "she simply writes you a second ticket for \n"
                            + "arguing with her."
                            + "\n\nYOU LOSE!\n\n");
                } //display narrative for any choice other than 1 or 2
                else
                {
                    System.out.println("\nThat wasn't a choice!!");
                }
            } //display narrative for any choice other than 1 or 2
            else
            {
                System.out.println("\nThat wasn't a choice!!");
            }
        } //display narrative for any choice other than 1 or 2
        else
        {
            System.out.println("\nThat wasn't a choice!!");
        }

    }

    //function to calculate tax rate
    static void if_FigureTaxRate()
    {
        //display header
        System.out.println("\nYou have chosen to figure your tax rate.");

        //variable
        double ans = -1.0;
        double num = 0.0;

        //ask question
        System.out.print("\nPlease enter your annual income:  ");

        //collect answer
        num = Double.parseDouble(myScan.nextLine());

        //IF function to calculate tax based on income entry
        if (num <= 9275.0)
        {
            ans = num * .10;

            System.out.println("\nYour tax rate as a Single Filer is 10%, "
                    + "therefore, your tax is " + ans + ".");
        } else if (num > 9275.0 && num <= 37650.0)
        {
            ans = num * .15;

            System.out.println("\nYour tax rate as a Single Filer is 15%, "
                    + "therefore, your tax is " + ans + ".");
        } else if (num > 37650.0 && num <= 91150.0)
        {
            ans = num * .25;

            System.out.println("\nYour tax rate as a Single Filer is 25%, "
                    + "therefore, your tax is " + ans + ".");
        } else if (num > 91150.0 && num <= 190150.0)
        {
            ans = num * .28;

            System.out.println("\nYour tax rate as a Single Filer is 28%, "
                    + "therefore, your tax is " + ans + ".");
        } else if (num > 190150.0 && num <= 413350.0)
        {
            ans = num * .33;

            System.out.println("\nYour tax rate as a Single Filer is 33%, "
                    + "therefore, your tax is " + ans + ".");
        } else if (num > 413350.0 && num <= 415050.0)
        {
            ans = num * .35;

            System.out.println("\nYour tax rate as a Single Filer is 35%, "
                    + "therefore, your tax is " + ans + ".");
        } else
        {
            ans = num * .396;

            System.out.println("\nYour tax rate as a Single Filer is 39.6%, "
                    + "therefore, your tax is " + ans + ".");
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {

        //call menu function
        Menu();

    }

}
