package core.basesyntax;

abstract class Figure implements Canvas, AreaCalculator {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
