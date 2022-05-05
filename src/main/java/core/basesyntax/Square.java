package core.basesyntax;

public class Square extends Figures {
    private double lateral;

    public Square(Colors color, double lateral) {
        super(color);
        this.lateral = lateral;
    }

    @Override
    public double getArea() {
        return lateral * lateral;
    }

    public double getA() {
        return lateral;
    }
}
