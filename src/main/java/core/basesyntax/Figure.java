package core.basesyntax;

public abstract class Figure implements AreaDrawable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getRandomColor() {
        return color;
    }
}

