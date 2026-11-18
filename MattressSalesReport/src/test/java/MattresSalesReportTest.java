/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */

package com.mycompany.mattresssalesreport.Q1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MattresSalesReportTest{
    Product product = new Product();

    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {

        int expected = 153;

        int actual = product.GetTotalProductsSold();

        assertEquals(expected, actual);
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {

        double expected = 153.0 / 9;

        double actual = product.GetAverageProductSold();

        assertEquals(expected, actual, 0.01);
    }
}
