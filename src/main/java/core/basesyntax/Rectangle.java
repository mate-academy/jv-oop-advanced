package core.basesyntax;

public class Rectangle extends Figure implements Calculable_Area {
    private final double width;
    private final double height;

    public Rectangle(String color, double width, double height) {
        super("Rectangle", color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
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
                "width: " + width + " units",
                "height: " + height + " units"
        };
    }
}
