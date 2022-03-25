package core.basesyntax;

public class IsolateTrapezoid extends Figure implements Description, GetArea {
    private int longerSide;
    private String name = "isolate Trapezoid";

    public IsolateTrapezoid(String color, int longerSide) {
        super(color);
        this.longerSide = longerSide;
    }

    @Override
    public void getDescription() {
        System.out.println("Name: " + name + " longer side: " + longerSide + " units "
                + " area: " + getArea() + "sq. units " + " color: " + getColor());
    }

    @Override
    public double getArea() {
        return longerSide * (longerSide / 2);
    }
}
