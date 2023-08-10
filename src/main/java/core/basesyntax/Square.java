package core.basesyntax;

public class Square extends Figure {
    private int sideLength;

    public Square(String color, int side) {
        super(color);
        this.sideLength = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, Area: "
                + getArea() + ", SideLength: " + sideLength
                + ", Color: " + getColor());
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }
}
