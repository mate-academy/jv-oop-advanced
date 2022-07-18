package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure {
    private static final int MAX_FIRST_LEG = 20;
    private static final int MAX_SECOND_LEG = 20;
    private int firstLeg;
    private int secondLeg;

    public RightTriangle() {
    }

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName().toLowerCase()
                + ", area: " + getArea() + ", firstLeg: " + firstLeg + ",secondLeg: " + secondLeg
                + ", color: " + getColor() + ".");
    }

    public RightTriangle getRandomRightTriangle() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        return new RightTriangle(random.nextInt(MAX_FIRST_LEG), random.nextInt(MAX_SECOND_LEG),
                colorSupplier.getRandomColor());
    }
}
