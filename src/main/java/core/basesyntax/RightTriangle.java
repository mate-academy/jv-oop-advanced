// RightTriangle.java

// Add an empty line after package declaration
package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    // Add an empty line before constructor
    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq. units, firstLeg: "
                + firstLeg + " units, secondLeg: " + secondLeg + " units, color: " + color);
    }
}
