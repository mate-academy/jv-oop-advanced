package core.basesyntax;

public abstract class Figure implements Drawble, HasArea {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    @Override
    public abstract void draw();

    public String getColor() {
        return color;
    }
}
