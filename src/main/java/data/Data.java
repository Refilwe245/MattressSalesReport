/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author Student
 */



public class Data {

    String customerName = "";
    String selectedProduct = "";

    double productPrice;
    double Vat;
    double Commision;
    double totalsaleAmount;

    public void Calculate() {

        Vat = 0.15 * productPrice;

        Commision = 0.05 * productPrice;

        totalsaleAmount = productPrice + Vat + Commision;
    }
}
