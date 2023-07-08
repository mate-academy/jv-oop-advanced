package core.basesyntax;

abstract class Figure implements AbstractFigure, AbstractColor {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();

    public void draw() {
        System.out.println("Фігура: " + getClass().getSimpleName()
                + ", площа: " + getArea() + ", колір: " + color);
    }
}
