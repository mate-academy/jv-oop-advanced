package core.basesyntax;

public class Square extends Figure {
    private double side;

    @Override
    public double areaOfFigure() {

        return side * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: square"
                + ", side = "
                + side
                + " units"
                + ", area = "
                + areaOfFigure()
                + " units"
                + ", color = "
                + getColor()
        );
    }

    @Override
    public Figure getRandomFigure() {
        Square square = new Square();
        square.setColor(ColorSupplier.getRandomColor());
        square.setSide(random.nextDouble(100));
        return square;
    }
}
