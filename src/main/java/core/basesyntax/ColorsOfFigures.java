package core.basesyntax;

abstract class ColorsOfFigures implements FigureArea, FigureOutput {
    private String color;

    public ColorsOfFigures(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
