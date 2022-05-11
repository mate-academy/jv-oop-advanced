package core.basesyntax;

public abstract class Figure implements Drawing {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double area(); //to make new commit
}
