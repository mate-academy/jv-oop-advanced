package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double baseDown;
    private double baseUp;
    private double height;

    public IsoscelesTrapezoid(String color,double baseDown,double baseUp,double height) {
        super(color);
        this.baseDown = baseDown;
        this.baseUp = baseUp;
        this.height = height;
    }

    @Override
    public void printInfo() {
        System.out.println(" Figure: trapezoid, area: "
                + getArea() + " sq. units, baseDown: " + baseDown + " units, baseUp: "
                + baseDown + " baseUp, height: " + height + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return (baseDown + baseUp) * height / 2;
    }
}
