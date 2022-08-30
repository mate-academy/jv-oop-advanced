package core.basesyntax.figureAll;

import core.basesyntax.Figure;
import core.basesyntax.FigureOptions;

public class Square extends Figure implements FigureOptions {

     private double aLength;

     public Square(){}

    public Square(double aLength) {
        this.aLength = aLength;
    }

    public Square(String name, String color, double aLength) {
        super(name, color);
        this.aLength = aLength;
    }

    @Override
    public double areaFigura() {
        return aLength * aLength;
    }

    @Override
    public void infoFigure() {
        System.out.println("name= " + name + ", color= " + color + ", area= " + areaFigura() + " unit sq., Length A=" + aLength + " unit sq.");
    }
}
