package core.basesyntax;

public enum FigureType {
    SQUARE("Square"),
    RECTANGLE("Rectangle"),
    TRIANGLE("RightTriangle"),
    CIRCLE("Circle"),
    TRAPEZOID("IsoscelesTrapezoid");

    private final String value;

    FigureType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
