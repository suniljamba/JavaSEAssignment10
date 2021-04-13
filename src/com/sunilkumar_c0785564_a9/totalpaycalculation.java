package com.sunilkumar_c0785564_a9;

public class totalpaycalculation {
}
import java.util.Scanner;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your sales of each month : ");
        double sales = sc.nextDouble();

        double rateofcommision=0.0;
        if(sales>=0 &&sales < 10000)
        {
            rateofcommision = 5.0;
        }
        else if(sales>=10000 && sales<15000)
        {
            rateofcommision = 10.0;
        }
        else if(sales>=15000 && sales < 18000)
        {
            rateofcommision = 12.0;
        }
        else if(sales>=18000 && sales < 22000)
        {
            rateofcommision = 15.0;
        }
        else if(sales >=22000 )
        {
            rateofcommision = 16.0;
        }
        else
        {
            System.out.println("sales is not supposed to be (-) negative!\nExiting...........");
            System.exit(1);
        }
        System.out.print("PLEASE ENTER THE PAY WHICH IS GIVEN IN ADVANCE : ");
        double advance = sc.nextDouble();
        double commission = rateofcommision * sales / 100;
        double grossPay = commission - advance;
        System.out.println(" YOUR AMOUNT OF Commission IS : $"+commission);
        if(grossPay > 0)
        {
            System.out.println("ONCE THE MONTH COMPLETED, A check WILL BE RECEIVED of $"+grossPay+" from the company.");
        }
        else if(grossPay<0)
        {
            System.out.println("ONCW THE MONTH IS COMPLETED , you HAVE TO PAY BACK $"+(grossPay*-1)+" to the company.");
        }
        else{
            System.out.println(" SORRY NO PAY CHEQUE");
        }

    }