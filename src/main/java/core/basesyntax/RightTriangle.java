package core.basesyntax;

public class RightTriangle extends Figure implements Area {

    private double katetA;
    public double katetB;


    @Override
    public double obtainTheArea() {
        return (katetA * katetB) / 2;
    }

    public void setKatetA(double katetA) {
        this.katetA = katetA;
    }

    public void setKatetB(double katetB) {
        this.katetB = katetB;
    }
}
