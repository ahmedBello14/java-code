/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.projectteam;

/**
 *
 * @author Mega Store
 */

import java.util.Scanner;
public class Projectteam {
  public static void main(String[] args) 
    {
        int p, q , z, x , y,k ,change= 0;
        boolean m=true;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter number of rows in matrix:");
        p = input.nextInt();
        System.out.print("Enter number of columns in matrix:");
        q = input.nextInt();
        int [][]a = new int[p][q];
        System.out.println("Enter all the elements of matrix:");
        for (int i = 0; i < p; i++) 
        {
            for (int j = 0; j < q; j++) 
            {
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("Given Matrix:");
 System.out.println("Given Matrix:");
        for (int i = 0; i < p; i++) 
        {
            for (int j = 0; j < q; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
