package core.basesyntax;

public class Square extends Figure {
    private double lateral;

    public Square(Color color, double lateral) {
        super(color);
        this.lateral = lateral;
    }

    @Override
    public double getArea() {
        return lateral * lateral;
    }

    @Override
    public String draw() {
        StringBuilder line = new StringBuilder();
        return "Figure: square, area: " + String.format("%(.1f", getArea())
                + " sq.units, side: " + lateral
                + " units, color: " + getColor();
    }
}
