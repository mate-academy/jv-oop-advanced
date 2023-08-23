package core.basesyntax;

public class RightTriangle extends Figure {
    private double side;
    private double height;

    public RightTriangle(String color, double side, double height) {
        super(Color.valueOf(color));
        this.side = side;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle, " + "area: " + getArea()
                + " sq.units, " + "firstLeg: " + side
                + " units, " + "height: " + height + " units, " + "color: " + getColor());
    }

    @Override
    public double getArea() {
        return (side + height) / 2;
    }
}
