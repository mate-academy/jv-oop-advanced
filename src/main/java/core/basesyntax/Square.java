package core.basesyntax;

public class Square extends AbstractFigure {
    private String color;

    private int side;

    public Square(String color, int side) {
        super(color);
        this.color = color;
        this.side = side;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return side * side;
    }

    public void draw() {
        System.out.println("Square - Color: " + color + ", Side: " + side + ", Area: " + getArea());
    }

}


