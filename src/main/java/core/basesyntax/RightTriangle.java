package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure {
    private String name = "Right triangle";
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private final int maxFirstLeg = 10;
    private final int maxSecondLeg = 10;
    private String color = colorSupplier.getRandomColor();
    private double firstLeg = random.nextInt(maxFirstLeg) + 1;
    private double secondLeg = random.nextInt(maxSecondLeg) + 1;
    private double base = Math. sqrt((firstLeg * firstLeg) + (secondLeg * secondLeg));

    public RightTriangle() {
    }

    public RightTriangle(String color) {
        super(color);
    }

    public String getName() {
        return name;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public double getBase() {
        return base;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: "
                + getArea() + " sq.units" + ", base: "
                + getBase() + " units" + ", firstLeg: " + getFirstLeg()
                + " units" + ", secondLeg: " + getSecondLeg()
                + " units" + ", perimeter: " + getPerimeter()
                + " units" + ", color: " + getColor());
    }

    @Override
    public double getPerimeter() {
        return base + firstLeg + secondLeg;
    }
}
