package core.basesyntax;

import java.text.DecimalFormat;

public class IsoscelesTrapezoid extends Figure {
    private int firstParallel;
    private int secondParallel;
    private int height;

    public IsoscelesTrapezoid(String color, int firstParallel, int secondParallel, int height) {
        super(color);
        this.firstParallel = firstParallel;
        this.secondParallel = secondParallel;
        this.height = height;
    }

    public int getFirstParallel() {
        return firstParallel;
    }

    public void setFirstParallel(int firstParallel) {
        this.firstParallel = firstParallel;
    }

    public int getSecondParallel() {
        return secondParallel;
    }

    public void setSecondParallel(int secondParallel) {
        this.secondParallel = secondParallel;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((double)(firstParallel + secondParallel) / 2) * height;
    }

    @Override
    public void draw() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedArea = decimalFormat.format(getArea());
        System.out.println("Figure: " + this.getClass().getSimpleName() + ", Area: "
                + formattedArea + " sq.units, First Parallel: "
                + firstParallel + " Units, Second Parallel: "
                + secondParallel + " Units, height: " + height
                + " Units, Color: " + super.getColor());
    }
}
