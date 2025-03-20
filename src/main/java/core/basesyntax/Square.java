package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %s sq. units, side: %s units, color: %s%n",
                "square", this.getArea(), this.side, this.getColor());
    }
}
