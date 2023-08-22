package core.basesyntax.suppliers;

import core.basesyntax.enums.FigureType;

public class NameSupplier {
    public String getCircleName() {
        return FigureType.CIRCLE.name().toLowerCase();
    }

    public String getSquareName() {
        return FigureType.SQUARE.name().toLowerCase();
    }

    public String getTrapezoidName() {
        return FigureType.TRAPEZOID.name().toLowerCase();
    }

    public String getTriangleName() {
        return FigureType.TRIANGLE.name().toLowerCase();
    }

    public String getRectangleName() {
        return FigureType.RECTANGLE.name().toLowerCase();
    }
}
