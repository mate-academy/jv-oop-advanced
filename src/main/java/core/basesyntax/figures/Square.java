package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Square extends Figure {
    @Override
    public String figureInfo() {
        double side = Math.sqrt(getFigureArea());
        StringBuilder builder = new StringBuilder();
        builder.append(", ")
                .append("Side length: ")
                .append(side);
        return super.figureInfo() + builder;
    }
}
