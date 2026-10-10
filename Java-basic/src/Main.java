import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

// Học câu lệnh nhập và xuất dữ liệu
// XUất
        System.out.println("Helle World");
//Biến (Variable)
//<kiểu dữ liệu> <tên biến>;
//<kiểu dữ liệu> <tên biến> = <giá trị mặc định>;
// quy tắc đặt tên biến :camel case
//VD:soNguyen;hocSinh....
        int num1 = 10;
        System.out.println(num1);
        float num2 = 10.5f;
        System.out.println(num2);
        boolean isTrue = true;
        System.out.println(isTrue);
        char ch = 'a';
        String str = "Hello World";
        System.out.println(str);

//2 Các toán tử
        // 2.1 Phép toán +,-,*,/ (chia lấy nguyên), % (chia lấy dư)
        // Phép +
        //VD cộng số nguyên, cộng số thực,nối chuỗi
        int num3 = 10;
        int num4 = 20;
        int result = num3 + num4;
        System.out.println("Tổng của 2 số nguyên là " + result);
        // ++ => tăng giá trị biến đó lên 1 đơn vị
        // num1=num1++
        // gán giá trị number 1 vào number 3,sau đó tăng giá trị của number 1 lên 1 đơn vị
        int num6 = num1++;
        System.out.println("Number 3 là " + num3);
        System.out.println("Number 1 là " + num1);
        //Tăng giá trị number 2 lên 1 đơn vị
        // Sau đó gán giá trị num2 vào num 4
        // num2 = num4 =21
        int num7 = ++num4;
        System.out.println("Number 7 là " + num4);
        // Phép trừ tương tự như phép +
        // num--
        //--num
//        number1+=10;//number1=number1+10
//        number1-=10;//number1=number1-10


        // Hằng số (Constant)-> biến lưu giá trị không đổi
        final int TIMEOUT = 1000;
//    TIMEOUT=10 => Sai
//    => địa chỉ trang web, timeout, lưu localor


        // 2.2 so sánh :>,>=,<,<=, ==, != ,!( phủ định)
//    kết quả tra về -> boolean
        boolean isGreater = 10 > 5;
        boolean isEqual = 10 == 10;
//    => đi kèm với condition statement,loop statement
// 2.3 nối nhiều điều kiện: && ||
//  kết quả trả về -> boolean
        boolean isCheck = (10 > 5) && (10 < 20);
        boolean isChecks = (10 > 5) || (10 < 20);
//true khi 2 hoặc nhiều điều kiện cùng true
//true && true = true
//true && false = false
//false && true = false
//false && false =false
        boolean isCheck2 = (10 > 5) || (10 < 20);
//false khi 2 hoặc nhiều điều kiện cùng false
//false && true = true
//true && false = true
//true && true = true
//false && false =false

//3 Nhập dữ liệu từ bàn phím

//    nhập số nguyên
// next...=> hàm bất đồng bộ
// Bắt user nhập giá trị từ bàn phím và gỡ Enter rồi mới xử lý
// gọi API -> bất đồng bộ
//    System.out.println("Nhập số nguyên");
//    int number = sc.nextInt();
//    System.out.println("Số nguyên đã nhập là "+ number);
//
//    System.out.println("Nhập số Thực");
//    float number1 = sc.nextFloat();
//    System.out.println("Số nguyên đã nhập là "+ number1);
//
//    sc.nextLine();
//    System.out.println("Nhập chuỗi");
//    String str1 = sc.nextLine();
//    System.out.println("Chuỗi đã nhập là "+ str1);
        Scanner sc = new Scanner(System.in);

// Vừa nhập số nguyên vừa nhập chữ
// Nhập chữ -> Convert số kiểu dữ liệu tương ứng
        System.out.println("Mời bạn nhập số nguyên: ");
        int number5 = Integer.parseInt(sc.nextLine());
        System.out.println("Số bạn nhập là " + number5);
        System.out.println("Nhập số thực: ");
        float number6 = Float.parseFloat(sc.nextLine());
        System.out.println("Số thực bạn nhập là " + number6);
// khai báo mảng
// mảng số nguyên
//< kiểu dữ lieu>[] <tên biến> = new <tên biến> [<so lượng phần tu>];
//< kiểu dữ lieu>[] <tên biến> = {el1,el2,el3...};
// int[] arr =new int [5];
// int[] arr ={1,2,3,4,5,6};
        String[] danhSachten = {"Nguyen", "Hieu", "Tran"};
        System.out.println(danhSachten[0]);
        System.out.println(danhSachten[1]);
        System.out.println(danhSachten[2]);
        int lengthDSTEN = danhSachten.length;
        System.out.println(danhSachten[lengthDSTEN - 1]);

// Condition Statement
// Condition thiếu
//   if (<biểu thức đìều kiện>){
//       logic code nằm trong này
//  }
// Condition đầy đủ
//   if (<biểu thức đìều kiện>){
//       logic code nằm trong này
//  }else{
//      logic code nằm trong này
//  }



//  Bài 1:Tìm số lớn nhất trong 3 số
//  Vd:4,8,2=>8

//        Tạo hàm để xử lý code liên quan tới kiểm tra điểm thi
//        Pham vi truy cập
        kiemTraDiemThi();
    }
    public static void kiemTraDiemThi(){
//  Bài 1: kiểm tra điểm thi đại học .Nếu dưới điểm chuẩn => fail
//   input
//   -diemso
//   -diemchuan
//   output=> pass/fail
//   process
//  TH1 nếu diemthi >=diem chuan => pass
//  TH2 neu diemthi < diem chuan => fail
//  TH3 kiem tra kieu du lieu,kiem tra range dữ lieu
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm thi đại học: ");
        int diemThi = Integer.parseInt(sc.nextLine());
        if (diemThi < 0 && diemThi > 10) {
            System.out.println("Điểm thi không hợp lệ !");
        }

        System.out.println("Nhập điểm chuẩn: ");
        int diemChuan = Integer.parseInt(sc.nextLine());
        if (diemChuan < 0 && diemChuan > 10) {
            System.out.println("Điểm chuẩn không hợp lệ !");
        }
        if (diemThi >= diemChuan) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
