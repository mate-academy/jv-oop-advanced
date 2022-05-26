package core.basesyntax;

public abstract class Figure implements DrawAble {
    private String color;

    public Figure(String color) {
        this.color = color;

    }

    @Override
    public void draw() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
