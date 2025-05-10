package core.basesyntax;

public abstract class Figure implements Area, Drawing {
    private final Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public String getColor() {
        return color.getValue();
    }
}
