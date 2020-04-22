package abc.geettime.alg.dimension.mess;

import cn.hutool.core.date.DateUtil;

import java.util.Calendar;
import java.util.Date;

/**
 * @author ：cong_zhang.
 * @date ：Created in 15:47 2020/4/20
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
public class DateDiff {

    public static void main(String[] args) {
        Date date1 = DateUtil.parseDate("2020-01-01");
        Date date2 = DateUtil.parseDate("2019-12-25");
        int res = differentDays(date2 , date1);
        System.out.println(res);
    }

    public static int differentDays(Date date1, Date date2){
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);

        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        int day1= cal1.get(Calendar.DAY_OF_YEAR);
        int day2 = cal2.get(Calendar.DAY_OF_YEAR);

        int year1 = cal1.get(Calendar.YEAR);
        int year2 = cal2.get(Calendar.YEAR);
        if(year1 != year2)  { //同一年
            int timeDistance = 0 ;
            for(int i = year1 ; i < year2 ; i ++){
                if(i%4==0 && i%100!=0 || i%400==0) {   //闰年
                    timeDistance += 366;
                }else { //不是闰年
                    timeDistance += 365;
                }
            }
            return timeDistance + (day2-day1) ;
        }
        else{   //不同年
            System.out.println("判断day2 - day1 : " + (day2-day1));
            return day2-day1;
        }
    }
}
