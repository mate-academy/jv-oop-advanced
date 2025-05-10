//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package core.basesyntax;

import java.io.PrintStream;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getArea() {
        return this.firstLeg * this.secondLeg / (double)2.0F;
    }

    public void draw() {
        PrintStream var10000 = System.out;
        double var10001 = this.getArea();
        var10000.println("Figure: triangle, area: " + var10001 + " sq. units, firstLeg: " + this.firstLeg + " units, secondLeg: " + this.secondLeg + " units, color: " + this.getColor());
    }
}
