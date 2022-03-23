package core.basesyntax.figure;

public class Rectangle extends Figure {
    private final int sideA;
    private final int sideB;

    public Rectangle(String color, int sideB, int sideA) {
        super(color);
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
    public double countArea() {
        return sideB * sideA;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", rectangle: "
                + countArea() + " sq. units, color " + getColor()
                + ", SideA " + getSideA() + " SideB " + getSideB());

    }
}
