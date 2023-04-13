package core.basesyntax;

public class Figure implements Area, Drawable {
    public String color;
    public Figure(String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {

    }
}
