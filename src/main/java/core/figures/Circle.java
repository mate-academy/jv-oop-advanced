package core.figures;

import java.text.DecimalFormat;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * 2;
    }

    @Override
    public String draw() {
        return "Figure: Circle;\n"
                + "Radius: " + radius
                + ";\n" + "Area: " + new DecimalFormat("#.##").format(calculateArea())
                + ";\n" + "Color: " + getColor() + "\n\n";
    }
}
