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
    public String toString() {
        return "Figure: rectangle, area: " + (firstSide * secondSide)
                + " sq.units, firstSide: " + firstSide + " units, secondSide: "
                + secondSide + " units, color: " + new ColorSupplier().getRandomColor();
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle was drawn");
    }
}
