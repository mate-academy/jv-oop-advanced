package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    double firstLine;
    double secondLine;
    double height;

    public double getHeight() {
        return height;
    }

    public void setFirstLine(double firstLine) {
        this.firstLine = firstLine;
    }

    public void setSecondLine(double secondLine) {
        this.secondLine = secondLine;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setName() {
        super.setName("Isosceles Trapezoid");
    }

    public void setArea() {
        super.setArea((int) (((this.firstLine + this.secondLine) / 2) * this.height));
    }

    @Override
    public String uniqueFunction() {
        return Integer.toString((int) getHeight());
    }

    @Override
    public void print() {
        System.out.println();
    }

    @Override
    public double getArea() {
        return 0;
    }
}
