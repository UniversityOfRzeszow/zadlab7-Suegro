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
public class Punkt3D extends Punkt2D{
    
    private String z;
    
    public Punkt3D(String x, String y)
    {
        super(x, y);
        this.z = "0";
    }

    public Punkt3D(String x, String y, String z) {
        super(x, y);
        this.z = z;
    }

    public String getZ() {
        return z;
    }

    public void setZ(String z) {
        this.z = z;
    }
       
    @Override
    public void losowanie()
    {
        int a = r.nextInt(21)-10;
        int b = r.nextInt(21)-10;
        int c = r.nextInt(21)-10;
        
        setX(Integer.toString(a));   
        setY(Integer.toString(b));  
        setZ(Integer.toString(c));
    }    
    
    @Override
    public String toString()
    {
        System.out.println("x = "+getX()+" y = "+getY()+" z = "+getZ());
        return getX()+ " "+getY()+" "+getZ();
    }
    
}
