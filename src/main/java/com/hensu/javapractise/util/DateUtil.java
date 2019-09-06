package com.hensu.javapractise.util;

import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.UUID;

/**
 * @Author: sh
 * @Description: DateUtil
 * @Date: 23:52 2019/7/18
 */
public class DateUtil {

    public static Long getMilliSecond() {
        Long milliSecond = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();
        return milliSecond;
    }

    public static String getTimeStamp() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String dateTime = LocalDateTime.now(ZoneOffset.of("+8")).format(formatter);
        return dateTime;
    }

    public static String getNowMilli() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
        String dateTime = LocalDateTime.now(ZoneOffset.of("+8")).format(formatter);
        return dateTime;
    }

    public static String get32UUIDMilli() {
        return (getNowMilli() + UUID.randomUUID().toString().replace("-", "")).substring(0, 32);
    }

    public static String get64UUIDMilli() {
        String sb = UUID.randomUUID().toString().replace("-", "");
        return get32UUIDMilli() + sb;
    }

    public static String milliToDate(long milli, String format) {
        Date date = new Date();
        date.setTime(milli);
        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(date);
    }


    public static synchronized Date stToDate(String val, String format) {
        if (StringUtils.isEmpty(val)) {
            return null;
        }
        SimpleDateFormat sf = new SimpleDateFormat(format);
        try {
            return sf.parse(val);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(getNowMilli().length());
        System.out.println(get32UUIDMilli().length());
        System.out.println(get64UUIDMilli().length());
        System.out.println(milliToDate(getMilliSecond(), "yyyy-MM-dd hh:mm:ss"));
        System.out.println(getTimeStamp());

    }
}
