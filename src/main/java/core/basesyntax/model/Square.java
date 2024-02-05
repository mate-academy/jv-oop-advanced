package core.basesyntax.model;

public class Square extends Figure {
    private int side;

    public Square(String name, String color, int side) {
        super(name, color);
        this.side = side;
    }

    @Override
    public String toString() {
        return super.toString() + ", side: " + side;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", side: " + side);
    }

    @Override
    public double area() {
        return side * side;
    }
}
