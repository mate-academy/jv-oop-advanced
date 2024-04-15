package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;
    private static final int MAX_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();

    public RightTriangle getRandomRightTriangle() {
        int firstLeg = random.nextInt(MAX_NUMBER);
        int secondLeg = random.nextInt(MAX_NUMBER);
        return new RightTriangle(color.getRandomColor(), firstLeg, secondLeg);
    }

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("RightTriangle = {" + "color: " + getColor()
                + ", firstLeg: " + getFirstLeg()
                + ", secondLeg: " + getSecondLeg()
                + ", area: " + getArea() + "}");
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }
}
