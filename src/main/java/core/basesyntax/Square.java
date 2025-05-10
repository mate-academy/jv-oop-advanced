package core.basesyntax;

public class Square extends Figure {
    private double sideSize;

    public Square(double sideSize) {
        this.sideSize = sideSize;
    }

    @Override
    public double calculateArea() {
        return sideSize * sideSize;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Square{");
        sb.append("sideSize=").append(sideSize);
        sb.append(", color=").append(getColor());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void draw() {
        System.out.println(this);
    }
}
