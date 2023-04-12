package core.basesyntax;

public class Square implements Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double gerArea() {
        return side * side;
    }

    public void draw() {
        System.out.println(gerArea());
    }
}
