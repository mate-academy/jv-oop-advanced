package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
        this.area = areaCalculator();
    }

    public double getSide() {
        return side;
    }

    @Override
    public double areaCalculator() {
        return this.area = side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, side: "
                + getSide() + " units, color: "
                + getColor());
    }
}
