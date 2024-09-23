package core.basesyntax;

public abstract class Figure {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double calculateArea() {
        return 1.;
    }

    public void drawFigure () {
        System.out.println("Drawing a figure.");
    }
}
