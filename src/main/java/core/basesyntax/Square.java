package core.basesyntax;

public class Square extends Figure implements Area{

    private double side;

    @Override
    public double obtainTheArea() {
        return side * 2;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
