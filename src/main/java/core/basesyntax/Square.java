package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, Color color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public int calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure : square, area: " + calculateArea() + " sq.units, "
                + "side: " + side + " units, "
                + "color: " + color);
    }
}
