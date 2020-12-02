package core.basesyntax;

public class Square extends Figure {
    private int side;
    private int perimeter;

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

    public int getPerimeter() {
        return perimeter;
    }

    public void calculatePerimeter() {
        this.perimeter = side * 4;
    }

    @Override
    public void doAllCalculations() {
        calculatePerimeter();
        calculateArea();
    }

    @Override
    public void calculateArea() {
        setArea(side * side);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: " + getArea()
                + " sq. units, perimeter: " + perimeter
                + " units, color: " + getColor());
    }
}
