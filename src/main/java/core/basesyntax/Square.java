package core.basesyntax;

public class Square extends Figure implements AreaCalculator, Drawer {
    private int sideA;

    public Square(int sideA, Color color) {
        this.color = color;
        this.sideA = sideA;
    }

    @Override
    public double getArea() {
        return sideA * sideA;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, "
            + "area: " + getArea() + " sq. units, "
            + "side: " + sideA + " units, "
            + "color: " + color
        );
    }
}
