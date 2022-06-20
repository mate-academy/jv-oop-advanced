package core.basesyntax;

public abstract class Figure implements FigureSupplier, AreaCalculator, Drawable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public Figure() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
