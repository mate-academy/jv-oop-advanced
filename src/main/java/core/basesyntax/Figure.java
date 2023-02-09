package core.basesyntax;

public abstract class Figure implements Item {
    public static final int MAX_VALUE = 50;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public abstract String toString();
}
