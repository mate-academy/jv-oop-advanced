package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int firstleg;
    private final int secondleg;
    private final int height;

    public IsoscelesTrapezoid(String color, int firstleg, int secondleg, int height) {
        super(color);
        this.firstleg = firstleg;
        this.secondleg = secondleg;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid area: " + getArea()
                + " sq.units, firstleg:" + firstleg
                + " units, secondleg:" + secondleg
                + " units, height" + height
                + " untis, color:" + getColor());
    }

    @Override
    public double getArea() {
        return ((firstleg + secondleg) / 2) * height;
    }
}
