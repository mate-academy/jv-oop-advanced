package core.basesyntax;

public class Square extends Figure {
    private int sideA;

    public Square(int sideA, Color color) {
        this.setColor(color);
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
                + "color: " + this.getColor()
        );
    }
}
