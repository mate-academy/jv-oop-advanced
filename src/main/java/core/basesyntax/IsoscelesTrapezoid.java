package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private String color;
    private double firstLeg;
    private double secondLeg;
    private double thirdLeg;
    private double height;
    private double smallPiece;

    public IsoscelesTrapezoid(double firstLeg, double secondLeg, double thirdLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.thirdLeg = thirdLeg;
        this.color = color;
    }

    @Override
    public double getArea() {
        if (firstLeg > secondLeg) {
            smallPiece = (firstLeg - secondLeg) / 2;
        } else {
            smallPiece = (secondLeg - firstLeg) / 2;
        }
        height = Math.sqrt((Math.pow(thirdLeg, 2) - Math.pow(smallPiece, 2)));
        return ((firstLeg + secondLeg) / 2) * height;
    }

    @Override
    public void printAllInformation() {
        System.out.println("Figure" + ": " + getClass().getSimpleName() + ", area: " + getArea()
                + " sq. units, firstLeg: " + getFirstLeg() + " units, secondLeg: " + getSecondLeg()
                + " units, thirdLeg: " + getThirdLeg() + "units, color: " + getColor());
    }

    public String getColor() {
        return color;
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
}
