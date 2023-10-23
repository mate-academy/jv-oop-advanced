package core.basesyntax.figures;

import core.basesyntax.enums.Color;
import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.Drawable;
import java.text.DecimalFormat;

public class Figure implements AreaCalculator, Drawable {
    protected String color;
    protected String name;
    protected final DecimalFormat format = new DecimalFormat("#.##");

    public Figure(String name, Color color) {
        this.name = name;
        this.color = color.name().toLowerCase();
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

    public void draw() {
        System.out.println("Figure: " + getName()
                + ", color: " + getColor()
                + ", area: " + format.format(getArea())
                + " sq. units, ");
    }

    @Override
    public double getArea() {
        return 0.0;
    }
}
