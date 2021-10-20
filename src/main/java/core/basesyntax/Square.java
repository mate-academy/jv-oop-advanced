package core.basesyntax;

public class Square implements Area, Draw {
    private String color;
    private double side;

    public double getSide() {
        return side;
    }

    public void getSquare(int side, String color) {
        this.side = side;
        this.color = color;
        draw();
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, side "
                + getSide() + " units, color: " + color);
    }
}
