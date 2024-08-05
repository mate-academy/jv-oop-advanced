package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    public static final int REQUESTED_LENGTH = 6;
    private String color;
    private String name;

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

}
