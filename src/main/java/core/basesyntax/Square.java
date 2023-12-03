package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("I am square, my area is " + calculateArea()
                + " my side is " + side
                + ", my color is " + getColor() + "\n");
    }
}
