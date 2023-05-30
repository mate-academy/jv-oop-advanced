package core.basesyntax;

public class Square implements Figure {
    private int side;
    private Color color;

    public Square(int side, Color color) {
        this.color = color;
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Square area = " + getArea() + ", color: "
                + color.name() + ", side: " + side);
    }
}
