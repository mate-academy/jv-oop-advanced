package core.basesyntax;

public class IsolateTrapezoid extends Figure {
    private int longerSide;

    public IsolateTrapezoid(String color, int longerSide) {
        super(color);
        this.longerSide = longerSide;
    }

    @Override
    public void getDescription() {
        System.out.println("Name: isolate trapezoid" + " longer side: " + longerSide + " units "
                + " area: " + getArea() + "sq. units " + " color: " + getColor());
    }

    @Override
    public double getArea() {
        return longerSide * (longerSide / 2);
    }
}
