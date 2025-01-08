package core.basesyntax;

public abstract class Figure implements Shape, Colored {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    // Implement getColor() from Colored interface
    @Override
    public String getColor() {
        return color;
    }
}
