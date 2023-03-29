package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private static final int MAX_LENGTH = 20;
    private int leg;
    private int firstBase;
    private int secondBase;

    public IsoscelesTrapezoid() {

    }

    public IsoscelesTrapezoid(String color, int leg, int firstBase, int secondBase) {
        super(color);
        this.leg = leg;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
    }

    public int getLeg() {
        return leg;
    }

    public int getFirstBase() {
        return firstBase;
    }

    public int getSecondBase() {
        return secondBase;
    }

    @Override
    public double getArea() {
        double hypotenuse = leg;
        double oppositeLeg = (Math.max(firstBase, secondBase)
                - Math.min(firstBase, secondBase)) / 2f;
        double height = Math.sqrt(Math.pow(hypotenuse, 2)
                + Math.pow(oppositeLeg, 2));
        return (firstBase + secondBase / 2f) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq.units, Leg: "
                + leg + " units, firstBase: " + firstBase + " units, secondBase: "
                + secondBase + " color: " + getColor().toLowerCase());
    }

    @Override
    public Figure createRandomFigure() {
        Random random = new Random();
        return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                random.nextInt(MAX_LENGTH), random.nextInt(MAX_LENGTH), random.nextInt(MAX_LENGTH));
    }
}
