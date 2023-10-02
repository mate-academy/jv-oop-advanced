package core.basesyntax;

public class Figure implements Drawable, Area {
    private String color;
    private double area;

    public Figure(double area, String color) {
    }

    public Figure() {

    }

    @Override
    public double countArea() {
        return 0;
    }

    @Override
    public void draw() {

    }
}
