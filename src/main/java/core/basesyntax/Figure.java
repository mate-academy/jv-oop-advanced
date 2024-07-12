package core.basesyntax;

public abstract class Figure implements FigureArea,DrawFIgure {
    private String color = new ColorSupplier().getRandomColor();

    public String getColor() {
        return color;
    }
}
