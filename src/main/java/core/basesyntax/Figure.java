package core.basesyntax;

public abstract class Figure implements Area, Perimeter, Height {

    private String color = Colors.WHITE.name();

    public Figure() {
    }

    public Figure(String color) {
        this.color = color;
    }

    public void setString(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getHeight() {
        return 0.0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    public abstract void draw();
}
