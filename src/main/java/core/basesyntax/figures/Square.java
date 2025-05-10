package core.basesyntax.figures;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, color: "
                + getColor().toString().toLowerCase()
                + ", area: " + Math.round(getArea())
                + " sq. units, side: " + side + " units");
    }
}
