package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Drawable {
    private double firstBase;
    private double secondBase;
    private double leg;
    private Color color;

    public IsoscelesTrapezoid(double firstBase, double secondBase, double leg, Color color) {
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.leg = leg;
        this.color = color;
    }

    @Override
    public double getArea() {
        double p = (firstBase + secondBase + leg + leg) / 2;
        return Math.sqrt((p - firstBase) * (p - secondBase) * (p - leg) * (p - leg));
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + ", first base: " + firstBase + ", second base: " + secondBase + ", leg: " + leg + ", color: " + color.name());
    }
}
