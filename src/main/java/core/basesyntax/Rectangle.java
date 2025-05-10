package core.basesyntax;

public class Rectangle extends Figure {
    private static final String FIGURE = "rectangle";
    private int sideA;
    private int sideB;

    protected Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double findArea() {
        return sideA * sideB;
    }

    @Override
    public String toDraw() {
        return "Figure: " + FIGURE + ", area: " + findArea() + ", side a: " + this.sideA
                + ", side b: " + this.sideB
                + ", color: "
                + this.color;
    }
}
