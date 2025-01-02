package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final float firstBase;
    private final float secondBase;
    private final float height;

    public IsoscelesTrapezoid(Colors color, float firstBase, float secondBase, float height) {
        super(color, "IsoscelesTrapezoid");
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double area() {
        return ((firstBase + secondBase) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + area() + " sq. units, firstBase: "
                + firstBase + " units, secondBase: "
                + secondBase + " units, height: "
                + height + " units, color: " + getColor());
    }
}
