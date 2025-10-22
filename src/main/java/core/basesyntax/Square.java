package core.basesyntax;

public class Square extends Figures {
    private int sideA;

    public Square(String color, int sideA) {
        super(color, "Square");
        this.sideA = sideA;
    }

    @Override
    public double getArea() {
        return sideA * sideA;
    }

    public int getSideA() {
        return sideA;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq. units, side: "
                + sideA + ", color: " + getColor());
    }
}
