package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
        super("square", color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return super.draw() + "side: " + side + " units";
    }
}
