package core.basesyntax;

public abstract class Figure implements InformationPrint, AreaCalculator {
    private String color;
    private String type;

    public String getType() {
        return type;
    }

    public Figure setType(String type) {
        this.type = type;
        return this;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
