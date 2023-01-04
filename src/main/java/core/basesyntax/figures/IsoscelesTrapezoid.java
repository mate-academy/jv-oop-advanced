package core.basesyntax.figures;

import core.basesyntax.templates.Drawable;
import core.basesyntax.templates.Figure;

public class IsoscelesTrapezoid extends Figure implements Drawable {
    private int sideA;
    private int sideB;
    private int angleA;
    private int angleB;
    private int height;

    public IsoscelesTrapezoid(String color, int sideA, int sideB, int angleA, int angleB, int height) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.angleA = angleA;
        this.angleB = angleB;
        this.height = height;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getAngleA() {
        return angleA;
    }

    public void setAngleA(int angleA) {
        this.angleA = angleA;
    }

    public int getAngleB() {
        return angleB;
    }

    public void setAngleB(int angleB) {
        this.angleB = angleB;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (sideA + sideB) * height / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area:" + getArea()
                + " sq. units, sideA: " + getSideA()
                + " units, sideB: " + getSideB()
                + " units, angleA: " + getAngleA()
                + " units, angleB: " + getAngleB()
                + " units, height: " + getHeight()
                + " units, color: " + getColor());
    }
}
