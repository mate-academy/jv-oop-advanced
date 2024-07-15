package core.basesyntax;

abstract class Figure implements IFigure {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }
}

