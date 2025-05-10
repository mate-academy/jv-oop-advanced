package core.basesyntax;

public class Rectangle extends Figure implements Drawable {
    private final int sideA;
    private final int sideB;

    public Rectangle(String name, String color, int sideA, int sideB) {
        super(name, color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public double getAreaFigures() {
        return getArea(sideA * sideB);
    }

    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getAreaFigures() + " sq.units, "
                + "sideA: " + getSideA() + " units, "
                + "sideB: " + getSideB() + " units "
                + "color: " + getColor());
    }
}
