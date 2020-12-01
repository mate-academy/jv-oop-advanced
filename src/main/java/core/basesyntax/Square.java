package core.basesyntax;

public class Square extends Figure {
    private int side;
    private double diagonal;

    public Square(String color, int side) {
        super(color);
        this.side = side;
        draw();
    }

    @Override
    public void draw() {
        area = side * side;
        diagonal = Math.sqrt(2) * side;
    }

    @Override
    public String toString() {
        return "Figure: square, area: " + area + " sq. units, diagonal: "
                + diagonal + ", sides: " + side + ", color: " + color;
    }
}
