package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Calculable_Area {
    private final double firstBase;
    private final double secondBase;
    private final double height;

    public IsoscelesTrapezoid(String color, double firstBase, double secondBase, double height) {
        super("Isosceles Trapezoid", color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) * height * 0.5;
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

    private String[] getProperties() {
        return new String[]{
                "first base: " + firstBase + " units",
                "second base: " + secondBase + " units",
                "height: " + height + " units"
        };
    }
}
