package core.basesyntax;

public class IsoscelesTrapezoid implements Behavior{
    private double sideA;
    private double sideB;
    private double vysota;
    private String state;

    public IsoscelesTrapezoid(String state, double sideA, double sideB, double vysota){
        this.sideA = sideA;
        this.sideB = sideB;
        this.vysota = vysota;
        this.state = state;
    }

    @Override
    public void creatFigure() {
        double a = ((sideA + sideB) / 2) * vysota;
        System.out.println("Figure: isosceles trapezoid, area: " + a + " sq. units, sideA: " + sideA + " units, sideB: " + sideB + " units, vysota: " + vysota + " units, color: " + state);
    }
}
