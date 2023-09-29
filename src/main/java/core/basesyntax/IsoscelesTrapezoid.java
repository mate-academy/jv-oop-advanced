package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private String name = "IsoscelesTrapezoid";
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private String color = colorSupplier.getRandomColor();
    private final int maxFirstBase = 8;
    private final int maxSecondBase = 12;
    private final int maxHeight = 6;
    private final int maxSide = 8;
    private double firstBase = random.nextInt(maxFirstBase) + 1;
    private double secondBase = random.nextInt(maxSecondBase) + maxFirstBase + 1;
    private double height = random.nextInt(maxHeight) + 1;
    private double side = random.nextInt(maxSide) + 1;

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(String color) {
        super(color);
    }

    public String getName() {
        return name;
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
        System.out.println("Figure: " + getName() + ", area: "
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
