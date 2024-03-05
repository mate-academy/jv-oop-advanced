package core.basesyntax;

public abstract class Figure implements Drawable, Colorful {
    protected String color;

    public Figure() {
        this.color = "white";
    }

    public interface Drawable {
        void draw();
    }

    public interface Colorful {
        String getColor();
    }

    public Figure(String color) {
        this.color = color;
    }

    public abstract double getArea();
    public abstract void draw();
    public String getColor() {
        return color;
    }
}

