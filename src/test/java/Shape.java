public abstract class Shape {
    Coordinates Coordinates;
    int corner;
    double area;
    double perimeter;


    public Shape(Coordinates coordinates, int corner) {
        this.Coordinates = coordinates;
        this.corner = corner;

    }

    public Shape() {

    }

    public Shape(Corner corner) {

    }

    public abstract void calculatorarea();

    public abstract void callcutorperimeter();

    public abstract void figureInformation(Object information);
}

