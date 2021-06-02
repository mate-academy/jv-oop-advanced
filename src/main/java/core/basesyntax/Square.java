package core.basesyntax;

public class Square extends Figure implements GetArea{

    private double side;

    public Square(double side) {
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
