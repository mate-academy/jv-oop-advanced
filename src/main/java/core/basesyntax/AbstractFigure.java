package core.basesyntax;

public abstract class  AbstractFigure {

    protected String color;

    public String getColor() {
        return color;
    }

    public AbstractFigure(String color) {
        this.color = color;
    }
}
