package core.basesyntax;

public class Rectangle extends Figure {
    private final int firstSide;
    private final int secondSide;

    public Rectangle(Color color, int firstSide, int secondSide) {
        super(Shape.RECTANGLE, color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return this.firstSide * this.secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getShape() + ", area: " + this.getArea()
                + " sq.units, left/right side: " + firstSide + " sq.units, bottom/top side: "
                + secondSide + " sq.units, color: " + this.getColor().name().toLowerCase());
    }
}
