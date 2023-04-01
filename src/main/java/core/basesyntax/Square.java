package core.basesyntax;

public class Square extends Figure implements ShapeAreaCalculator, ShapePropertyDisplay {
    private double sideLength;

    public Square(String color, double sideLength) {
        this.color = color;
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }

    @Override
    public void displayProperty() {
        System.out.println("Figure: square, color is " + color + ", size of the side is " + sideLength
                + ", area: " + calculateArea());
    }
}
