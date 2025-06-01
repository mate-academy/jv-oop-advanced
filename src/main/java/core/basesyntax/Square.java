package core.basesyntax;

public class Square implements Figure {
    private String color;
    private double side;

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Drawable: square, area: " + getArea()
                + " side: " + side
                + " color: " + color);
    }
}
