package core.basesyntax;

public class Square extends Figure implements Shape {
    private int side;

    public Square(int side, Color color) {
        this.side = side;
        this.color = color;
    }

    @Override
    void draw() {
        System.out.println("I am " + color.toString().toLowerCase()
                + " square, my side is " + side
                + " and my area is " + String.format("%.2f", getArea()));
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
