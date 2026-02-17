package core.basesyntax;

public class Square implements Figure {
    int side;
    String color;

    public Square(int side, String color) {
        this.color = color;
        this.side = side;
    }

    @Override
    public double getArea() {
        return (side * side);
    }

    @Override
    public void draw() {
        System.out.println("Square, area: " + getArea() + " sq. units, color: " + color
                + ", side: " + side + " units");
    }
}
