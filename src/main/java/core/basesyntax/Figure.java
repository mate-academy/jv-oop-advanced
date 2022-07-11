package core.basesyntax;

public abstract class Figure implements AreaCalculator, DrawMachine {
    private String color;

    public Figure() {

    }

    public void draw() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
