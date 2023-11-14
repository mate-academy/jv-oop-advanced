package core.basesyntax;

public class RightTriangle extends Figure {
    private int side;

    public RightTriangle(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return ((side + side) * Math.sqrt(3)) / 4;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + color
                + " right triangle with sides equal " + side
                + " and area " + calculateArea());
    }
}
