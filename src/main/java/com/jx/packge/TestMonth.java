package com.jx.packge;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName TestMonth
 * @Description TODO
 * @Author
 * @Date 2022/7/13 11:17
 */
public class TestMonth {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        LocalDate date = LocalDate.now();
        LocalDate before = date.minusMonths(-1);
        System.out.println(before.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth());
        calendar.setTime(new Date());
        int max = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(max);
        System.out.println(max);
        System.out.println(max);
        System.out.println(max);
    }
}
