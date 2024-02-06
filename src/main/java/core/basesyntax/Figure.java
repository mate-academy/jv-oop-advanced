package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable, ValueRefactorer {
    private final String colour;

    protected Figure(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}
