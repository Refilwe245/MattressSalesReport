/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresssalesreport.Q1;

/**
 *
 * @author Student
 */


public class Product implements IProduct {

    private String[] products = {
        "Cosy Nights Monarch",
        "Restonic Barbados",
        "Sealy Phuket"
    };

    private int[][] sales = {
        {25, 18, 20},
        {15, 10, 12},
        {18, 15, 20}
    };

    @Override
    public int GetTotalProductsSold() {
        int total = 0;

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
        }

        return total;
    }

    @Override
    public double GetAverageProductSold() {
        return (double) GetTotalProductsSold() / 9;
    }

    @Override
    public String GetMostPopularProduct() {
        int highestSales = 0;
        String popularProduct = "";

        for (int i = 0; i < sales.length; i++) {
            int productTotal = 0;

            for (int j = 0; j < sales[i].length; j++) {
                productTotal += sales[i][j];
            }

            if (productTotal > highestSales) {
                highestSales = productTotal;
                popularProduct = products[i];
            }
        }

        return popularProduct + " (" + highestSales + ")";
    }
}





