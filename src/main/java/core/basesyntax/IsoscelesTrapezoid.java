package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBases;
    private int secondBases;
    private int height;

    public IsoscelesTrapezoid(String color, int firstBases, int secondBases, int height) {
        super(color);
        this.firstBases = firstBases;
        this.secondBases = secondBases;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + getArea() + " sq. units, "
                + "firstBases: " + firstBases + " units, "
                + "secondBases: " + secondBases + " units, "
                + "height: " + height + " units, "
                + "color: " + getColor());
    }

    @Override
    public double getArea() {
        return (firstBases + secondBases) * height / 2;
    }
}
