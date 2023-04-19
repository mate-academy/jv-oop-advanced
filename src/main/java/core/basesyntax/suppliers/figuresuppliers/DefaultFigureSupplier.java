package core.basesyntax.suppliers.figuresuppliers;

import core.basesyntax.enums.Color;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;

public class DefaultFigureSupplier {
    private final Color defaultColor;
    private final int defaultRadius;

    public DefaultFigureSupplier(Color defaultColor, int defaultRadius) {
        this.defaultColor = defaultColor;
        this.defaultRadius = defaultRadius;
    }

    public Figure getDefualtFigure() {
        return new Circle(defaultColor.name(), defaultRadius);
    }
}
