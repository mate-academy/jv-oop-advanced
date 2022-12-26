package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, " + "area: " + area()
                + "sq.units, " + "side: " + this.side
                + " units, " + "color: " + this.getColor());
    }

    @Override
    public double area() {
        return side * side;
    }

}
