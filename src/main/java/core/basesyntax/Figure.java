package core.basesyntax;

public abstract class Figure implements CalculatorOfArea {
    public Figure(String color) {
        this.color = color;
    }

    public Figure() {
    }

    private String color;

    public String getColor() {
        return color;
    }
}
