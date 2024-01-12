package core.basesyntax;

import java.text.DecimalFormat;

public class IsoscelesTrapezoid extends FigureSupplier {
    private int baseOne;
    private int baseTwo;
    private int height;
    private ColorSupplier colorSupplier;

    public IsoscelesTrapezoid() {
        this.baseOne = getRandomFigure();
        this.baseTwo = getRandomFigure();
        this.height = getRandomFigure();
        this.colorSupplier = new ColorSupplier();
    }

    @Override
    public double getArea() {
        return 0.5 * (baseOne * baseTwo) * height;
    }

    @Override
    public void draw() {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Name: IsoscelesTrapezoid, baseOne: " + baseOne + ", baseTwo: "
                + baseTwo + ", height:" + height + ", area: " + df.format(getArea())
                + ", color: " + ColorSupplier.getRandomColor());
    }
}
