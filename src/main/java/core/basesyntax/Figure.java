package core.basesyntax;

public abstract class Figure {
    private String color;

    // CONSTRUCTORS
    public Figure() {
        ColorSupplier cs = new ColorSupplier();
        this.color = cs.getRandomColor();
    }

    // GETTERS & SETTERS
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
