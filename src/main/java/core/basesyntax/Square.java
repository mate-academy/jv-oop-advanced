package core.basesyntax;

public class Square extends Figure {
    private double sideLength;
    private String color;

    public Square(String color, double sideLength) {
        this.color = color;
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public void toDraw() {
        System.out.println("Square [Color: " + color + ", Side Length: "
                + sideLength + ", Area: " + getArea() + "]");
    }
}
