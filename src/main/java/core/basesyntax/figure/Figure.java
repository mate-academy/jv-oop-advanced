package core.basesyntax.figure;

public abstract class Figure implements Drawwable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();
}
