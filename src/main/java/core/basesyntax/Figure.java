package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {

    protected double radius;
    protected String color;

    public Figure(String color) {

        this.color = color;
    }

    public String getColor() {

        return color;
    }

    public void setColor() {

        this.color = color;
    }
}
