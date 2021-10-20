package core.basesyntax;

abstract class Figure implements AreaFinder, FigureInfo {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    @Override
    public abstract void printInfo();

    public String getColor() {
        return color;
    }
}
