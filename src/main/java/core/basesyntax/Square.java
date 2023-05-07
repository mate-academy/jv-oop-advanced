package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void getArea() {
        double area = side * side;
        System.out.println("Figure: square, area: " + area + " sq.units, side: "
                + side + " units, color: " + getColor().toLowerCase());
    }
}
