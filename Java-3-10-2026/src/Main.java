import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // ôn lại mô hình 3 khối
    //Bài 1:tính chu vi và diện tích hình chữ nhật
    // input:số lượng tham số:chieudai, chieurong
    public static void chuVidienTich(float dai, float rong){
    //Fail first
    //CD,CR >0
       if (dai < 0 || rong <0){
           System.out.println("Chiều dài,chiều rộng không được âm");
           return;
       }
       float chuVi= (dai+rong)*2;
       float dienTich=dai*rong;

        // output:in ra chu vi diện tích
       System.out.println("Chu vi: "+chuVi);
       System.out.println("Diện tích: "+dienTich);
    }
    public static void soLonNhat(int num1,int num2, int num3){
        int nummax=num1;
        if(num2 > nummax) {
            nummax = num2;
        }
        if(num3 > nummax) {
            nummax = num3;
        }
        System.out.println("Số lớn nhất là : " +nummax);
    }
    public static void kiemtraHocluc(float diemTB){
        if(diemTB < 0 || diemTB >10){
            System.out.println("Điểm trung bình không hợp lệ !");
            return;
        }

        if (9 <= diemTB && diemTB <=10){
            System.out.println("Xếp loại Xuất sắc");
        }
       else if(8 <= diemTB && diemTB <=9){
            System.out.println("Xếp loại Giỏi");

        } else if (6.5 <= diemTB && diemTB <=8 ){
            System.out.println("Xếp loại Khá");
        } else if (5 < diemTB && diemTB <=6.5 ) {
            System.out.println("Xếp loại Trung bình");
        } else {
           System.out.println("Xếp loại Yếu");
        }

        // process
        //output loại học luc
    }
public static void tinhTienDien(float soKWh){
        if (soKWh <0 ){
            System.out.println("Số Kwh không hợp le");
            return;
        }
    int tienDien=0;
    double roundsoKWh= Math.ceil(soKWh);
    if(soKWh <=50){
        tienDien = (int) (1800 * roundsoKWh);
    } else if (51 <=roundsoKWh && roundsoKWh <=100) {
        tienDien = (int) (1800* 50 +(2000*(roundsoKWh-50)));
    }  if (101 <=roundsoKWh && roundsoKWh <=200) {
        tienDien = (1800* 50) +(2000*50)+(int)(2500*(roundsoKWh-100));
    } else {
        tienDien = (1800*50) +(2000*50) + (2000*100) + (int)(3000*(roundsoKWh-200));
    }

}
    //LOOP
    //Bài 1 in các số từ 1->100
    public static void inSoTu1den100() {
        for (int i = 1; i <=100 ; i++) {
            System.out.println(i);
        }
    }
    public static void inSoChanTu0den100(){
        for (int i = 0; i <=100 ; i+=2) {
            System.out.println(i);
        }
    }
    public static void sum1to300(){
        int sum = 0 ;
        for (int i = 1; i <=300 ; i++) {
            sum+=i;
        }
        System.out.println("Tổng từ 1->300 là: "+sum);
    }
    public static void inCuuchuong5(){
        for (int i = 1;i <=10 ; i++) {
            System.out.println("5 x"+ i + "=" +(5*i));
        }
    }
// Tính giai thừa của n
// Vd:3!=6,4!=24,5!=120
    public static void tinhGiaithua(int n){
//dk bắt đầu i=1
// đk dừng i<=n
// bc nhảy i++
        if(n<=1){
            System.out.println("n không hợp lệ");
            return;
        }
        int result=1;
        for (int i = 1; i <=n ; i++) {
            result *=i;
        }
        System.out.println("Giai thừa của n là:"+result);
    }

// In ra n so fibonaci
// n=5
// dk bắt đầu vòng lap:i=1
// dk dung:i<=n
// bc nhay : i++
    public static void fibonacy(int n){
        int prev1=0;
        int prev2=0;
        for (int i = 1; i <=n ; i++) {
            System.out.println(prev1+" ");
            int next=prev1+prev2;
            prev1 = prev2;
            prev2 = next;

        }

    }
    public static void main(String[] args) {
        //Bài 1: tính chu vi diện tích
        Scanner sc = new Scanner(System.in);
        System.out.println("Bài 1 tính chu vi, diện tích hinh chữ nhật ");
        System.out.println("Nhập chiều dài: ");
        float dai = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập chiều rong: ");
        float rong = Float.parseFloat(sc.nextLine());
// Gọi hàm chu vi, diện tích
        chuVidienTich(dai,rong);
// Bai 2: Tim số lớn nhat trong 3 số
// Input:3 tham số nguyên
// output: số lớn nhất
        // -define hàm
        // -int num1, int num2, int num3
        // -int nummax
// process:thuật toán , flag
        //-chọn 1 số  bất ký  làm số lớn nhất.Thường chọn so đầu tiên là số "Lớn nhất"
        // duyệt tu số thứ 2 trở đi
        // +neu số đang xét > số "lớn nhất" -> gán so "lon nhat" = so dang xet
        // + ngược lại => next
         int num1=10;
         int num2=20;
         int num3=5;
         soLonNhat(num1,num2,num3);

// Bai 3: kiểm tra học lực của học sinh dua vao diem TB
        System.out.println("Nhâp điểm Trung bình: ");
        float diemTB = Float.parseFloat(sc.nextLine());
        kiemtraHocluc(diemTB);
// Bài 4 : Tính tiền đien
        System.out.println("Nhập số Kwh: ");
        float soKwh = Float.parseFloat(sc.nextLine());
        tinhTienDien(soKwh);
    }
}