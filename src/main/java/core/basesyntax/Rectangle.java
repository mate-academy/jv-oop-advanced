package core.basesyntax;

public class Rectangle extends Figure {
    private double sideone;
    private double sidetwo;

    public Rectangle(String color, double sideone, double sidetwo) {
        super(color);
        this.sideone = sideone;
        this.sidetwo = sidetwo;
    }

    @Override
    public double getArea() {
        return sideone * sidetwo;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: Rectangle, area: %.1f sq.units,"
                        + " side1: %.1f units, side2: %.1f units, color: %s\n",

                getArea(), sideone, sidetwo, super.getColor());
    }
}
