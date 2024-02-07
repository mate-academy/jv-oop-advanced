package core.basesyntax.figures;

public abstract class Figure implements Drawable, Getarea {

    protected String color;

    public Figure(String color) {

        this.color = color;
    }

    public String getColor() {

        return color;
    }

    public void setColor() {

        this.color = color;
    }

    public abstract double getArea();

    public abstract void draw();
}
