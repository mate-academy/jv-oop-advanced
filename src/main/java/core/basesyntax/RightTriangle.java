package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure {
    private double rightTriangleSide;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public RightTriangle(double area, String color, double rightTriangleSide) {
        super(area, color);
        this.rightTriangleSide = rightTriangleSide;
    }

    public RightTriangle() {

    }

    @Override
    public double countArea() {
        return 0.5 * rightTriangleSide * rightTriangleSide;
    }

    public double getRightTriangleSide() {
        return rightTriangleSide;
    }

    @Override
    public void draw() {
        RightTriangle randomRightTriangle = getRandomRightTriangle();
        System.out.println("Figure: RightTriangle, area: "
                + randomRightTriangle.countArea() + " sq.units, side: "
                + randomRightTriangle.getRightTriangleSide() + " units, color: "
                + colorSupplier.getRandomColor());
    }

    public RightTriangle getRandomRightTriangle() {
        return new RightTriangle(countArea(), colorSupplier.getRandomColor(), random.nextInt(100));
    }
}
