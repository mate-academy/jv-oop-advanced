package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    @Override
    public double calculateArea() {
        return getFirstSide() * getSecondSide();
    }

    @Override
    public void drawable() {
        System.out.println("Figure: Rectangle, first side " + getFirstSide()
                + " units, second side " + getSecondSide() + " units + area: "
                + calculateArea() + " sq. units, color " + getColor());
    }
}
