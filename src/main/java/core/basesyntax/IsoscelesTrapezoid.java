package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Area {

    private double upperA; //Length of the upper base
    private double lowerB; // Length of the lower base
    private double height; // height

    @Override
    public double obtainTheArea() {
        return (lowerB + upperA) * height / 2;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLowerB(double lowerB) {
        this.lowerB = lowerB;
    }

    public void setUpperA(double upperA) {
        this.upperA = upperA;
    }
}


