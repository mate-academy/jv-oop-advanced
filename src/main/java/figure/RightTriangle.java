package figure;

public class RightTriangle extends Figure {
    private Double firstLeg;
    private Double secondLeg;

    public RightTriangle(String color, Double firstLeg, Double secondLeg) {
        this.setType(FigureSupplier.getTypeName(2));
        this.setColor(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public Double getFirstLeg(Double firstLeg) {
        return firstLeg;
    }

    public void setFirstLeg(Double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public Double getSecondLeg(Double secondLeg) {
        return secondLeg;
    }

    public void setSecondLeg(Double secondLeg) {
        this.firstLeg = secondLeg;
    }

    @Override
    public Double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder().append("Figure : ").append(getType())
                .append(" color : ").append(getColor())
                .append(" area : ").append(getArea()).append(" sq.units")
                .append(" first leg : ").append(this.firstLeg).append(" units")
                .append(" second leg : ").append(this.secondLeg).append(" units").toString());
    }

}
