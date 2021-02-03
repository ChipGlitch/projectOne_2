package com.company;
import javax.swing.*;


public class Main {

    public static void main(String[] args) {
        // Assignment One: Zach Chiappini

        Object[] employees = {"Calculator","Zach",
                "Joel",
                "Billy", "Ally"};

        int n = JOptionPane.showOptionDialog(null,
                "Please select an employee to begin.",
                "Selection",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                employees,
                employees[0]);

        while (n >= -100) {
         String hoursWorked_Str = JOptionPane.showInputDialog("How many hours did the employee work this week?");
         double hoursWorked = Integer.parseInt(hoursWorked_Str);
         String pay_Rate_Per_Hour_Str = JOptionPane.showInputDialog("What is this employees hourly wage?");
         int pay_Rate_Per_Hour = Integer.parseInt(pay_Rate_Per_Hour_Str);
         String number_Of_Dependents_Str = JOptionPane.showInputDialog("How many dependents does this employee have?");
         int number_Of_Dependents = Integer.parseInt(number_Of_Dependents_Str);
         double grossPay = (hoursWorked * pay_Rate_Per_Hour);
         double stateTax = ((grossPay - 200) * .06);
         int localTax = (10 - (number_Of_Dependents * 2));
         double federalTax = ((grossPay - stateTax - localTax) * .1);
         double take_Home_Pay = grossPay - stateTax - localTax - federalTax;

            JOptionPane.showMessageDialog(null, "Results for Employee: " + "Gross Pay: $" + grossPay + " State Tax: $" + stateTax + " " + "Local Tax: $" + localTax + " " + "Federal Tax: $" + federalTax + " Take home pay: $" + take_Home_Pay);

            System.out.println("Results for Employee:");
            System.out.println();
            System.out.println("Gross Pay: $" + grossPay);
            System.out.println();
            System.out.println("State Tax: $" + stateTax + " "
                 + "Local Tax: $" + localTax + " "
                 + "Federal Tax: $" + federalTax);
            System.out.println();
            System.out.println("Take home pay: $" + take_Home_Pay);



         int main_Menu = JOptionPane.showOptionDialog(null,
                 "Please select an employee to begin.",
                 "Selection",
                 JOptionPane.YES_NO_CANCEL_OPTION,
                 JOptionPane.QUESTION_MESSAGE,
                 null,
                 employees,
                 employees[0]);


        }

        {

        }

    }
}
