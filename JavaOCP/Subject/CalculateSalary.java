package Subject;

import java.util.Scanner;

public class CalculateSalary {
    /*
     * 解題 :
     * 題目 :
     * 時薪120,超過60小時算1.2倍時薪,超過90小時算1.5倍時薪
     * 計算總薪資
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入你的時薪: ");
        int salary = sc.nextInt();
        System.out.print("請輸入你的工時: ");
        int hoursPerMonth = sc.nextInt();
        printTotalSalary(salary, hoursPerMonth);
        sc.close();
    }

    public static void printTotalSalary(int salary, int hours) {
        double total = 0;
        if (hours <= 60 && hours >= 0) {
            total = hours * salary;
        } else if (hours <= 80) {
            total = 60 * salary + (hours - 60) * salary * 1.2;
        } else {
            total = (60 + 20 * 1.2) * salary + (hours - 80) * salary * 1.5;
        }
        if (hours < 0 || salary<0) {
            System.out.printf("時薪/工時不能為負的: [%d,%d]",hours,salary);
        } else {
            System.out.printf("時薪: %d, 工時: %d, 薪水總額: %.0f", salary, hours, total);
        }
    }
}
