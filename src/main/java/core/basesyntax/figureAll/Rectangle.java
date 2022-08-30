package core.basesyntax.figureAll;

import core.basesyntax.Figure;
import core.basesyntax.FigureOptions;

public class Rectangle extends Figure implements FigureOptions {

    private double aLength;
    private double bWindth;

    public Rectangle(double aLength, double bWindth) {
        this.aLength = aLength;
        this.bWindth = bWindth;
    }

    public Rectangle(String name, String color, double aLength, double bWindth) {
        super(name, color);
        this.aLength = aLength;
        this.bWindth = bWindth;
    }

    @Override
    public double areaFigura() {
        return aLength * bWindth;
    }

    @Override
    public void infoFigure() {
        System.out.println("name= " + name + ", color= " + color + ", area= " + areaFigura() + " unit sq., Length A=" + aLength + " unit sq., Windth B= " + bWindth + " unit sq.");
    }
}
