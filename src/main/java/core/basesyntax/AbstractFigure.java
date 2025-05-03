package core.basesyntax;

public abstract class AbstractFigure implements Figure {
    private String color; // Change to String

    public String getColor() { // Return type matches the interface
        return color;
    }
}