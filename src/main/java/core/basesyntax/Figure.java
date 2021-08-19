package core.basesyntax;

public abstract class Figure implements AreaCalculator, InformationDrawer {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
