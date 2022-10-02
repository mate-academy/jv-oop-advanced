package core.basesyntax;

public class Square extends Figure {
    private final int sideA;

    public Square(String name, String color, int sideA) {
        super(name, color);
        this.sideA = sideA;
    }

    public int getSideA() {
        return sideA;
    }
    @Override
    public double areaCalculation() {
        return sideA * sideA;
    }
    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + areaCalculation()
                + " sq.units," + " side: " + getSideA() + " units," + " color: " + getColor());
    }
}
