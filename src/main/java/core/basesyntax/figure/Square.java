package core.basesyntax.figure;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        double area = getSide() * getSide();
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: SQUARE, area: " + String.format("%.2f", getArea())
                + " sq.units, side: " + getSide() + " units, color: " + getColor());
    }
}
