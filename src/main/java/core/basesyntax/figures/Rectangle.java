package core.basesyntax.figures;

import core.basesyntax.AreaCalculator;
import core.basesyntax.Figure;

public class Rectangle extends Figure implements AreaCalculator {

    private double linelength;
    private double lineWindth;

    public Rectangle(double linelength, double lineWindth) {
        this.linelength = linelength;
        this.lineWindth = lineWindth;
    }

    public Rectangle(String name, String color, double linelength, double lineWindth) {
        super(name, color);
        this.linelength = linelength;
        this.lineWindth = lineWindth;
    }

    @Override
    public double areaFigura() {
        return linelength * lineWindth;
    }

    @Override
    public void infoFigure() {
        System.out.println("name= " + name + ", color= " + color + ", area= " + areaFigura()
                + " unit sq., Length A=" + linelength + " unit sq., Windth B= " + lineWindth + " unit sq.");
    }
}
