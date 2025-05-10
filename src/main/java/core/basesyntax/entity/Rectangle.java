package core.basesyntax.entity;

public class Rectangle extends Figure {
    public static final double MAX_FIRST_SIDE = 50;
    public static final double MAX_SECOND_SIDE = 50;
    private double firstSide;
    private double secondSide;

    public Rectangle(Color color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure:" + " Rectangle," + System.lineSeparator()
                + "        area: " + getArea() + " sq.units," + System.lineSeparator()
                + "        firstSide: " + firstSide + " units" + System.lineSeparator()
                + "        secondSide: " + secondSide + " units," + System.lineSeparator()
                + "        color: " + getColor());
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }
}
