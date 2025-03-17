package core.basesyntax.figures;

import core.basesyntax.ColorSupplier;
import java.util.Random;

public class Rectangle extends Figure {

    private double firstWall;
    private double secondWall;

    public Rectangle(String color, double firstWall, double secondWall) {
        super(color);
        this.firstWall = firstWall;
        this.secondWall = secondWall;
    }

    public Rectangle() {
        super(new ColorSupplier().getRandomColor());
        this.firstWall = new Random().nextInt(9) + 1;
        this.secondWall = new Random().nextInt(9) + 1;
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

    @Override
    public double getArea() {
        return firstWall * secondWall;
    }

    @Override
    public void draw() {
        String sb = "Figure: Rectangle, Color: " + getColor() + ", First Wall: " + getFirstWall() + ", Second Wall: " + getSecondWall() + ", Area: " + getArea();

        System.out.println(sb);
    }
}
