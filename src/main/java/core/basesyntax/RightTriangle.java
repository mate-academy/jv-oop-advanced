package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstleg;
    private final int secondleg;

    public RightTriangle(String color, int firstleg, int secondleg) {
        super(color);
        this.firstleg = firstleg;
        this.secondleg = secondleg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle area: " + getArea()
                + " sq.units, firstLeg:" + firstleg
                + " units, secondLeg:" + secondleg
                + " untis, color:" + getColor());
    }

    @Override
    public double getArea() {
        return (firstleg * secondleg) / 2;
    }
}
