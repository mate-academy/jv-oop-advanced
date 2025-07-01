package core.basesyntax;

public abstract class Figure implements AreaCalculater {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract String draw();

}
