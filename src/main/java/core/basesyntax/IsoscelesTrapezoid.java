package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double lowSide;
    private double topSide;
    private double lateralSide;

    public IsoscelesTrapezoid(Color color) {
        super(color);
    }

    @Override
    public void print() {

    }

    @Override
    public double getArea() {
        double height = Math.sqrt(Math.pow(lateralSide,2) - Math.pow(lowSide-lateralSide,2)/4);
        return ((lowSide + topSide)/2)/height;
    }
}
