package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        super("square", color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea()
                + " sq.units, side: " + side + " units, color: " + color);
    }
}
