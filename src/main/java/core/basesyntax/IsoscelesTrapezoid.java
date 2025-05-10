package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double leg;

    public IsoscelesTrapezoid(String color, double firstBase, double secondBase, double leg) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.leg = leg;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("I'm a isosceles trapezoid with ")
                .append(getColor())
                .append(" color")
                .append(" and ")
                .append(getArea())
                .append(" m^2 area");
        System.out.println(builder);
    }

    @Override
    public double getArea() {
        double preRound = ((firstBase + secondBase) / 2)
                * Math.sqrt(((Math.pow(leg, 2))
                - ((Math.pow(firstBase - secondBase, 2)) / 4)));
        String result = String.format("%.3f", preRound);
        return Double.parseDouble(result);
    }
}
