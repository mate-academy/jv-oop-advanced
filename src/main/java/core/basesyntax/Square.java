package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(String figure, String color, double side) {
        super(figure, color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void getInformation() {
        System.out.println("Figure : " + getFigure() + ", color : "
                + getColor() + ", side : " + side
                + " units, area : " + getArea() + " sq.units");
    }
}
