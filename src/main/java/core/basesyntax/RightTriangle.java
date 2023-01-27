package core.basesyntax;

public class RightTriangle extends Figure {
    private int baseLeg;
    private int heightLeg;

    public RightTriangle(String color, int baseLeg, int heightLeg) {
        super(color);
        this.baseLeg = baseLeg;
        this.heightLeg = heightLeg;
    }

    @Override
    public double getArea() {
        return baseLeg * heightLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println(String.format(
                "Figure: %s, area: %s sq.units, baseLeg: %d units,"
                + " heightLeg: %d units, color: %s",
                getClass().getSimpleName(), getArea(), baseLeg, heightLeg, getColor()));
    }
}
