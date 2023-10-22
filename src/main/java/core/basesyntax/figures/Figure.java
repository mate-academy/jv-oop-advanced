package core.basesyntax.figures;

import core.basesyntax.enums.Color;
import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.Draw;

import java.text.DecimalFormat;

public class Figure implements AreaCalculator, Draw {
    protected String color;
    protected String name;
    protected double area;
    private final DecimalFormat format = new DecimalFormat("#.##");

    public Figure() {
        this.color = null;
        this.name = "";
        this.area = 0.0;
    }

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color.name().toLowerCase();
    }

    public double getArea() {
        return this.area;
    }

    public String drawFigure() {
        return "Figure: " + getName()
                + ", color: " + getColor()
                + ", area: " + format.format(getArea())
                + " sq. units, ";
    }

    @Override
    public void findArea() {
        area = 0;
    }
}
