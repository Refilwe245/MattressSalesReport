/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
package com.mycompany.mattresssalesreport.Q2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductCalculationsTest {

    @Test
    public void GetVat_WithValidPrice_ReturnsCorrectValue() {

        ProductCalculations calculation = new ProductCalculations(1000);

        assertEquals(150.0, calculation.GetVat(), 0.01);
    }

    @Test
    public void GetCommission_WithValidPrice_ReturnsCorrectValue() {

        ProductCalculations calculation = new ProductCalculations(1000);

        assertEquals(50.0, calculation.GetCommission(), 0.01);
    }

    @Test
    public void GetTotal_WithValidPrice_ReturnsCorrectValue() {

        ProductCalculations calculation = new ProductCalculations(1000);

        assertEquals(1200.0, calculation.GetTotal(), 0.01);
    }
}

    

