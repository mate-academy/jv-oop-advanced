package core.basesyntax;

public abstract class Figure implements Area, Drawable {
    String color;
    double area;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public abstract void findArea();

}
