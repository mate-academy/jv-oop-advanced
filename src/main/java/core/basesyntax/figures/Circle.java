package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Circle extends Figure {
    @Override
    public String figureInfo() {
        double radius = Math.sqrt(7 * getFigureArea() / 22);
        StringBuilder builder = new StringBuilder();
        builder.append(", ")
                .append("Radius: ")
                .append(radius)
                .append(", ")
                .append("Diameter: ")
                .append(radius + radius);
        return super.figureInfo() + builder;
    }
}
