package core.basesyntax;

public class Square extends Figure {
    private double side;
    private double area;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void getArea() {
        area = side * side;
    }

    @Override
    public void paint() {
        System.out.println("Figure: square, area: "
                + area + " sq. units, side: "
                + side + " units, color: "
                + getColor());
    }
}
