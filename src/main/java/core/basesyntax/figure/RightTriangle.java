package core.basesyntax.figure;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        String color = getColor().name().toLowerCase();
        String info = "Figure: triangle, area: " + getArea()
                + " sq.units, firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg
                + " units, color: " + color;
        System.out.println(info);
    }

    @Override
    public double getArea() {
        return (double) (firstLeg * secondLeg) / 2;
    }
}
