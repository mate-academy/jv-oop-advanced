package core.basesyntax;

public abstract class Figure extends CollorSupplier implements AreaCalculator, InformationDrawer {
    private String color;

    public void setColor() {
        this.color = getRandomColor();
    }

    public String getColor() {
        return this.color;
    }
}
