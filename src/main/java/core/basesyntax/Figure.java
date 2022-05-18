package core.basesyntax;

public abstract class Figure implements AreaCalculator, InformationPrinter {
    private String color;

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
