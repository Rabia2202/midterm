/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package days;

import java.util.Scanner;

/**This class takes String input from user 
 * and calls method  to print the 
 * name of the day.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the week day names. 
 *
 * @author Rabiadeep kaur
 */public class Days {
    public static void main(String[] args) {
        // Print all the day names using enums
        Weekdays weekdays = new Weekdays();
        for (DayOfWeek day : DayOfWeek.values()) {
            weekdays.nameOfDay(day);
        }
    }
}
