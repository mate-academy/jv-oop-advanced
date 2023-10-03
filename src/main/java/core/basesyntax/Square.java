package core.basesyntax;

public class Square extends Figure {
    private double sideA;

    public Square(String color, double sideA) {
        super(color);
        this.sideA = sideA;
    }

    @Override
    public double getArea() {
        return sideA * sideA;
    }

    @Override
    public void draw() {
        System.out.println("Figure : square "
                + ", area: " + getArea() + "sq.units, side: "
                + sideA + "units, color: " + getColor());
    }
}
