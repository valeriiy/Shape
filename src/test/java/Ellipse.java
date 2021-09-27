public abstract class Ellipse extends Shape {
    private double a;
    private double b;


    public Ellipse(Coordinates coordinates, double a, double b) {
        super(coordinates, 0);
        this.a = a;
        this.b = b;
    }


    @Override
    public void calculatorarea() {
        area = Math.PI * a * b;
    }

    @Override
    public void callcutorperimeter() { perimeter= 2*(a+b); }

    @Override
    public void figureInformation(Object information) {

    }

}

