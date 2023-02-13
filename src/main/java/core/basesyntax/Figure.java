package core.basesyntax;

public class Figure {
    protected String color;

    public Figure(){

    }

    public Figure(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figure: " + getClass().getSimpleName()
                + ", color: " + color;
    }
}
