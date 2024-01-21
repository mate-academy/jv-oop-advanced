package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getHypotenuse() {
        return 0;
    }

    public double getDiagonal() {
        return 0;
    }

}
