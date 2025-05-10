package core.basesyntax;

public class Square extends Figure {
    private final double sides;

    public Square(String color, double sides) {
        super(color);
        this.sides = sides;
    }

    @Override
    public double getArea() {
        return Math.floor((sides * sides) * 100 / 100);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, side: "
                + sides + " units, color: " + getColor());
    }
}
