package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;

    }

    @Override
    public String getInfo() {
        return "Figure : Square, Color : " + getColor()
                + " Side : " + side
                + "Area : " + getArea();
    }

    @Override
    public double getArea() {
        return side * side;

    }
}
