package core.basesyntax.figureAll;

import core.basesyntax.Figure;
import core.basesyntax.FigureOptions;

public class IsoscelesTrapezoid extends Figure implements FigureOptions {

    private double aLength ;
    private double bLength ;
    private double hight ;

    public IsoscelesTrapezoid() {}

    public IsoscelesTrapezoid(double aLength, double bLength, double hight) {
        this.aLength = aLength;
        this.bLength = bLength;
        this.hight = hight;
    }

    public IsoscelesTrapezoid(String name, String color, double aLength, double bLength, double hight) {
        super(name, color);
        this.aLength = aLength;
        this.bLength = bLength;
        this.hight = hight;
    }

    @Override
    public double areaFigura() {
        return (aLength + bLength) * hight / 2;
    }

    @Override
    public void infoFigure() {
        System.out.println("name= " + name + ", color= " + color + ", area= " + areaFigura() + " unit sq., Length A=" + aLength + " unit sq., Length B= " + bLength + " unit sq." + " " + hight + " unit sq.");
    }
}
