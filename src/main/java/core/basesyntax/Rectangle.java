//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package core.basesyntax;

import java.io.PrintStream;

public class Rectangle extends Figure {
    private final double width;
    private final double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public void draw() {
        PrintStream var10000 = System.out;
        double var10001 = this.getArea();
        var10000.println("Figure: rectangle, area: " + var10001 + " sq. units, width: " + this.width + ", height: " + this.height + ", color: " + this.getColor());
    }
}
