import java.util.Scanner;

//public: The hiện phạm vi truy cập của đối tượng
// private: Những nơi khác sẽ không thể truy cập được
// protected
public class Student {
// liệt ke các thuộc tính của dôi tuong
    String id;
    String name;
    int age;
    String address;
    String phone;
    String email;
    String gender;
//Hàm khởi tạo đối tượng
// Lưu ý nếu k tạo ham khởi tạo
// => java tự động tạo hàm khởi tạo mặc định
// => dùng từ khoa new để tạo đối tượng

public Student(){
id="123456";
age = 20;
address ="HCM";
email = "k@gmail.com";
name = "Khang";
gender = "Nam";
}
public Student(String id,
               String name1,
               String address,
               String phone,
               String email,
               String gender, int age){
// phân biệt tên cua thuộc tính và tên của tham số
// => this để phân biệt
// nếu khác tên=> ko can dùng this
    this.id=id;
    name=name1;
    this.age=age;
    this.email=email;
    this.address=address;
    this.phone=phone;
    this.gender=gender;

}



    // Liệt kê các phương thức (function)
    // hàm nhập giá trị của đối tượng
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập mã học sinh:");
        id = sc.nextLine();
        System.out.println("Mời bạn nhập tên học sinh:");
        name = sc.nextLine();
        System.out.println("Mời bạn nhập tuổi học sinh:");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhập đia chỉ học sinh:");
        address = sc.nextLine();
        System.out.println("Mời bạn nhập số điện thoại học sinh:");
        phone = sc.nextLine();
        System.out.println("Mời bạn nhập email học sinh:");
        email = sc.nextLine();
        System.out.println("Mời bạn nhập giới tính học sinh:");
        gender = sc.nextLine();
    }
    public void display(){
        System.out.println("Mã học sinh: "+ id);
        System.out.println("Tên học sinh: "+ name);
        System.out.println("Email học sinh: "+ email);
        System.out.println("Địa chỉ học sinh: "+ address);
        System.out.println("Giới tính học sinh: "+ gender);
        System.out.println("Số điện thoại học sinh: "+ phone);

    }
}
