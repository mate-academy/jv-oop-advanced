package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double bar1;

    private final double bar2;

    private final double heightTr;

    public IsoscelesTrapezoid(String color, double bar1, double bar2, double heightTr) {
        super(color);
        this.bar1 = bar1;
        this.bar2 = bar2;
        this.heightTr = heightTr;
    }

    @Override
    public double getArea() {
        return ((bar1 + bar2) / 2) * heightTr;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + getArea()
                + " sq. units, heightTr: " + heightTr
                + " sq. units, bar1: " + bar1
                + " sq. units, bar2: " + bar2
                + " units, color: " + getColor());
    }
}
