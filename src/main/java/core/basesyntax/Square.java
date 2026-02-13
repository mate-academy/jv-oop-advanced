package core.basesyntax;

public class Square extends Rectangle {
    public Square(String color, double side) {
        super(color, side, side);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, color: " + color
                + ", side: " + getWidth()
                + ", area: " + getArea());
    }
}
