package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        this.side = side;
        super.setColor(color);
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void infoDrawer() {
        System.out.println("Figure: square, area: " + calculateArea() + " sq.units, side: " + side
                + " units, color " + getColor());
    }
}
