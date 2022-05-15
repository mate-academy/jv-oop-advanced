package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.suppliers.AreaSupplier;

public class IsoscelesTrapezoid extends Figure {
    @Override
    public String figureInfo() {
        double baseA = new AreaSupplier().getRandomValue();
        double baseB = new AreaSupplier().getRandomValue();
        double height = new AreaSupplier().getRandomValue();
        StringBuilder builder = new StringBuilder();
        builder.append(", ")
                .append("Base a: ")
                .append(baseA)
                .append(", ")
                .append("Base b: ")
                .append(baseB)
                .append(", ")
                .append("Height: ")
                .append(height)
                .append(", ")
                .append("Area: ")
                .append((baseA + baseB) * height / 2);
        return super.figureInfo() + builder;
    }
}
