/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zadanie2;

/**
 *
 * @author Dominik
 */
public class Main {
    
    public static void main(String[] args)
    {
        Punkt2D p2 = new Punkt2D();
        Punkt3D p3 = new Punkt3D("2","4");
        p2.losowanie();
        p2.toString();
        
        p3.losowanie();
        p3.toString();
        
        Punkt2D array2D[] = new Punkt2D[100];
        Punkt3D array3D[] = new Punkt3D[100];
        
        for(int i = 0;i<100;i++)
        {
            array2D[i].losowanie();
            array3D[i].losowanie();
        }
        
        for(int i = 0;i<100;i++)
        {
            for(int j = 0;j<100;j++)
            {
                if(array2D[i].toString().equals(array3D[i].toString().substring(0,3)))
                    System.out.println(array2D[i].getX()+" "+array2D[i].getY());
            }
        }
        
       
        
    }
    
}
