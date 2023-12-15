package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double calculateArea() {
        return (firstSide * secondSide);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass()
                + ", area: " + this.getArea() + " sq. units,"
                + " first side: " + this.firstSide + " units, "
                + " second side: " + this.secondSide + " units, "
                + "color: " + this.getColor());
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }
}
