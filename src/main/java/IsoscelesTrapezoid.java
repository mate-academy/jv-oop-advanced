public class IsoscelesTrapezoid extends Figure  {
    private int sideA;
    private int sideB;
    private int height;

    public IsoscelesTrapezoid(String color,String figureType, int sideA, int sideB, int height) {
     super(color,figureType);
     this.sideA = sideA;
     this.sideB = sideB;
     this.height = height;
    }

    public int getSideA() {
        return sideA;
    }
    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getHeight() {
        return height;
    }

    public  void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (sideA + sideB) * height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getFigureType() + "," + " area: " + getArea() + " sq.units," +
                " sideA(base1): " + sideA + " units," +
                " sideB(base2): " + sideB + " units," +
                " height: " + height + " units," +
                " color: " + getColor());
    }

}
