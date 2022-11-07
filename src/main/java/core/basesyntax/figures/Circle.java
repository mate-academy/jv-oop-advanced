package core.basesyntax.figures;

import core.basesyntax.constants.Color;
import lombok.Getter;

@Getter
public class Circle extends Figure {
    private final int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        String info = "circle: area = "
                + calculateArea()
                + " sq.units, radius = "
                + radius
                + " units, area = "
                + color.name().toLowerCase()
                + '.';
        System.out.println(info);
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
