package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double hypotenuse;

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse() {
        this.hypotenuse = Math.sqrt((firstLeg * firstLeg) + (secondLeg * secondLeg));
    }

    @Override
    public double areaOfFigure() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: rightTriangle"
                + ", firstLeg = "
                + firstLeg
                + " units"
                + ", secondLeg = "
                + secondLeg
                + " units"
                + ", hypotenuse = "
                + hypotenuse
                + " units"
                + ", area = "
                + areaOfFigure()
                + " units"
                + ", color = "
                + ColorSupplier.getRandomColor()
        );
    }

    @Override
    public Figure getRandomFigure() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setColor(ColorSupplier.getRandomColor());
        rightTriangle.setFirstLeg(random.nextDouble(30));
        rightTriangle.setSecondLeg(random.nextDouble(30));
        rightTriangle.setHypotenuse();
        return rightTriangle;
    }
}
