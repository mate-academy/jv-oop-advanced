package core.basesyntax;

public class Square implements Figure {
    private String color;
    private int side;

    @Override
    public double getArea() {
        return side * side;
    }

    public Square(String color, int side) {
        this.color = color;
        this.side = side;
    }

    public void getInfo() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, side: "
                + side + " units, color:" + color);
    }
}
