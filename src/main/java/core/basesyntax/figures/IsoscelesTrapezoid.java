package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double baseFirst;
    private double baseSecond;
    private double height;

    public IsoscelesTrapezoid(String color, double baseF, double height, double baseS) {
        super(color);
        this.baseFirst = baseF;
        this.height = height;
        this.baseSecond = baseS;
    }

    @Override
    public double calculateArea() {
        return (baseFirst + baseSecond) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, " + "area: " + calculateArea()
                           + " sq. units, base1: " + baseFirst
                           + ", base2: " + baseSecond
                           + ", height: " + height
                           + ", color: " + getColor());
    }
}
