package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public abstract class Figure implements Area {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public abstract void printInfo();
}
