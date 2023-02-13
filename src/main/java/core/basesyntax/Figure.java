package core.basesyntax;

public class Figure implements AreaCalculator {
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

    @Override
    public float getArea() {
        return 0;
    }
}
