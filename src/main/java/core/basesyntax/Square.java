package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    static final int MAX_SIDE = 8;
    private String color = colorSupplier.getRandomColor();
    private double side = random.nextInt(MAX_SIDE) + 1;

    public Square() {
    }

    public Square(String color) {
        super(color);
    }

    public String getColor() {
        return color;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square" + ", area: "
                + getArea() + " sq.units" + ", side: "
                + getSide() + " units" + ", perimeter: " + getPerimeter()
                + " units" + ", color: " + getColor());
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }
}
