package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upperSide;
    private double lowerSide;
    private double height;
    private double diagonal1;
    private double diagonal2;

    public double getUpperSide() {
        return upperSide;
    }

    public void setUpperSide(double upperSide) {
        this.upperSide = upperSide;
    }

    public double getLowerSide() {
        return lowerSide;
    }

    public void setLowerSide(double lowerSide) {
        this.lowerSide = lowerSide;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }

    public void setIsoscelesTrapezoid(double diagonal1, double diagonal2,
                                      double upperSide, double lowerSide, double height) {
        if (diagonal1 == diagonal2 && upperSide != 0 && lowerSide != 0 && height != 0) {
            this.upperSide = upperSide;
            this.lowerSide = lowerSide;
            this.height = height;
        }
    }

    @Override
    public void calculateArea() {
        setArea((upperSide + lowerSide) / 2 * height);
    }

    @Override
    public void draw() {
        System.out.println("Hello, my name is IsoscelesTrapezoid, my area: " + getArea()
                + " my side: " + upperSide + " " + lowerSide + ", my height: "
                + height + ", my diagonals: " + diagonal1 + " my color: " + getColor());
    }
}
