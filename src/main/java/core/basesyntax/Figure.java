package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private String name;
    private String colour;

    public Figure(String colour, String name) {
        this.name = name;
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public String getName() {
        return name;
    }
}
