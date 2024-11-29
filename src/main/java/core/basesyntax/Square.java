package core.basesyntax;

public class Square extends Shape {
    private double side;

    public Square(String color, double side) {
        super(Colors.valueOf(color));
        this.side = Math.round(Math.abs(side));
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Shape: square, area: " + calculateArea()
                + ", side: " + getSide()
                + ", color: " + getColor());
    }
}
