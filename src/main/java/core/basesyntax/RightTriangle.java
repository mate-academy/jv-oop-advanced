package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculator {
    private double firstLeg;
    private double secondLeg;
    private double hypotenuse;

    public RightTriangle() {
        super();
        setName(FigureType.RIGHTTRIANGLE);
        this.firstLeg = 1;
        this.secondLeg = 1;
        this.hypotenuse = Math.sqrt(Math.pow(firstLeg, 2) + Math.pow(secondLeg, 2));
    }

    public RightTriangle(FigureType name, String color, double firstLeg, double secondLeg) {
        super(name, color);
        setFirstLeg(firstLeg);
        setSecondLeg(secondLeg);
        this.hypotenuse = Math.sqrt(Math.pow(firstLeg, 2) + Math.pow(secondLeg, 2));
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = (firstLeg >= 0) ? firstLeg : 0;
        this.hypotenuse = Math.sqrt(Math.pow(firstLeg, 2) + Math.pow(secondLeg, 2));
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = (secondLeg >= 0) ? secondLeg : 0;
        this.hypotenuse = Math.sqrt(Math.pow(firstLeg, 2) + Math.pow(secondLeg, 2));
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public String toDraw() {
        StringBuilder builder = new StringBuilder();
        return builder.append(super.toDraw()).append(", first leg: ").append(firstLeg)
                .append(", second leg: ").append(secondLeg).append(", hypotenuse: ")
                .append(hypotenuse).append(", area: ").append(getArea()).toString();
    }
}
