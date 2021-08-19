package core.basesyntax;

public abstract class Figure implements AreaCalculator, InfoPrinter {
    private String color;
    private String type;

    public Figure(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
