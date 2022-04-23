package core.basesyntax;

public class Square implements Figure{
    private int side;
    private String color;

    public Square(int side) {
        this.side = side;
        ColorSupplier cc = new ColorSupplier();
        this.color = cc.getRandomColor();
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "} area:" + getArea() + " color: " + color;
    }
}
