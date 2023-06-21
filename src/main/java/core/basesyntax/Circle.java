package core.basesyntax;

import java.text.DecimalFormat;

public class Circle extends Figure {
    private double radius;
    
    public Circle(double radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public void draw() {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        System.out.println("Figure: circle, area: "
                + decimalFormat.format(getArea())
                + " sq.units, radius: "
                + (int) radius
                +
                " units, color: "
                + color);
    }
}
