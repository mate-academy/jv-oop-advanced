package core.basesyntax.figure;

import core.basesyntax.supplier.Color;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius, Color randomColor, String name) {
        super(randomColor, name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        String formatedResult = "Figure: " + getFigureName()
                + System.lineSeparator()
                + "area: " + calculateArea() + " sq. units"
                + System.lineSeparator()
                + "radius: " + radius + " units"
                + System.lineSeparator()
                + "color: " + getColor();
        System.out.println(formatedResult);
    }
}
