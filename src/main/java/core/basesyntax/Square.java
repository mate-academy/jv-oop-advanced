package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
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
    public void drawArea() {
        double area = this.side * this.side;

        System.out.println("Figure: square, " + "area: " + area + " sq. units, side: "
                + this.side + " units, color: " + this.getColor());
    }
}
