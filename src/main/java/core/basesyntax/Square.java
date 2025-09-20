package core.basesyntax;

public class Square extends Figure {
    private int sidesize;

    public Square(int sidesize, Color color) {
        this.sidesize = sidesize;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.pow(sidesize, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName() + ","
                + " area: " + getArea() + " sq. units, "
                + "color: " + color);
    }
}
