package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Hello, my name is Square, my area: " + calculateArea()
                + " my side: " + side + " my color: " + getColor());
    }
}
