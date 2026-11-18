/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresssalesreport.Q2;

/**
 *
 * @author Student
 */



import java.util.Scanner;

public class ProductCalculations implements IProductCalculations {

    double productPrice;
    double Vat;
    double Commision;

    public ProductCalculations(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public double GetVat() {
        double vat = 0.15 * productPrice;
        return vat;
    }

    @Override
    public double GetCommission() {
        double commision = 0.05 * productPrice;
        return commision;
    }

    @Override
    public double GetTotal() {
        double getTotal = productPrice + GetVat() + GetCommission();
        return getTotal;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter product price: ");
        double productPrice = input.nextDouble();

        ProductCalculations calculation =
                new ProductCalculations(productPrice);

        System.out.println("VAT: R" + calculation.GetVat());
        System.out.println("Commission: R" + calculation.GetCommission());
        System.out.println("Total: R" + calculation.GetTotal());
    }
}

