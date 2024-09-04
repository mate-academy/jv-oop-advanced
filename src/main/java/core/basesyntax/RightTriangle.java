package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double thirdLeg;
    private String color;

    public RightTriangle(double firstLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = firstLeg;
        this.thirdLeg = firstLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * firstLeg * Math.pow(3, 2)) / 4;
    }

    @Override
    public void draw() {
        System.out.println("Figure" + ": " + getClass().getSimpleName() + ", area: " + getArea()
                + " sq. units, firstLeg: " + getFirstLeg() + " units, secondLeg: " + getSecondLeg()
                + " units, thirdLeg: " + getThirdLeg() + "units, color: " + getColor());
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public double getThirdLeg() {
        return thirdLeg;
    }

    public String getColor() {
        return color;
    }
}
