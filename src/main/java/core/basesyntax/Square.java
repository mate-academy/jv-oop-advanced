package core.basesyntax;

public class Square extends Figure {

    public Square(String color, double height) {
        super(color, height);
    }

    @Override
    public double getArea() {
        return Math.pow(getSide(), 2);
    }

    @Override
    public void draw() {
        System.out.format("Figure: %s, area: %.2f sq.units, side: %.1f units, color: %s\n",
                "square", getArea(), getSide(), getColor());
    }
}
