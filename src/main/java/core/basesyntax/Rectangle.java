package core.basesyntax;

public class Rectangle extends Square {
    private double secondSide;
    public Rectangle () {
        double defaultSide = 10;
        secondSide = defaultSide;
    }
    public Rectangle (String color, double side) {
        super(color, side);
    }
    public Rectangle (String color, double side, double secondSide) {
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
    public void Draw() {
        System.out.println("" + getColor() + " rectangle with area of " + Area()
                + " sq.units and sides of " + getSide() + " units and " + secondSide + " units");
    }
    @Override
    public double Area() {
        return getSide() * secondSide;
    }
}
