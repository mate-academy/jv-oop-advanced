package figure;

public class Rectangle extends Figure {
    private Double firstSide;
    private Double secondSide;

    public Rectangle(String color, Double firstSide, Double secondSide) {
        this.setType(FigureSupplier.getTypeName(1));
        this.setColor(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public Rectangle(){

    }

    public Double getFirstSide(Double firstSide) {
        return firstSide;
    }

    public void setFirstSide(Double firstSide) {
        this.firstSide = firstSide;
    }

    public Double getSecondSide(Double secondSide) {
        return secondSide;
    }

    public void setSecondSide(Double secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public Double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder().append("Figure : ").append(getType())
                .append(" color : ").append(getColor())
                .append(" area : ").append(getArea()).append(" sq.units")
                .append(" first side : ").append(this.firstSide).append(" units")
                .append(" second side : ").append(this.secondSide).append(" units").toString());
    }
}
