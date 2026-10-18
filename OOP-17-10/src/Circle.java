public class Circle extends Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws IllegalAccessException {
        if(radius<0) throw new IllegalAccessException("Radius must be positive");
        this.radius=radius;
    }

    Circle(double radius) throws IllegalAccessException {
        setRadius(radius);
//        this.radius=radius;
    }
        @Override
        public double area(){
            return  Math.PI * radius*radius;
        }
        @Override
        public double perimeter(){
            return 2 * Math.PI * radius;
        }
    }

