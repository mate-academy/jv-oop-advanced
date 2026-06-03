package core.basesyntax.figures;

import java.util.Map;

public abstract class Figure implements Drawable, AreaCalculator {
    private final String color;
    private final String type;
    private final Double area;
    private final Map<String, Integer> parameters;

    protected Figure(String color, Double area, Map<String, Integer> parameters) {
        this.color = color;
        this.type = getTypeFromClass(getClass());
        this.area = area;
        this.parameters = parameters;
    }

    @Override
    public double getArea() {
        return area;
    }

    private static String getTypeFromClass(Class<?> clazz) {
        return clazz.getSimpleName()
                .replaceAll("([a-z])([A-Z])", "$1 $2")
                .toLowerCase();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Figure: ")
                .append(type)
                .append(", area: ")
                .append(area)
                .append(" sq. units, ");

        boolean first = true;

        for (Map.Entry<String, Integer> entry : parameters.entrySet()) {
            if (!first) {
                sb.append(", ");
            }

            sb.append(entry.getKey())
                    .append(": ")
                    .append(entry.getValue())
                    .append(" units");

            first = false;
        }

        sb.append(", color: ")
                .append(color);

        return sb.toString();
    }
}
