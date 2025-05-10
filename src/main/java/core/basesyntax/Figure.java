package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public abstract class Figure implements AreaCalcualtor, Printable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
