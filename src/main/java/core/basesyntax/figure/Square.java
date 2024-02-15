package core.basesyntax.figure;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Square - Area: " + getArea()
                + ", side: " + side + ", color: " + color);
    }
}
