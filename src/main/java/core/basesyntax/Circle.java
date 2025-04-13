//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package core.basesyntax;

import java.io.PrintStream;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public void draw() {
        PrintStream var10000 = System.out;
        double var10001 = this.getArea();
        var10000.println("Figure: circle, area: " + var10001 + " sq. units, radius: " + this.radius + " units, color: " + this.getColor());
    }
}
