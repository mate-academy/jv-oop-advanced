package core.basesyntax;

public abstract class Figure implements DrawAble, AreaCalculable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
