package com.stackroute.pe3;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * Write a java program to calculate first and last date of a week.
 */

public class DateFirstLast {


    /*
     * computes the first and last date of the week and displays it on the comsole
     */

    public int dates() {

        Date date = new Date();
        int sub = 0;

        //selects the currnet day and stores the number for each day
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE");
        switch (simpleDateFormat.format(date).toUpperCase()){
            case "TUE" : sub = 1;break;
            case "WED" : sub = 2;break;
            case "THU" : sub = 3;break;
            case "FRI" : sub = 4;break;
            case "SAT" : sub = 5;break;
            case "SUN" : sub = 6;break;
        }

        System.out.println("DAY "+simpleDateFormat.format(date).toUpperCase());

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        date = new Date();

        //prints the first day of the week
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, (-sub));
        Date first_date = cal.getTime();
        System.out.println("Mon " + formatter.format(first_date));

        //prints the last day of the week
        cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, (6-sub));
        Date last_date = cal.getTime();
        System.out.println("Sun "+ formatter.format(last_date));

        return 1;
    }
}


