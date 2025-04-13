//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package core.basesyntax;

import java.io.PrintStream;

public class IsoscelesTrapezoid extends Figure {
    private final double base1;
    private final double base2;
    private final double height;

    public IsoscelesTrapezoid(String color, double base1, double base2, double height) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    public double getArea() {
        return (this.base1 + this.base2) * this.height / (double)2.0F;
    }

    public void draw() {
        PrintStream var10000 = System.out;
        double var10001 = this.getArea();
        var10000.println("Figure: isosceles trapezoid, area: " + var10001 + " sq. units, base1: " + this.base1 + ", base2: " + this.base2 + ", height: " + this.height + ", color: " + this.getColor());
    }
}
