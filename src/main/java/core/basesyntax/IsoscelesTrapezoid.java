package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int injection;
    private int sideU;
    private int sideD;
    private int sideF;

    public IsoscelesTrapezoid(int injection, int sideU, int sideD, int sideF) {
        this.injection = injection;
        this.sideU = sideU;
        this.sideD = sideD;
        this.sideF = sideF;
    }

    @Override
    public double gerArea() {
        return sideF * Math.sin(injection) * (sideD - (sideF * Math.cos(injection)));
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "IsoscelesTrapezoid" + "\n" + "injection " + "= " + injection + " degrees" +
                "\n" + "sideU " + "= " + sideU + " units" + "\n" + "sideD " + "= " + sideD + " units" + "\n" + "sideF "
                + "= " + sideF + " units" + "\n" + "Area " + "= " + gerArea() + " sq.units" + "\n" + "colors " + "= "
                + getColor());
    }
}
