package TanXin;

import com.sun.org.apache.bcel.internal.generic.SIPUSH;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Demo {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
//        Calendar calendar = Calendar.getInstance();
        Calendar calendar = new GregorianCalendar(2021, 0, 1);
        calendar.add(5,30);
        System.out.println(calendar);
        Date date1 = calendar.getTime();
        String news = sdf.format(date1);
        System.out.println(news);
    }
}
