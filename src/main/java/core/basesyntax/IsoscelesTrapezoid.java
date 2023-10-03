package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private String color = colorSupplier.getRandomColor();
    static final int MAX_FIRST_BASE = 8;
    static final int MAX_SECOND_BASE = 12;
    static final int MAX_HEIGHT = 6;
    static final int MAX_SIDE = 8;
    private double firstBase = random.nextInt(MAX_FIRST_BASE) + 1;
    private double secondBase = random.nextInt(MAX_SECOND_BASE) + MAX_FIRST_BASE + 1;
    private double height = random.nextInt(MAX_HEIGHT) + 1;
    private double side = random.nextInt(MAX_SIDE) + 1;

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(String color) {
        super(color);
    }

    public double getFirstBase() {
        return firstBase;
    }

    public double getSecondBase() {
        return secondBase;
    }

    public double getHeight() {
        return height;
    }

    public double getSide() {
        return side;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid" + ", area: "
                + getArea() + " sq.units" + ", firstBase: "
                + getFirstBase() + " units" + ", secondBase: " + getSecondBase()
                + " units" + ", side: " + getSide() + " units" + ", height: "
                + getHeight() + " units" + ", perimeter: " + getPerimeter()
                + " units" + ", color: " + getColor());
    }

    @Override
    public double getArea() {
        return ((firstBase + secondBase) / 2) * height;
    }

    @Override
    public double getPerimeter() {
        return firstBase + secondBase + side * 2;
    }
}
