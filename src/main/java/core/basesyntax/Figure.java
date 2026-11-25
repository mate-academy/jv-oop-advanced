package core.basesyntax;


abstract class Figure implements Drawable, AreaCalculator {
    String color;

    Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    void printColor() {
        System.out.println("Колір: " + color);
    }
}
