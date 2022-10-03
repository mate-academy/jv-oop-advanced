package core.basesyntax;

public class Square extends Figure {
    private final int side;
    private String color = super.getColor();

    public Square(int side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public String getInfo() {
        return "Figure : Square, Color : " + color
                + " Side : " + side
                + "Area : " + getArea();
    }

    @Override
    public double getArea() {
        return side * side;

    }
}
