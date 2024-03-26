package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double topSize;
    private final double bottomSide;
    private final double height;

    public IsoscelesTrapezoid(Color color, double topSize, double bottomSide, double height) {
        super(color);
        this.topSize = topSize;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    @Override

    public double getArea() {
        return ((topSize * bottomSide) * height) / 2;
    }

    @Override

    public void draw() {
        System.out.println("Figure: RightTriangle, area : " + getArea() + " sq. units, topSize: "
                + topSize + " bottomSide: "
                + bottomSide + " height: " + height + " units, color: " + color);
    }

    @Override
    protected String getFigureName() {
        return "IsoscelesTrapezoid";
    }

}
