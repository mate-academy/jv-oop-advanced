package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure : Square, area : "
                + getArea()
                + ", side : "
                + side
                + ", color : "
                + super.getColor();
    }
}
