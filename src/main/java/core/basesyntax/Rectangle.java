package core.basesyntax;

public class Rectangle extends Square {
    private double secondSide;

    public Rectangle(String color, double side, double secondSide) {
        super(color, side);
        this.secondSide = secondSide;
    }

    public double getFirstSide() {
        return secondSide;
    }

    public void setFirstSide(double side) {
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        System.out.println("" + getColor() + " rectangle with area of " + getArea()
                + " sq.units and sides of " + getSide() + " units and " + secondSide + " units");
    }

    @Override
    public double getArea() {
        return getSide() * secondSide;
    }
}
