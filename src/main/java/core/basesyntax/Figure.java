package core.basesyntax;

public abstract class Figure implements Drawing, CalculatorOfArea {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

