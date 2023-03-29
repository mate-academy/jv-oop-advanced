package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure {
    private static final int MAX_LEG = 20;
    private int firstLeg;
    private int secondLeg;

    public RightTriangle() {
    }

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2f;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq.units, firstLeg: "
                + firstLeg + " units, secondLeg: " + secondLeg
                + " units, color: " + getColor().toLowerCase());
    }

    @Override
    public Figure createRandomFigure() {
        Random random = new Random();
        return new RightTriangle(new ColorSupplier().getRandomColor(),
                random.nextInt(MAX_LEG), random.nextInt(MAX_LEG));
    }
}
