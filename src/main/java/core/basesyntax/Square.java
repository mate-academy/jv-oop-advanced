package core.basesyntax;

public class Square extends Figure implements AreaFigure{
    float side = 6;

    public Square() {}
    public Square(float side) {
        this.side = side;
    }

    @Override
    public float area() {
        return this.side * this.side;
    }

    public String toString() {
        return "Figure: square, area: " + area()
                + " sq.units, side: " + side + " units, color: "
                + color;
    }
}
