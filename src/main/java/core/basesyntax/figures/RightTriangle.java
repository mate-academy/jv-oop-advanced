package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.suppliers.AreaSupplier;

public class RightTriangle extends Figure {
    @Override
    public String figureInfo() {
        double legA = new AreaSupplier().getRandomValue();
        double legB = new AreaSupplier().getRandomValue();
        StringBuilder builder = new StringBuilder();
        builder.append(", ")
                .append("Leg a: ")
                .append(legA)
                .append(", ")
                .append("Leg b: ")
                .append(legB)
                .append(", ")
                .append("Area: ")
                .append(legA * legB);
        return super.figureInfo() + builder;
    }
}
