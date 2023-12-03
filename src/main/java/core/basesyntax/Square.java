package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("I am square, my area is " + getArea()
                + " my side is " + side
                + ", my color is " + getColor() + "\n");
    }
}
