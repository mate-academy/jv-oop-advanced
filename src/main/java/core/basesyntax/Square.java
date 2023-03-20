package basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, Color color) {
        this.side = side;
        this.color = color;
    }

    public void draw() {
        System.out.println("Figure : Square, Area :" + getArea() + " Side: "
                + side + " Color: " + color.name());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

