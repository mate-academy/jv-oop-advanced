package core.basesyntax;

public abstract class Figure implements AreaCalculator, Information {
    private String color = new ColorSupplier().getRandomColor();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
