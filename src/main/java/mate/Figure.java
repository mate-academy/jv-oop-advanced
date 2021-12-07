package mate;

public abstract class Figure implements CalculaterArea, Drawable {

    private String color;
    private int radius;

    public Figure(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    public Figure() {
    }

    @Override
    public String toString() {
        return "Figure: Circle"
                +
                ", color='" + color + '\''
                +
                ", radius=" + radius
                +
                '}';
    }

    @Override
    public double getArea() {
        return 0;
    }

}

