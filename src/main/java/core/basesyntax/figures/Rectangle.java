package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.suppliers.AreaSupplier;

public class Rectangle extends Figure {
    @Override
    public String figureInfo() {
        double width = new AreaSupplier().getRandomValue();
        double length = new AreaSupplier().getRandomValue();
        StringBuilder builder = new StringBuilder();
        builder.append(", ")
                .append("Width: ")
                .append(width)
                .append(", ")
                .append("Length: ")
                .append(length)
                .append(", Area: ")
                .append(width * length);
        return super.figureInfo() + builder;
    }
}
