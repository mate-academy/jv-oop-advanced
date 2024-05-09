package core.basesyntax;

import abstracts.Figure;
import enums.Colors;

public class IsoscelesTrapezoid extends Figure {
    private double mainSideTop;
    private double mainSideDown;
    private double high;

    public IsoscelesTrapezoid(
            Colors color,
            double mainSideTop,
            double mainSideDown,
            double high) {
        super(color);

        this.mainSideTop = mainSideTop;
        this.mainSideDown = mainSideDown;
        this.high = high;
    }

    public double getMainSideTop() {
        return this.mainSideTop;
    }

    public double getMainSideDown() {
        return this.mainSideDown;
    }

    public double getHigh() {
        return this.high;
    }

    @Override
    public double getArea() {
        return ((this.getMainSideTop() + this.getMainSideDown()) / 2) * this.getHigh();
    }

    @Override
    public void draw() {
        System.out.println("Figure: Trapezoid, area: "
                + this.getArea()
                + " sq. units, "
                + "topMainSide: "
                + this.getMainSideTop()
                + " units, "
                + "bottomMainSide: "
                + this.getMainSideDown()
                + " units, "
                + "high: "
                + this.getHigh()
                + " units, color: "
                + this.getColor());
    }
}
