package core.basesyntax.figureAll;

import core.basesyntax.Figure;
import core.basesyntax.FigureOptions;

public class Circle extends Figure implements FigureOptions {

     private double radius;

     public Circle(){}

     public Circle(double radius) {
         this.radius = radius;
     }

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public  double areaFigura() {
        return Math.PI * radius;
    }

    @Override
    public void infoFigure() {
        System.out.println("name= " + name + ", color= " + color + ", area= " + areaFigura() + " unit sq., radius=" + radius );
    }

}
