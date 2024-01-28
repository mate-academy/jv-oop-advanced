package core.basesyntax;

import java.text.DecimalFormat;

public class IsoscelesTrapezoid extends Figure {
    private int baseOne;
    private int baseTwo;
    private int height;
    private String color;

    public IsoscelesTrapezoid(Figure.FigureSupplier figureSupplier, ColorSupplier colorSupplier) {
        this.baseOne = figureSupplier.getRandomFigure();
        this.baseTwo = figureSupplier.getRandomFigure();
        this.height = figureSupplier.getRandomFigure();
        this.color = colorSupplier.getRandomColor();
    }

    @Override
    public double getArea() {
        return 0.5 * (baseOne + baseTwo) * height;
    }

    @Override
    public void draw() {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Name: isoscelesTrapezoid, baseOne: " + baseOne + ", baseTwo: "
                + baseTwo + ", height:" + height + ", area: " + df.format(getArea())
                + ", color: " + color);
    }
}
