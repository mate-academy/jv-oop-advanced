package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String name, String color, double side) {
        super(name, color);
        this.side = side;
    }

    @Override
    public double areaCalculating() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", " + "area: " + areaCalculating()
                + " sq.units, " + "side: " + this.side + " units, " + "color: " + getColor());
    }
}
