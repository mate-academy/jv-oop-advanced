package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(Color color, int sideA, int sideB) {
        super(sideA * sideB, color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, "
                + "sideA length: " + sideA + " units, " + "sideB length: " + sideB
                + " color = " + getColor());
    }
}


