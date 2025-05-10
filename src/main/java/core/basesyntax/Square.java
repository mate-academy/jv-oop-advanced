package core.basesyntax;

public class Square extends Figure {
    private int sideA;

    public Square(String color, int sideA) {
        super(color);
        this.sideA = sideA;
    }

    @Override
    public double getArea() {
        return sideA * sideA;
    }

    @Override
    public void draw() {
        System.out.println("Figure " + getClass().getSimpleName() + ", area: "
                + getArea() + " sq.units, side: "
                + sideA + " units, color: " + getColor());
    }
}
