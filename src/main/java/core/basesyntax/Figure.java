package core.basesyntax;

public abstract class Figure implements Printable,Calculatable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public abstract void toDraw();

    @Override
    public abstract double getArea();
}
