package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double downSide;
    private double height;

    public IsoscelesTrapezoid(double topSide, double downSide,double height, Color color) {
        super(color);
        this.topSide = topSide;
        this.downSide = downSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * (topSide + downSide) / 2;
    }

    @Override
    public void draw() {
        System.out.printf("Figure IsoscelesTrapezoid, area: %.1f"
                            + " sq. units, top side: %.1f"
                            + " units, down side: %.1f"
                            + " units, height: %.1f"
                            + " units, color: %s",
                            getArea(), topSide, downSide, height, color);
    }
}
