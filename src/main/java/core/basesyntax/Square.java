package core.basesyntax;

public class Square implements Figures {
    private double lateral;
    private Colors color;

    public Square(Colors color, double lateral) {
        this.color = color;
        this.lateral = lateral;
    }

    @Override
    public Colors getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return lateral * lateral;
    }

    public double getA() {
        return lateral;
    }
}
