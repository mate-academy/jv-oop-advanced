package core.basesyntax;

abstract class Figure implements FigureInterface {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
