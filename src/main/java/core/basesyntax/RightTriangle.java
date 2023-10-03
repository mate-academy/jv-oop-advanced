package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    static final int MAX_FIRST_LEG = 10;
    static final int MAX_SECOND_LEG = 10;
    private String color = colorSupplier.getRandomColor();
    private double firstLeg = random.nextInt(MAX_FIRST_LEG) + 1;
    private double secondLeg = random.nextInt(MAX_SECOND_LEG) + 1;
    private double base = Math. sqrt((firstLeg * firstLeg) + (secondLeg * secondLeg));

    public RightTriangle() {
    }

    public RightTriangle(String color) {
        super(color);
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
        System.out.println("Figure: Right triangle" + ", area: "
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
