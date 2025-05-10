package core.basesyntax;

public abstract class Figure implements AreaCalculator, InformationPrinter {
    protected String color;

    public Figure(String randomColor) {
        this.color = randomColor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
