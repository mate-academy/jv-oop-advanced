package core.basesyntax;

public class Rectangle extends Square {
    private final int sideB;

    public Rectangle(String name, String color, int sideA, int sideB) {
        super(name, color, sideA);
        this.sideB = sideB;
    }

    public int getSideB() {
        return sideB;
    }

    @Override
    public double getArea() {
        return getSideA() * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq.units," + " sideA: " + getSideA() + " units," + " sideB: "
                + getSideB() + " units," + " color: " + getColor());
    }
}
