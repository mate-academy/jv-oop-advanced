package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    //private String figure;
    private String color;

    public void setColor(String color) {
        this.color = color;
    }
}
