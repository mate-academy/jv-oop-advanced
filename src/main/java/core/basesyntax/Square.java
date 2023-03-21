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
        String message = "Figure: Square, area: " + getArea()
                + " side:" + side + " color:" + getColor();
        System.out.println(message);
    }
}
