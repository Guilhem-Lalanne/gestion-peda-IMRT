/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import vue.FenetreAcceuilPrincipal;

/**
 *
 * @author Mateusz
 */
public class Agenda {
    
    public static String getDate(Calendar c) {
        return new SimpleDateFormat("dd/MM/yyyy").format(c.getTime());
    }
    
    public static String getWeek(Calendar c) {
        
        return String.valueOf(c.get(Calendar.WEEK_OF_YEAR));
    }
    
    public static void setNextWeek(Calendar c) {
        c.add(Calendar.DATE, 7);
    }
    
    public static void setPreviousWeek(Calendar c) {
        c.add(Calendar.DATE, -7);
    }
    
    public static String getCurrentWeek() {
        
        String timeStampSemaine = new SimpleDateFormat("yyyyMMdd").
                       format(Calendar.getInstance().getTime());
        
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        Date date = null;
        
        try {
            date = df.parse(timeStampSemaine);
        } catch (ParseException ex) {
            Logger.getLogger(FenetreAcceuilPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        return String.valueOf(cal.get(Calendar.WEEK_OF_YEAR));
    }
    
    public static String getCurrentDate() {
        
        return new SimpleDateFormat("dd/MM/yyyy").
                    format(Calendar.getInstance().getTime());
    }
}
