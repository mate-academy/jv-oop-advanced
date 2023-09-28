package core.basesyntax.model;

import static core.basesyntax.constants.AreaCalculationConstants.TWO;
import static core.basesyntax.constants.StringBuildingConstants.COMMA;
import static core.basesyntax.constants.StringBuildingConstants.SPACE;

public class Circle extends Figure {

    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * Math.pow(radius, TWO));
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder("Figure:");
        builder.append(" circle").append(COMMA)
                .append(" area: ").append(getArea()).append(SPACE)
                .append("sq.units").append(COMMA)
                .append(" radius: ").append(radius).append(SPACE)
                .append("units").append(COMMA)
                .append(" color: ").append(color);
        System.out.println(builder);
    }
}
