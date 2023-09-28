package core.basesyntax.model;

import static core.basesyntax.constants.StringBuildingConstants.COMMA;
import static core.basesyntax.constants.StringBuildingConstants.SPACE;

public class Rectangle extends Figure {

    private final int width;
    private final int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder("Figure:");
        builder.append(" rectangle").append(COMMA)
                .append(" area: ").append(getArea()).append(SPACE)
                .append("sq.units").append(COMMA)
                .append(" width: ").append(width).append(SPACE)
                .append("units").append(COMMA)
                .append(" height: ").append(height).append(SPACE)
                .append("units").append(COMMA)
                .append(" color: ").append(color);
        System.out.println(builder);
    }
}
