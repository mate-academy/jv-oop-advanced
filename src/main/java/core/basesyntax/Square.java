package core.basesyntax;

public class Square extends Figure implements AreaCalculator, InformationAboutFigure {
    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public void draw() {
        String out = String.format("Figure: square, area: %,.2f sq.units, %d units, color: %s",
                getArea(), this.side, getColor());
        System.out.println(out);
    }
}
