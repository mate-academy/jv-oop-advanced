package core.basesyntax;

import jdk.jshell.spi.SPIResolutionException;

public class IsoscelesTrapezoid extends Figure {
    private double baseLeg;
    private double topLeg;
    private double sideLeg;
    private double height;

    public IsoscelesTrapezoid(String color, double baseLeg, double topLeg, double sideLeg) {
        super(color);
        this.baseLeg = baseLeg;
        this.topLeg = topLeg;
        this.sideLeg = sideLeg;
    }


    @Override
    public double calculateArea() {
        height = Math.sqrt((4 * Math.pow(sideLeg, 2))
                - Math.pow((topLeg > baseLeg ? topLeg - baseLeg : baseLeg - topLeg), 2));
        return ((topLeg + baseLeg) * height) / 2;
    }

    @Override
    public String display() {
        return "Figure: right rectangle, area " + String.format("%.2f", calculateArea()) + " sq. units, baseLeg "
                + baseLeg + " units, topLeg " + topLeg + " units, sideLeg " + sideLeg + " units, color: " + getColor();
    }
}
