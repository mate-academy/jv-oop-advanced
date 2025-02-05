package core.basesyntax;

public abstract class Shape {
    protected String color;

    public Shape (String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
