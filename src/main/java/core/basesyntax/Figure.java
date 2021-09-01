package core.basesyntax;

public abstract class Figure extends ColourSupplier implements Area, AreaDrawing {
    public String getColor() {
        String colors = getColors();
        return colors;
    }
}
