package core.basesyntax;

public class Rectangle extends Figure implements Area{

    private double width;
    public double length;

    @Override
    public double obtainTheArea() {
        return width * length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
