package PPackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeFormat {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat displayFormat = new SimpleDateFormat("kk:mm:ss ");
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ss a");
        Date date = parseFormat.parse("7:47:20 PM");
        System.out.println(parseFormat.format(date) + " = " + displayFormat.format(date));
        String s  = parseFormat.format(date);
    }
}
