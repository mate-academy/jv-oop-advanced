package core.basesyntax;

public class Square extends Figure {
    private int side;
    private String color;

    public Square(int side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Name: square, " + "side: " + side + ", area: "
                + getArea() + ", color: " + color);
    }
}
