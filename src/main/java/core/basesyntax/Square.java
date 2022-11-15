package core.basesyntax;

public class Square extends Figure {
    private double side;

    @Override
    public String draw() {
        return "Figure: square, area: "
                + this.getArea() + " sq.units, side: "
                + this.side + " units, color: "
                + this.getColor();
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public Figure create() {
        Square square = new Square();
        square.side = getRandom().nextInt(getMaxSize());
        square.setColor(getColorSupplier().getRandomColor());
        return square;
    }
}
