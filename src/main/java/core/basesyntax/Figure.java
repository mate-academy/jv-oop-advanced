package core.basesyntax;

public abstract class Figure implements AreaDrawing {
    private String color;

    public Figure() {
    }

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public abstract void paint();
}
