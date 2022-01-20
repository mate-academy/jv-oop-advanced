package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        double area = Math.pow(side,2);
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, "
                + "side: " + side + ", color: " + getColor());
    }
}
