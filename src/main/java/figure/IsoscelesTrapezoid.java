package figure;

public class IsoscelesTrapezoid extends Figure {
    private Double firstbase;
    private Double secondbase;
    private Double height;

    public IsoscelesTrapezoid(String color, Double firstbase, Double secondbase, Double height) {
        this.setType(FigureSupplier.getTypeName(3));
        this.setColor(color);
        this.firstbase = firstbase;
        this.secondbase = secondbase;
        this.height = height;
    }

    IsoscelesTrapezoid() {

    }

    public Double getFirstbase(Double firstbase) {
        return firstbase;
    }

    public void setFirstbase(Double firstbase) {
        this.firstbase = firstbase;
    }

    public Double getSecondbase(Double secondbase) {
        return secondbase;
    }

    public void setSecondbase(Double secondbase) {
        this.secondbase = secondbase;
    }

    public Double getHeight(Double height) {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public Double getArea() {
        return 0.5 * (firstbase + secondbase) * height;
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder().append("Figure : ").append(getType())
                .append(" color : ").append(getColor())
                .append(" area : ").append(getArea()).append(" sq.units")
                .append(" first base : ").append(this.firstbase).append(" units")
                .append(" second base : ").append(this.secondbase).append(" units")
                .append(" height : ").append(this.height).append(" units").toString());
    }
}
