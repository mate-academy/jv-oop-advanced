package core.basesyntax;

public abstract class Figure {
    protected String color;
    public abstract void draw();
    public String getColor() {
        return this.color;
    };
}
