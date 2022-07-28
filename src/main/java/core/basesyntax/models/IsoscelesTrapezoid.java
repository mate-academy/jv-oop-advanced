package core.basesyntax.models;

public class IsoscelesTrapezoid extends Figure {
    private int sideBottom;
    private int sideTop;
    private int height;

    public IsoscelesTrapezoid(int sideBottom, int sideTop, int height, String color) {
        super(color);
        this.sideBottom = sideBottom;
        this.sideTop = sideTop;
        this.height = height;
    }

    public int getSideBottom() {
        return sideBottom;
    }

    public void setSideBottom(int sideBottom) {
        this.sideBottom = sideBottom;
    }

    public int getSideTop() {
        return sideTop;
    }

    public void setSideTop(int sideTop) {
        this.sideTop = sideTop;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) (getSideBottom() + getSideTop()) * getHeight() / 2;
    }

    @Override
    public String printInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Figure: isosceles trapezoid, side bottom - ")
                .append(getSideBottom())
                .append(" units, side top - ")
                .append(getSideTop())
                .append(" units, height - ")
                .append(getHeight())
                .append(" units, color - ")
                .append(getColor())
                .append(", area - ")
                .append(getArea())
                .append(" sq.units");
        return info.toString();
    }
}
