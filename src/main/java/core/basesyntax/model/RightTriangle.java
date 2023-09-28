package core.basesyntax.model;

import static core.basesyntax.constants.AreaCalculationConstants.ZERO_POINT_FIVE;
import static core.basesyntax.constants.StringBuildingConstants.COMMA;
import static core.basesyntax.constants.StringBuildingConstants.SPACE;

public class RightTriangle extends Figure {

    private final double hypotenuse;
    private final int legHeight;
    private final int legBase;

    public RightTriangle(String color, double hypotenuse, int legHeight, int legBase) {
        super(color);
        this.hypotenuse = hypotenuse;
        this.legHeight = legHeight;
        this.legBase = legBase;
    }

    @Override
    public double getArea() {
        return Math.round(legBase * legHeight * ZERO_POINT_FIVE);
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder("Figure:");
        builder.append(" right triangle").append(COMMA)
                .append(" area: ").append(getArea()).append(SPACE)
                .append("sq.units").append(COMMA)
                .append(" hypotenuse: ").append(hypotenuse).append(SPACE)
                .append("units").append(COMMA)
                .append(" legHeight: ").append(legHeight).append(SPACE)
                .append("units").append(COMMA)
                .append(" legBase: ").append(legBase).append(SPACE)
                .append("units").append(COMMA)
                .append(" color: ").append(color);
        System.out.println(builder);
    }
}
