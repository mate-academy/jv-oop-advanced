package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double leg;

    public IsoscelesTrapezoid(double firstBase, double secondBase, double leg, String color) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.leg = leg;
    }

    @Override
    public void draw() {
        StringBuilder info = new StringBuilder(
                String.format(BASIC_PRINT_INFO, "isosceles trapezoid", getArea(), color)
        );

        info.append(", firstBase: ").append(String.format("%.1f", firstBase)).append(" units");
        info.append(", secondBase: ").append(String.format("%.1f", secondBase)).append(" units");
        info.append(", leg: ").append(String.format("%.1f", leg)).append(" units");
        System.out.println(info.toString());
    }

    @Override
    public double getArea() {
        double h = Math.pow(Math.pow(leg, 2) - Math.pow(secondBase - firstBase, 2) / 4, 0.5);
        return (firstBase + secondBase) / 2 * h;
    }
}
