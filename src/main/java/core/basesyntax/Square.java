package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, " + "area: " + getArea() + " sq.units, "
                + "firstLeg: " + side + " units, "
                + "color: " + getColor());
    }

    @Override
    public void draw2() {
        System.out.println("Figure: square, " + "area: " + getArea()
                + " sq.units, " + "firstLeg: " + side + " units, " + "color: " + getColor1());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
