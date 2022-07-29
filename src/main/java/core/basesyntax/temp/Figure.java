package core.basesyntax.temp;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void getArea() {
    }

    @Override
    public void draw() {
    }

}

