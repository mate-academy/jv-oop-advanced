package core.basesyntax;

public class Square extends Figure {
    private double firstLine;

    public void setFirstLine(double firstLine) {
        this.firstLine = firstLine;
    }

    public void setName() {
        super.setName("Square");
    }

    public void setArea() {
        super.setArea((int) (this.firstLine * this.firstLine));
    }

    @Override
    public String uniqueFunction() {
        return Integer.toString((int) (firstLine * 4));
    }

    @Override
    public double getArea() {
        return 0;
    }
}
