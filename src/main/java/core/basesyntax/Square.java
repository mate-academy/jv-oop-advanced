package core.basesyntax;

public class Square extends Figure {
    private final int lag;

    public Square(int firstLag, String color) {
        this.lag = firstLag;
        setColor(color);
    }

    @Override
    public Double getAreaCalculator() {
        return (double)lag * lag;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: square, area: " + this.getAreaCalculator()
                + " sq.units, firstLag: " + lag + " units, color: "
                + super.getColor());
    }
}
