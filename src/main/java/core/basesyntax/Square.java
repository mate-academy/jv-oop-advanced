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

    }

    @Override
    public void draw() {
        System.out.println("Figure: square, color: " + super.getColor()
                + ", side size:" + sideLength + ", area: " + calculateArea());
    }
}
