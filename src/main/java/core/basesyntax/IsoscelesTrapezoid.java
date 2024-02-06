package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double leg;
    private double firstBase;
    private double secondBase;

    public IsoscelesTrapezoid(Color color, double leg, double firstBase, double secondBase) {
        super(color);
        this.leg = leg;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
    }

    @Override
    public double getArea() {
        double h = Math.sqrt(Math.pow(leg, 2.0) - Math.pow((firstBase - secondBase), 2.0) / 4.0);
        return (firstBase + secondBase) * h / 2.0;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: isosceles trapezoid, ")
                .append("area: ").append(getArea()).append(" sq.units, ")
                .append("leg: ").append(leg).append(" units, ")
                .append("firstBase: ").append(firstBase).append(" units, ")
                .append("secondBase: ").append(secondBase).append(" units, ")
                .append("color: ").append(color);

        System.out.println(stringBuilder.toString());
    }
}
