package core.basesyntax;

public abstract class Figure implements Printeble, AreaCalculateble {
    private String color;

    Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
