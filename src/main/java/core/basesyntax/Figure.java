package core.basesyntax;

public abstract class Figure implements Printer, AreaCalculator {
    private String name;
    private String color;

    public Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String randomColour) {
    }

    public void drawFigure() {
    }

    @Override
    public double calculateArea() {
        return 0;
    }
}
