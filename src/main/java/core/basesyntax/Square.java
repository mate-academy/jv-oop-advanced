package core.basesyntax;

public class Square extends Figure {
    private String color;
    private int side;

    public Square(String color, int side) {
        this.color = color;
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Square has " + color + "color and side lenght "
                + side + ". Area is " + getArea());
    }

    @Override
    public int getArea() {
        return side * side;
    }
}
