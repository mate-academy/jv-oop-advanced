package figure;

public class FigureMain extends FigureSupplier {
    public static void main(String[] args) {
        Figure figureOne = new Figure("orange");
        figureOne.draw();
        Figure figureTwo = new Circle(getRandomColor(), 10.0);
        figureTwo.draw();
        System.out.println(figureTwo.getArea());
        Figure figureThree = new Rectangle(getRandomColor(), 1.02, 20.2);
        figureThree.draw();
        Figure figureFour = new IsoscelesTrapezoid(getRandomColor(),
                getRandomFigureValue(),5.84, 11.66);
        figureFour.draw();
        Figure figureFive = new RightTriangle(getRandomColor(),
                getRandomFigureValue(),getRandomFigureValue());
        figureFive.draw();
    }
}
