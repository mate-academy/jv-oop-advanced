package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double gerArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "Rectangle " + "\n" + "sideA " + "= " + sideA + " units" + "\n" + "sideB "
                + "= " + sideB + " units" + "\n" + "area " + "= " + gerArea() + " sq.units" + "\n" + "colors " + "= "
                + getColor());
    }
}
