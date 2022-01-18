public class IsoscelesTrapezoid extends Figure {
    private double botWidth;
    private double topWidth;
    private double height;

    public IsoscelesTrapezoid(double botWidth, double topWidth, double height, String color) {
        super(color);
        this.botWidth = botWidth;
        this.topWidth = topWidth;
        this.height = height;
    }

    public double getBotWidth() {
        return botWidth;
    }

    public void setBotWidth(double botWidth) {
        this.botWidth = botWidth;
    }

    public double getTopWidth() {
        return topWidth;
    }

    public void setTopWidth(double topWidth) {
        this.topWidth = topWidth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (botWidth + topWidth) * height / 2;
    }

    @Override
    public String printInfo() {
        return "Figure: isosceles trapezoid, area: " + calculateArea()
                + " sq.units, bottom width: " + botWidth
                + " units, top width: " + topWidth
                + " units, height: " + height
                + " units, color: " + super.getColor();
    }
}
