package core.basesyntax;

import java.text.DecimalFormat;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Double.parseDouble(new DecimalFormat("##.##").format(Math.PI * radius * radius));
    }

    @Override
    public void draw() {

        System.out.println("Figure: circle, area: "
                + getArea() + " sq. units, color: " + getColor());
    }
}
