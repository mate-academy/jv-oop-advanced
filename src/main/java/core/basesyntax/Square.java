package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        this.setColor(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        double area;
        area = this.side * this.side;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + String.format("%.1f", this.getArea())
                + " sq.units, side: " + String.format("%.1f", side)
                + " units, color: " + this.getColor());
    }
}
