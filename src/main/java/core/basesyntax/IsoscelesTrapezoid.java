package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double side;

    public double getFirstBase() {
        return firstBase;
    }

    public void setFirstBase(double firstBase) {
        this.firstBase = firstBase;
    }

    public double getSecondBase() {
        return secondBase;
    }

    public void setSecondBase(double secondBase) {
        if (secondBase >= firstBase) {
            this.secondBase = secondBase;
        } else {
            System.out.println("firstBase should be less or equal secondBase");
        }
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double areaOfFigure() {
        return ((firstBase + secondBase) / 4) * Math.sqrt(4 * (side * side)
                - Math.pow(((firstBase - secondBase)), 2));
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: isoscelesTrapezoid"
                + ", firstBase = "
                + firstBase
                + " units"
                + ", secondBase = "
                + secondBase
                + " units"
                + ", side = "
                + side
                + " units"
                + ", area = "
                + areaOfFigure()
                + " units"
                + ", color = "
                + getColor()
        );
    }

    @Override
    public Figure getRandomFigure() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setColor(ColorSupplier.getRandomColor());
        isoscelesTrapezoid.setFirstBase(random.nextDouble(30));
        isoscelesTrapezoid.setSecondBase(isoscelesTrapezoid.getFirstBase() + random.nextDouble(30));
        isoscelesTrapezoid.setSide(random.nextDouble(20));
        return isoscelesTrapezoid;
    }
}
