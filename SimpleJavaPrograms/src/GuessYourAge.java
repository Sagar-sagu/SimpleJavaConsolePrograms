package src;

import java.util.Scanner;
import java.time.LocalDate;

public class GuessYourAge
{
  //take System Date
  static int currentDay;
  static int currentMonth;
  static int currentYear;
  //Take User Date
  static int day;
  static int month;
  static int year;
  //stored Age calucalted
  static int usrDay;
  static int usrMonth;
  static int usrYear;

  static void TakeCurrentDate()
  {
    LocalDate currentDate = LocalDate.now();
    // Get cuurent year
    currentYear = currentDate.getYear();
    // Get current month
    currentMonth = currentDate.getMonthValue();
    // Get current day
    currentDay = currentDate.getDayOfMonth();
  }
  static void calucalteUserAge()
  {
    usrDay = currentDay-day;
    usrMonth = currentMonth-month;
    usrYear = currentYear-year;
  }

  public static void Main()
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Day");
    day = scan.nextInt();
    System.out.println("Enter Month");
    month = scan.nextInt();
    System.out.println("Enter Year");
    year = scan.nextInt();

    TakeCurrentDate();
    calucalteUserAge();

    System.out.println("You are " + usrYear + " Year " + usrMonth + " Month " + usrDay + " Day old");
  }
}
