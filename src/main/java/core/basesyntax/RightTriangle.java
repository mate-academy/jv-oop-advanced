package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLine;
    private double secondLine;

    public void setFirstLine(double firstLine) {
        this.firstLine = firstLine;
    }

    public void setSecondLine(double secondLine) {
        this.secondLine = secondLine;
    }

    public void setName() {
        super.setName("Right Triangle");
    }

    public void setArea() {
        super.setArea((int) ((this.firstLine * this.secondLine) / 2));
    }

    @Override
    public String uniqueFunction() {
        return Integer.toString((int) Math.sqrt(Math.pow(firstLine, 2) + Math.pow(secondLine, 2)));
    }

    @Override
    public double getArea() {
        return 0;
    }
}
