package core.basesyntax;

public class Square extends Figure{
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double area() {
        double area = Math.pow(side,2);
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + area() + " sq.units, " +
                "side: " + side + ", color: " + getColor());
    }
}
