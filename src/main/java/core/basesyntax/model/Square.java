package core.basesyntax.model;

import static core.basesyntax.constants.StringBuildingConstants.COMMA;
import static core.basesyntax.constants.StringBuildingConstants.SPACE;

public class Square extends Figure {

    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder("Figure:");
        builder.append(" square").append(COMMA)
                .append(" area: ").append(getArea()).append(SPACE)
                .append("sq.units").append(COMMA)
                .append(" side: ").append(side).append(SPACE)
                .append("units").append(COMMA)
                .append(" color: ").append(color);
        System.out.println(builder);
    }
}
