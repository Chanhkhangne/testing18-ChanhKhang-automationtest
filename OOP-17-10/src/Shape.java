abstract public class Shape {
    //    vì các hình k có cùng thuộc tính
//    => k taạo thuộc tính chung,tạo function tính chu vi,diện tích
    abstract double area();

    abstract double perimeter();
//  toString()- hàm đặc biệt của java
//    System.out.println(shape)
//    do String là hàm có sẵn của java nên muốn define lại logic
//    => thêm Override
//    Lưu ý: KHÔNG DEFINE HÀM KHỞI TẠO
//    => java sẽ tự tạo hàm khoi tạo
    @Override
    public String toString(){
//        hàm perimeter và hàm area sẽ lấy của class con
        return "P:" + perimeter() + "A: " + area();
    }
}