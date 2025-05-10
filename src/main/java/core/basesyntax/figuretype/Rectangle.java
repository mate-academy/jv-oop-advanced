package core.basesyntax.figuretype;

import core.basesyntax.figure.Figure;
import java.util.Locale;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle() {
        setName("rectangle");
    }

    @Override
    public String getArea() {
        return String.format(Locale.ROOT,"%.1f", (double) length * width);
    }

    @Override
    public void toDraw() {
        StringBuilder informationBuilder = new StringBuilder();
        informationBuilder.append("Figure: ").append(getName()).append(", area: ")
                .append(getArea()).append(" sq.units, length: ")
                .append(getLength()).append(" units, width: ").append(getWidth())
                .append(" units, color: ").append(getColor());
        System.out.println(informationBuilder.toString());
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
