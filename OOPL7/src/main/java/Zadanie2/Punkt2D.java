/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zadanie2;
import java.util.Random;
/**
 *
 * @author Dominik
 */
public class Punkt2D {
    
    private String x;
    private String y;
    Random r = new Random();
    
    Punkt2D()
    {
        this.x = "0";
        this.y = "0";
    }
    
    Punkt2D(String x,String y)
    {
        this.x = x;
        this.y = y;
    }

    public String getX() {
        return x;
    }

    public String getY() {
        return y;
    }

    public void setX(String x) {
        this.x = x;
    }

    public void setY(String y) {
        this.y = y;
    }
    
    public void losowanie()
    {
        int a = r.nextInt(21)-10;
        int b = r.nextInt(21)-10;
        setX(Integer.toString(a));
        setY(Integer.toString(b));
    }
    
    @Override
    public String toString()
    {
        System.out.println("x = "+getX()+" y = "+getY());
        return getX()+" "+getY();
    }
    
    
    
}
