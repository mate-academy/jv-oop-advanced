package org.example;

public class Rectangle extends Figure{
   private final double wight;
   private final double height;

   public Rectangle(String color, double wight, double height){
       super(color);
       this.wight = wight;
       this.height = height;
   }
   @Override
    public double getArea() {
       return height * wight;
   }


   @Override
   public void draw() {
       System.out.println("Figure: rectangle, area: " + getArea() +
               " sq. units, length: " + wight + " units, width: " +
               height + " units, color: " + getColor());
       }

   }

