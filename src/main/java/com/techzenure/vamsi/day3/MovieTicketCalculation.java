package com.techzenure.vamsi.day3;


import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class MovieTicketCalculation{
    private static DecimalFormat df=new DecimalFormat("0.00");
    public static void main (String[] args) {
         int no,refe,total =0;
         double cost,sum,sum1=0,sum2,sum3=0;
         String ref,co,circle;
         Scanner s = new Scanner(System.in);
         System.out.print("Enter the no of ticket:");
         no=s.nextInt();
         if(no>=5 && no<=40){

         System.out.print("Do you want refreshment:");
         ref=s.next();
         System.out.print("Do you have coupon code:");
         co=s.next();
         System.out.print("Enter the circle:");
         circle=s.next();
         if(circle.equals("k") || circle.equals("q")) {
         if(circle.equals("k")){
             total=no*75;
         } else if (circle.equals("q")){
             total=no*150;
         }
         //else{
          //   System.out.println("Invalid Input");
        // }
         //System.out.println(total);
         if(no>20){
             sum=((0.1)*total);
             sum1=total-sum;
             //System.out.println(sum1);
         }
         else{
             cost=total;
         }
             if(co.equals("y")){
                 sum2=((0.02)*sum1);
                 sum3=sum1-sum2;
                //System.out.println(sum3);
             }
             else{
                 cost=sum1;
             }
                 if(ref.equals("y")){
                     refe=no*50;
                     cost=sum3+refe;
                     System.out.println(cost);
                 }else{
                     cost=sum3;
                 }




            // System.out.println(cost);

             System.out.println("Ticket cost:" + df.format(cost));
         }

         else{
             System.out.println("Invalid Input");
         }}
         else{
             System.out.println("Minimum of 5 and Maximum of 40 Tickets");
         }

             }}
