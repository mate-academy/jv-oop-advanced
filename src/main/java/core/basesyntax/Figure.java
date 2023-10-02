package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator, PerimeterCalculator {
    private String defColor;

    public Figure() {
    }

    public Figure(String color) {
        this.defColor = color;
    }

    public String getDefColor() {
        return defColor;
    }

}
