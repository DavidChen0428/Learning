package Concept;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
 *  時間物件 : 
 *  LocalDate -> 日期
 *  LocalTime -> 時間
 *  LocalDateTime -> 日期加時間
 *  DateTimeFormatter -> 可以對日期或是時間表示做更改
 */

public class DateAndTime {
    public static void main(String[] args) {
        LocalDate localDateObj=LocalDate.now();
        LocalTime localTimeObj=LocalTime.now();
        LocalDateTime localDateTimeObj=LocalDateTime.now();

        System.out.printf("Before Format: %s\n", localDateObj);
        System.out.printf("Before Format: %s\n", localTimeObj);
        System.out.printf("Before Format: %s\n", localDateTimeObj);
        
        System.out.println("----------");
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime=localDateTimeObj.format(formatter);
        System.out.printf("After Format: %s\n", formattedDateTime);


    }
}
