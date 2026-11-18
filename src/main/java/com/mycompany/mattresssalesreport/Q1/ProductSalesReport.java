/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresssalesreport.Q1;

/**
 *
 * @author Student
 */
public class ProductSalesReport {

    public static void main(String[] args) {

        Product product = new Product();
        PrintProduct printer = new PrintProduct();

        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println();

        printer.PrintTotalProductSales(
            product.GetTotalProductsSold()
        );

        printer.PrintAverageProductSales(
            product.GetAverageProductSold()
        );

        printer.PrintMostPopularProduct(
            product.GetMostPopularProduct()
        );
    }
}

    

