package core.basesyntax.figures;

import lombok.Getter;

@Getter
public class Rectangle extends Figure {
    private final int width;
    private final int length;

    public Rectangle(String color, int width, int length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("rectangle: area = "
                + calculateArea()
                + " sq.units, width = "
                + width
                + " units, length = "
                + length
                + " units, color = "
                + color.toLowerCase()
                + '.');
    }

    @Override
    public double calculateArea() {
        return (double) width * length;
    }
}
