package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double areaCalculation() {
        return this.side * this.side;
    }

    @Override
    public void display() {
        System.out.println("Figure: " + name() + ", area: " + areaCalculation()
                + " sq.units, side: " + this.side + " units, color: " + getColor());
    }

    @Override
    public String name() {
        return Figures.SQUARE.name();
    }
}
