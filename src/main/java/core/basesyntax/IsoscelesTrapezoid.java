package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Area {

    private double a; //Length of the upper base
    private  double b; // Length of the lower base
    private double h; // height

    @Override
    public double obtainTheArea() {
        return (a + b) * h / 2;
    }

    public void setH(double h) {
        this.h = h;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setA(double a) {
        this.a = a;
    }
}


