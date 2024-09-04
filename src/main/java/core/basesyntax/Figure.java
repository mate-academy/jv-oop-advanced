package core.basesyntax;

public abstract class Figure implements AreaComputable, Drawable{
    private final String color;

    public String getColor() {
        return color;
    }

    Figure(String color) {
        this.color = color;
    }
}
