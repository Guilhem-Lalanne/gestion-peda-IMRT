/**
 * C'est une classe avec des outils 
 */
package appli;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Mateusz
 */
public class tools {
    
    public static void debug(String msg) {
        System.out.println(msg);
    }

    public static void debug(boolean result) {
        System.out.println("Result: " + result);
    }

    public static void debug(int result) {
        System.out.println("Result: " + result);
    }
    
    public static String convertIntToHour(int h) throws ParseException {
        
        String dateStr = h+":00";
        SimpleDateFormat curFormater = new SimpleDateFormat("H:m"); 
        Date dateObj = curFormater.parse(dateStr); 
        SimpleDateFormat postFormater = new SimpleDateFormat("HH:mm"); 

        String newDateStr = postFormater.format(dateObj);
        
        return newDateStr;
    }
    
}
