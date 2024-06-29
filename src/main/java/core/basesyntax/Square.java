package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        this.color = color;
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, color: " + getColor() + ", area: "
                + getArea() + " sq. units, side: " + side + " units");
    }
}
