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
       
        while (m==true) 

        {
            System.out.println("Enter 1 to interchange rows");
            System.out.println("Enter 2 to interchange columns");
            System.out.println("Enter 3 to Exit");
            z=input.nextInt();

 switch (z) 
            {
                case 1:
                System.out.println("Enter the row numbers:");
                x = input.nextInt();
                y = input.nextInt();
                for(int i = 0; i < p; i++)
                {
                    change = a[(x-1)][i];
                    a[x-1][i] = a[y-1][i];
                    a[y-1][i] = change;
                }
                System.out.println("Matrix after interchanging rows:"+x +" and "+y);
                for (int i = 0; i < p; i++) 
                {
                    for (int j = 0; j < q; j++) 
                    {
                        System.out.print(a[i][j] + " ");
                    }
                System.out.println("");
                }
                break;
case 2:
                System.out.println("Enter the column numbers:");
                x = input.nextInt();
                y = input.nextInt();
                for(int i = 0; i < p; i++)
                {
                    change = a[i][(x-1)];
                    a[i][x-1] = a[i][(y-1)];
                    a[i][y-1] = change;
                }
                System.out.println("Matrix after interchanging columns:"+x +" and "+y);
                for (int i = 0; i < p; i++) 
                {
                    for (int j = 0; j < q; j++) 
                    {
                        System.out.print(a[i][j] + " ");
                    }
                System.out.println("");
                }
                break;
          	case 3:
                    System.out.print("Exit program");
              m=false;
              
            }
        }
    }
}
