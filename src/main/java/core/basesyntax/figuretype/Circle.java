package core.basesyntax.figuretype;

import core.basesyntax.figure.Figure;
import java.util.Locale;

public class Circle extends Figure {
    private int radius;

    public Circle() {
        setName("circle");
    }

    @Override
    public String getArea() {
        return String.format(Locale.ROOT, "%.1f", Math.PI * radius * radius);
    }

    @Override
    public void toDraw() {
        StringBuilder informationBuilder = new StringBuilder();
        informationBuilder.append("Figure: ").append(getName()).append(", area: ")
                .append(getArea()).append(" sq.units, radius: ").append(getRadius())
                .append(" units, color: ").append(getColor());
        System.out.println(informationBuilder.toString());
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
