package core.basesyntax.figuretype;

import core.basesyntax.figure.Area;
import core.basesyntax.figure.Draw;
import core.basesyntax.figure.Figure;
import java.util.Locale;

public class Circle extends Figure implements Area, Draw {
    private int radius;

    @Override
    public String getArea() {
        return String.format(Locale.ROOT, "%.1f", Math.PI * radius * radius);
    }

    @Override
    public void toDraw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: ").append(getName()).append(", area: ")
                .append(getArea()).append(" sq.units, radius: ").append(getRadius())
                .append(" units, color: ").append(getColor());
        System.out.println(builder.toString());
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
