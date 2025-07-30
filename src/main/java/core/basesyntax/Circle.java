package core.basesyntax;

public class Circle extends Figure implements Calculable_Area {
    private final double radius;

    public Circle(String color, double radius) {
        super("Circle", color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    private String[] getProperties() {
        return new String[]{"radius: " + radius + " units"};
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: ")
                .append(figureType).append(", ")
                .append("area: ")
                .append(getArea())
                .append(" square units, ");
        for (String property : getProperties()) {
            stringBuilder.append(property).append(" ");
        }
        stringBuilder.append("color: ").append(color);
        System.out.println(stringBuilder.toString());
    }
}
