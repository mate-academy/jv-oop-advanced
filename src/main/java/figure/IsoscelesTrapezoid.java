package figure;

public class IsoscelesTrapezoid extends Figure {
    private Double firstBase;
    private Double secondBase;
    private Double height;

    public IsoscelesTrapezoid(String color, Double firstBase, Double secondBase, Double height) {
        this.setType(FigureSupplier.getTypeName(3));
        this.setColor(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    public Double getFirstBase(Double firstBase) {
        return firstBase;
    }

    public void setFirstBase(Double firstBase) {
        this.firstBase = firstBase;
    }

    public Double getSecondBase(Double secondBase) {
        return secondBase;
    }

    public void setSecondBase(Double secondBase) {
        this.secondBase = secondBase;
    }

    public Double getHeight(Double height) {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public Double getArea() {
        return 0.5 * (firstBase + secondBase) * height;
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder().append("Figure : ").append(getType())
                .append(" color : ").append(getColor())
                .append(" area : ").append(getArea()).append(" sq.units")
                .append(" first base : ").append(this.firstBase).append(" units")
                .append(" second base : ").append(this.secondBase).append(" units")
                .append(" height : ").append(this.height).append(" units"));
    }
}
