package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public Square() {

    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + Figures.SQUARE.name() + ", area: "
                + calculateArea() + " sq.units, "
                + "side: " + side + " units, "
                + "color: " + getColor());
    }
}
