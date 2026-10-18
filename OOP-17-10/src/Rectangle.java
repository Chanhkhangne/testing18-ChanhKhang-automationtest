public class Rectangle extends Shape {
    private double width;
    private double height;
//    Cách 1 : Tạo getter,setter
//    Cách 2 : Thêm logic kiểm tra width,height trong hàm khởi tạo
    public Rectangle(double width,double height){
        if(width <0 && height <0){
            throw new IllegalAccessException("Width and Height must be positive")
            this.width=width;
            this.height=height;
        };

        @Override
        public double area(){
            return width * height;
        }
        @Override
        public double perimeter(){
            return 2*(width+height);
        }
    }
}
