package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    protected String color;

    public Figure(){
    }

    public Figure(String color) {
        this.color = color;
    }

    @Override
    public String draw() {
        return "Figure: " + getClass().getSimpleName()
                + ", color: " + color;
    }
}
