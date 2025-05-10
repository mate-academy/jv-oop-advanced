package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("I'm a circle with ")
                .append(getColor())
                .append(" color").append(" and ")
                .append(getArea()).append(" m^2 area");
        System.out.println(builder);
    }

    @Override
    public double getArea() {
        double preRound = Math.PI * Math.pow(radius, 2);
        String result = String.format("%.3f", preRound);
        return Double.parseDouble(result);
    }
}
