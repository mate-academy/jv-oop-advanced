package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawer {
    private String color;

    public void setString(String color) {
        this.color = color;
    }
}
