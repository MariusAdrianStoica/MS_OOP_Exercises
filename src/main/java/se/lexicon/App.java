package se.lexicon;


import java.util.Scanner;
import java.util.InputMismatchException;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Time Exercises" );
        System.out.println("-------------------------------");
        //Scanner scanner = new Scanner(System.in);
        while (true) {
            Menu.menu();
            System.out.print("Please enter a number between 1 and 17:");
            switch (getInputNumber()) {
                case 1: //Local Date
                    Time_Exercises.ex1();
                    //System.out.println("exercise 1");
                    break;
                case 2: //Local date by Custom format
                    Time_Exercises.ex2();
                    break;
                case 3: //Last Monday && Entire week
                    Time_Exercises.ex3();
                    break;
                case 4: // LocalDate .parse()
                    Time_Exercises.ex4();
                    break;
                case 5: // Day of the week
                    Time_Exercises.ex5();
                    break;
                case 6: // Month
                    Time_Exercises.ex6();
                    break;
                case 7: //Period
                    Time_Exercises.ex7();
                    break;
                case 8: // Find full name

                    /*System.out.println("Enter a Name to find: ");
                    Scanner sc8= new Scanner(System.in);
                    fullName = sc8.nextLine();
                    if (NameRepository.find(fullName) == null) {
                        System.out.println("Error : no match! ");
                        System.out.print(NameRepository.find(fullName)+" ");
                        System.out.println(" Name was not find");
                    }else {
                        System.out.println(NameRepository.find(fullName)+"exists in the array");
                        System.out.println(" Find OP Done");
                    }*/
                    break;
                case 9: // display
                    //System.out.println(Arrays.toString(NameRepository.findAll()));
                    break;
                case 0:
                    System.out.println(" Have a good day! ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\t\texercise number is not valid");
                    break;
            }
        } // while
    } // main
    public static int getInputNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("\t\tenter a valid number between 1-17");
        }

        return number;
    }





} // class




