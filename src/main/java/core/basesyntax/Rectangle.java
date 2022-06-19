package core.basesyntax;

public class Rectangle extends Figure implements Drawable {
    private double firstSide;
    private double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, first side: "
                + firstSide + " units, second side: " + secondSide + " units, color: "
                + super.getColor());
    }
}
