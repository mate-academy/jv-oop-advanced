package core.basesyntax;

public class RightTriangle extends Figure {
    private int baseSide;
    private int heightSide;

    public RightTriangle(String color, int baseSide, int heightSide) {
        super(color);
        this.baseSide = baseSide;
        this.heightSide = heightSide;
    }

    @Override
    public double getArea() {
        return (baseSide * heightSide) * 0.5;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: Right_Triangle, area: " + getArea()
                        + " sq.units, side1: " + baseSide
                        + " units, side2: " + heightSide + " units, color: " + getColor());
    }
}

