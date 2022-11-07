package core.basesyntax.figures;

import core.basesyntax.constants.Color;
import lombok.Getter;

@Getter
public class Rectangle extends Figure {
    private final int width;
    private final int length;

    public Rectangle(Color color, int width, int length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public void draw() {
        String info = "rectangle: area = "
                + calculateArea()
                + " sq.units, width = "
                + width
                + " units, length = "
                + length
                + " units, color = "
                + color.name().toLowerCase()
                + '.';
        System.out.println(info);
    }

    @Override
    public double calculateArea() {
        return (double) width * length;
    }
}
