package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int firstBases;
    private int secondBases;

    public IsoscelesTrapezoid(String color, int height, int firstBases, int secondBases) {
        super(color);
        this.height = height;
        this.firstBases = firstBases;
        this.secondBases = secondBases;
    }

    @Override
    public double getArea() {
        return ((firstBases + secondBases) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + getArea() + " sq. units, "
                + "firstBases: " + firstBases + " units, "
                + "secondBases: " + secondBases + " units, "
                + "height: " + height + " units, "
                + "color: " + getColor());
    }
}
