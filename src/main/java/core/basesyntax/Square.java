package core.basesyntax;

public class Square extends Figure {
    private double sideLength;

    public Square(String color, double sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }

    @Override
    public void displayProperty() {
        System.out.println("Figure: square, color: " + super.getColor()
                + ", size of the side:" + sideLength + ", area: " + calculateArea());
    }
}
