public class FigureSupplier {
    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        int typeFigure = (int) (Math.random() * (5 + 1) + 1);
        switch (typeFigure) {
            case 1:
                return new Circle("circle", color, Math.random());
            case 2:
                return new Square("square", color, Math.random());
            case 3:
                return new Rectangle("rectangle", color, Math.random(), Math.random());
            case 4:
                return new Triangle("right triangle", color, Math.random(), Math.random());
            default:
                return new Trapezoid("isosceles trapezoid", color, Math.random(), Math.random(),
                        Math.random());
        }
    }
}
