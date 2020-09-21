/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_java_git;

import java.time.*;
import java.time.temporal.*;

/**
 *
 * @author sg
 */
public class Clock {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        LocalDateTime now = LocalDateTime.now();
        int hour = now.get (ChronoField.HOUR_OF_DAY);
        int minute = now.get (ChronoField.MINUTE_OF_HOUR);
        int month = now.get (ChronoField.MONTH_OF_YEAR);
        int day = now.get (ChronoField.DAY_OF_MONTH);
        int year = now.get (ChronoField.YEAR);
        
        //System.out.println(((hour<12)?"Good Morning":(hour<17)"Good day":(hour>17)"Good Evning"));
        if (hour<12) System.out.println("Доброе утро");
        else if (hour<17) System.out.println("Добрый день");
        else System.out.println("Добрый вечер");
   
        System.out.print("Сейчас " + hour + ((hour!=1 & hour!=21)?" часа(часов) ":" час "));
        
        if (minute != 0)

        System.out.print (minute) ;
        System.out.print( (minute != 1 & minute != 21 &
        minute != 31 & minute != 41 & minute != 51) ? " минуты (минут)" :" минута");
        
        System.out.print("\n" + day +" ") ;
// Название месяца 
        switch (month) {
            case 1: System.out.print("янвapя") ; break;
            case 2:System.out .print ("февраля") ; break;
            case 3: System.out.print("мapтa") ; break;
            case 4: System.out.print("aпpeля") ; break;
            case 5: System.out.print("мaя") ; break;
            case 6: System.out.print("июня") ; break;
            case 7: System.out.print("июля") ; break;
            case 8: System.out.print ("августа") ; break;
            case 9: System.out.print ("ceнтябpя") ; break;
            case 10: System.out.print("oктябpя") ; break;
            case 11: System.out.print ("ноября") ; break;
            case 12: System.out.print ("дeкaбpя") ;
        }
        System.out.println(" " + year + " год") ;
    }
}
