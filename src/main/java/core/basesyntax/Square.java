package core.basesyntax;

public class Square extends Figure implements AreaObtainer, InfoPrinter {
    private int side;

    public Square(String color, int side) {
        this.side = side;
        setColor(color);
    }

    @Override
    public double areaCalculater() {
        return side * side;
    }

    @Override
    public void infoDrawer() {
        System.out.println("Figure: square, area: " + areaCalculater() + " sq.units, side: " + side
                + " units, color " + getColor());
    }
}
