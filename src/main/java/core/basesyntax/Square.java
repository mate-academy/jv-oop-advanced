package core.basesyntax;

public class Square extends Figure {
    private String color;
    private double side;

    public Square(String color, double side) {
        this.color = color;
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public void draw() {
        System.out.println("Square: color=" + color + ", side=" + side + ", area=" + getArea());
    }
}
