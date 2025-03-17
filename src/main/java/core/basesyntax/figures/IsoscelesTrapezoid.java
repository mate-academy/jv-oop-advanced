package core.basesyntax.figures;

import core.basesyntax.ColorSupplier;
import java.util.Random;

public class IsoscelesTrapezoid extends Figure {

    private double firstWall;
    private double secondWall;
    private double height;

    public IsoscelesTrapezoid(String color, double firstWall, double secondWall, double height) {
        super(color);
        this.firstWall = firstWall;
        this.secondWall = secondWall;
        this.height = height;
    }

    public double getFirstWall() {
        return firstWall;
    }

    public void setFirstWall(double firstWall) {
        this.firstWall = firstWall;
    }

    public double getSecondWall() {
        return secondWall;
    }

    public void setSecondWall(double secondWall) {
        this.secondWall = secondWall;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((firstWall + secondWall) * height) / 2;
    }

    @Override
    public void draw() {
        String sb = "Figure: Isosceles Trapezoid, Color: " + getColor() + ", First Wall: " + getFirstWall() + ", Second Wall: " + getSecondWall() + ", Height: " + getHeight() + ", Area: " + getArea();

        System.out.println(sb);
    }
}
