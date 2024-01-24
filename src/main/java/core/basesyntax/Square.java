package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                            + getArea() + " sq. units, "
                            + "side: " + getSide() + " units, "
                            + "color: " + getColor());
    }

    public int getSide() {
        return side;
    }
}
