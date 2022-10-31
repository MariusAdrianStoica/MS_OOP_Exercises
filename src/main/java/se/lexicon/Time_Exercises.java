package se.lexicon;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.lang.String;
import java.time.temporal.ChronoUnit;

public class Time_Exercises {

    public static void ex1(){
        /*Exercise 1:
        Create a LocalDate of the current day and print it out*/
        LocalDate currentDate = LocalDate.now();
        System.out.println("Local Date is : " + currentDate);
    }
    public static void ex2(){
        /*Exercise2:
         Create a LocalDate of the current day and print it out in the following pattern using
         DateTimeFormatter: Torsdag 29 mars.*/

        LocalDate currentDate = LocalDate.now();
        String CustomLocalDate = currentDate.format(DateTimeFormatter.ofPattern("eeee dd MMM"));
        System.out.println("Local Date is : " + CustomLocalDate);
    }
    public static void ex3(){
        /*Exercise3:
         Create a LocalDate of last Monday. Then print out the entire week in a loop using standard ISO
         format.*/

        LocalDate currentDate = LocalDate.now();
        LocalDate LastMonday = currentDate.minusDays(7);

        String LastMondayLocalDate = LastMonday.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Last Monday Local Date is : " + LastMondayLocalDate);
        System.out.println("Entire week in standard ISO format:");
        for (int i=0; i<7;i++){
            LocalDate nextDay = LastMonday.plusDays(i);
            String nextDayF = nextDay.format(DateTimeFormatter.ISO_DATE);
            System.out.println(nextDayF);
        }
    }
    public static void ex4(){
        /*Exercise 4:
        Create a LocalDate object from a String by using the .parse() method.*/

        int year  = (int) (Math.random()*(2022-1980+1)+1980);
        int month = 1+(int) (Math.random()*12);
        int day   = 1+(int) (Math.random()*7);
        String RandomDate;


        if (month<10){
            if (day<10){
                RandomDate = year+"-"+"0"+month+"-"+"0"+day;
            } else {
                RandomDate = year+"-"+"0"+month+"-"+day;
            }
        } else if (day<10){
                    RandomDate = year+"-"+month+"-"+"0"+day;
        } else {
            RandomDate = year+"-"+month+"-"+day;
        }
        LocalDate randomDate = LocalDate.parse(RandomDate);
        System.out.println("Local Date is : " + randomDate);
    }
    public static void ex5(){
        /*Exercise5
        The date time api provides enums for time units such as day and month.
        Create a LocalDate of 1945-05-08 and extract the day of week for that date.*/

        LocalDate customDateEx5 = LocalDate.parse("1945-05-08");
        DayOfWeek customData = customDateEx5.getDayOfWeek();

        System.out.println("Day of the week for date \"1945-05-08\" is : " + customData);
    }
    public static void ex6(){
        /*Exercise6
        Create a LocalDate of current date plus 10 years and minus 10 months.
        From that date extract the month and print it out. */

        LocalDate newDate =LocalDate.now().plusYears(10).minusMonths(10);
        Month month = newDate.getMonth();

        System.out.println("Current Date plus 10 years and minus 10 months is :  "+newDate);
        System.out.println("Month of the new date is : " + month);
    }
    public static void ex7(){
        /*Exercise7
        Using the LocalDate from exercise 6 and your birthdate, create a Period between
        your birthdate and the date from exercise 5. Print out the elapsed years, months and days. */

        LocalDate customDateEx5 = LocalDate.parse("1945-05-08");
        LocalDate myBirthday =LocalDate.parse("1980-07-24");
        Period period = Period.between(myBirthday, customDateEx5);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("Period between " + myBirthday + " and "+customDateEx5+" is: ");
        System.out.println(years + " years, " + months + " months, " + days + " days.");

    }
}
