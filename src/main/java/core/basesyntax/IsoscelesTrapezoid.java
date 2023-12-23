package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double bottomBase;
    private double upperBase;
    private double lateralSide;

    @Override
    public double calculateArea() {
        return ((upperBase + bottomBase) / 2)
                *
                Math.sqrt((lateralSide * lateralSide) - (Math.pow(bottomBase - upperBase, 2) / 4));
    }

    @Override
    public void generateRandomParameters() {
        bottomBase = random.nextDouble() * 20;
        upperBase = random.nextDouble() * 20;
        lateralSide = random.nextDouble() * 20;
        name = "IsoscelesTrapezoid";
        color = colorSupplier.getRandomColor();
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getName()
                + ", " + "area: " + calculateArea()
                + ", " + "bottomBase: " + getBottomBase()
                + ", " + "upperBase: " + getUpperBase()
                + ", " + "lateralSide: " + getLateralSide()
                + ", " + "color: " + getColor());
    }

    public double getBottomBase() {
        return bottomBase;
    }

    public double getUpperBase() {
        return upperBase;
    }

    public double getLateralSide() {
        return lateralSide;
    }
}
