package core.basesyntax;

public class RightTriangle extends Figure {
    private double side;

    public RightTriangle(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("I'm a right triangle with ")
                .append(getColor())
                .append(" color")
                .append(" and ")
                .append(getArea())
                .append(" m^2 area");
        System.out.println(builder);
    }

    @Override
    public double getArea() {
        double preRound = (Math.sqrt(3) / 4) * side * side;
        String result = String.format("%.3f", preRound);
        return Double.parseDouble(result);
    }
}
