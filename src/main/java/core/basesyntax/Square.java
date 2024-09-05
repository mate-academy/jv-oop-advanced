package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(int side, String color) {
        this.side = side;
        setColor(color);
    }

    public double calculateAndSetArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: " + calculateAndSetArea()
                + " sq. units, side: " + side + " units, color: " + getColor());
    }
}
