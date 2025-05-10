package core.basesyntax.figures;

import lombok.Getter;

@Getter
public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("circle: area = "
                + calculateArea()
                + " sq.units, radius = "
                + radius
                + " units, area = "
                + color.toLowerCase()
                + '.');
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
