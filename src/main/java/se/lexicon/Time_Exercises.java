package se.lexicon;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.lang.String;
//import java.time.temporal.ChronoUnit;

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
        System.out.println("Local Random Date is : " + randomDate);
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

        System.out.println("Period between "+ myBirthday + " and "+customDateEx5+" is: ");
        System.out.println(years + " years, " + months + " months, " + days + " days.");

    }
    public static void ex8(){
        /*Exercise 8
        Create a period of 4 years, 7 months and 29 days.
        Then create a LocalDate of current date and add the period you created to the current date.*/
        int numberOfYears = 4;
        int numberOfMonths = 7;
        int numberOfDays = 29;

        Period period = Period.of(numberOfYears,numberOfMonths,numberOfDays);

        LocalDate currentDate = LocalDate.now();
        LocalDate newDate = currentDate.plus(period);
        System.out.println("Local Date is : " + currentDate+" and after adding 4 years, 7 months and 29 days\n  new date is : "+ newDate);
    }
    public static void ex9(){
        /*Exercise 9
        Create a LocalTime object of the current time*/
        LocalTime currentTime = LocalTime.now();
        System.out.println("Local Time is : " + currentTime);
    }
    public static void ex10(){
        /*Exercise 10
        Extract the nanoseconds of a LocalTime object of current time. Print out the nanoseconds.*/
        LocalTime currentTime = LocalTime.now();
        System.out.println("Local Time is : " + currentTime + "\nand nanoseconds of current time is: " + currentTime.getNano());

    }
    public static void ex11(){
        /*Exercise 11
        Create a LocalTime object from a String using the .parse() method*/

        int hour  = (int) (Math.random()*(23-0+1)+0);
        int minute = 1+(int) (Math.random()*60);
        int second   = 1+(int) (Math.random()*60);

        String hourS = Integer.toString(hour);
        String minuteS = Integer.toString(minute);
        String secondS = Integer.toString(second);

        if (hourS.length()<2){
            hourS = "0"+hourS;
        }
        if (minuteS.length()<2){
            minuteS = "0"+minuteS;
        }
        if (secondS.length()<2){
            secondS = "0"+secondS;
        }
        String RandomTime = hourS+":"+minuteS+":"+secondS;
        LocalTime randomTime = LocalTime.parse(RandomTime);
        System.out.println("Local Random Time is : " + randomTime);
        }
    public static void ex12(){
        /*Exercise 12
        Using DateTimeFormatter format LocalTime from current time and
        print it out as following pattern: 10:32:53.*/

        LocalTime currentTime = LocalTime.now();
        System.out.println("Local Time is : " + currentTime);

        System.out.println("Local Time format is : " + currentTime.format(DateTimeFormatter.ofPattern("H:m:s")) );
    }
    public static void ex13(){
        /*Exercise 13
        Create a LocalDateTime with the date and time components as:
        date: 2018-04-05, time: 10.00*/

        LocalDateTime localDateTime = LocalDateTime.of(2018,4,5,10,0);
        System.out.println("Local DateTime is : " + localDateTime);
    }
    public static void ex14(){
        /*Exercise 14
        Using DateTimeFormatter format the LocalDateTime object from exercise 11 to a String
        that should look tile this: torsdag 5 april 10:00*/

        LocalDateTime localDateTime = LocalDateTime.of(2018,4,5,10,0);

        System.out.println("Local DateTime format is : " + localDateTime.format(DateTimeFormatter.ofPattern("eeee d MMMM H:mm")));

    }
    public static void ex15(){
        /*Exercise 15
        Create a LocalDateTime object by combining LocalDate object and LocalTime object*/

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(localDate,localTime);

        System.out.println("Local Current DateTime is : " + localDateTime);

    }
    public static void ex16(){
        /*Exercise 16
        Create a LocalDateTime object. Then get the LocalDate and LocalTime components into separate
        objects of respective types from the LocalDateTime object.*/


        //LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Current System Date/time is : " + localDateTime);
        LocalDate localDate = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();

        System.out.println("LocalDate is : " + localDate+" and LocalTime is : " + localTime);

    }


}
