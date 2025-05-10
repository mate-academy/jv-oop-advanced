package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        setArea(calculateArea());
    }

    @Override
    public double calculateArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName()
                + ", color: " + getColor() + ", area: "
                + getArea() + " sq. units, first side: " + firstSide
                + " units, second side: " + secondSide + " units");
    }
}
