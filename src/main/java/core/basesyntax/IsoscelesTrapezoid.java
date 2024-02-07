package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int sideH;

    public IsoscelesTrapezoid(Color color, int sideA, int sideB, int sideH) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideH = sideH;
    }

    @Override
    public double getArea() {
        return ((sideA + sideB) / 2) * sideH;
    }

    @Override
    public void draw() {
        String message = "Figure: IsoscelesTrapezoid, area: " + getArea()
                + " sideA:" + sideA + " SideB" + sideB + " height" + sideH
                + " color:" + getColor();
        System.out.println(message);
    }
}
