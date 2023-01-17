package core.basesyntax;

public class Figure implements Drawing {
    private String color;

    public Figure(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
}
