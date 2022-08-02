package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square() {
    }

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("square, " + "area: " + calculateArea() + " sq.units, "
                + "side: " + side + " units, " + "color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
