package core.basesyntax.figures;

public class Rectangle extends Figure {
    private final int firstSide;
    private final int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        super.area = getArea();
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    public void draw() {
        System.out.println("Figure: " + "rectangle, "
                + "area: " + area + " sq.units, "
                + "first side: " + firstSide + " units, "
                + "second side: " + secondSide + " units, "
                + "color: " + color.toLowerCase()
        );
    }
}
