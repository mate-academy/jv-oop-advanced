package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int biggerWidth;
    private int lessWidth;

    public IsoscelesTrapezoid(String color, int height, int biggerWidth, int lessWidth) {
        super(color);
        this.height = height;
        this.biggerWidth = biggerWidth;
        this.lessWidth = lessWidth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBiggerWidth() {
        return biggerWidth;
    }

    public void setBiggerWidth(int biggerWidth) {
        this.biggerWidth = biggerWidth;
    }

    public int getLessWidth() {
        return lessWidth;
    }

    public void setLessWidth(int lessWidth) {
        this.lessWidth = lessWidth;
    }

    @Override
    public double area() {
        return (getBiggerWidth() + getLessWidth()) / 2 * getHeight();
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder().append("Figure: isoscelesTrapezoid, area: ")
                .append(area()).append(" sq.units, height: ").append(getHeight())
                .append(" units, biggerWidth: ").append(getBiggerWidth())
                .append(" units, lessWidth: ").append(getLessWidth())
                .append(" units, color: ").append(getColor().toLowerCase()));
    }
}
