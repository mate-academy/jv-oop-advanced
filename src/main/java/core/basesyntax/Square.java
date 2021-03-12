package core.basesyntax;

public class Square extends Figure {
    private double side;

    protected Square() {
    }

    protected Square(String color, double side) {
        super(color);
        this.side = side;
    }

    protected double getSide() {
        return side;
    }

    protected void setSide(double side) {
        this.side = side;
    }

    @Override
    public void drawShape() {
        System.out.println(String.format("%s%.1f%s%.1f%s%s",
                "Figure: square, area: ", this.getArea(), " sq. units, side length: ",
                this.getSide(), " units, color: ", this.getColor()));
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public Figure getRandomFigure() {
        return new Square(ColorSupplier.colorGenerator(), Math.random() * 100);
    }
}
