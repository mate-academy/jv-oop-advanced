package core.basesyntax;

public enum FigureType {
    SQUARE("Square"),
    RECTANGLE("Rectangle"),
    TRIANGLE("RightTriangle"),
    CIRCLE("Circle"),
    TRAPEZOID("IsoscelesTrapezoid");

    final String value;

    FigureType(String value) {
        this.value = value;
    }
}
