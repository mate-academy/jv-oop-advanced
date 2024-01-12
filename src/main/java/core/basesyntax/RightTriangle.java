package core.basesyntax;

import java.text.DecimalFormat;

public class RightTriangle extends FigureSupplier {
    private int firstLeg;
    private int secondLeg;
    private String color;

    public RightTriangle() {
        this.firstLeg = getRandomFigure();
        this.secondLeg = getRandomFigure();
        this.color = ColorSupplier.getRandomColor();
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Name: RightTriangle, firstLeg: " + firstLeg + ", secondLeg: "
                + secondLeg + ", area: " + df.format(getArea()) + ", color: " + color);
    }

}
