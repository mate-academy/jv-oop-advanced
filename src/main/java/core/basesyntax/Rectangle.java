package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(String color, String name, int sideA, int sideB) {
        super(color, name);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    @Override
    public void getFigureInfo() {
        System.out.println("Figure: " + getName() + ", area: " + area() + " sq. units, side A: "
                + getSideA() + ", side B: " + getSideB() + ", color: " + getColor());
    }

    @Override
    public double area() {
        return sideA * sideB;
    }
}
