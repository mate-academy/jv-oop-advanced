package core.basesyntax;

public class IsoscelesTrapezoid extends Figure{
    private final double base;
    private final double leg;

    public IsoscelesTrapezoid(double base, double leg, String Color){
        super(Color);
        if(base <= 0 || leg <= 0){
            throw new IllegalArgumentException("Base and legs must be greater than 0");
        }
        this.base = base;
        this.leg = leg;
    }

    @Override
    public double getArea() {
        double height = Math.sqrt(Math.pow(leg, 2) - Math.pow(base/2, 2));
        return 0.5 * base * height;
    }

    @Override
    public String getTypeFigure() {
        return "Isosceles Trapezoid";
    }

    @Override
    public String draw() {
        return "Isosceles trapezoid, area: " + getArea() + " sq. units" +
                " with base: " + getBase() + " and leg: " + getLeg() + " color: " + getColor();
    }

    public double getBase() {
        return base;
    }

    public double getLeg() {
        return leg;
    }
}
