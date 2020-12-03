package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square() {
    }

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int calculatePerimeter() {
        return side * 4;
    }

    @Override
    public double calculateArea() {
        double area = side * side;
        setArea(area);
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: " + calculateArea()
                + " sq. units, perimeter: " + calculatePerimeter()
                + " units, color: " + getColor());
    }
}
