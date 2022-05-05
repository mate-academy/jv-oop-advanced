package core.basesyntax;

public class Square extends Figure {
    private double lateral;

    public Square(Colors color, double lateral) {
        super(color);
        this.lateral = lateral;
    }

    public double getArea() {
        return lateral * lateral;
    }

    public double getA() {
        return lateral;
    }
}
