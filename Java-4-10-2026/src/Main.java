//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
//        for (int i = 2; i <= number - 1; i++) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
        int i = 2;
        while (i <= number - 1) {
            if (number % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
    // duyệt tới number-1 mà vẫn ko chia het => chắc chắn là số nguyn tố


    //input: int number
//output:tong các chữ so của 1 số -> int
// process
// tach so 4 tu 1234 =>1234%10 = 4
// xoa 4 ra khỏi 1234 => 1234/10 =123
// dk dừng: number >0
    public static int sumDigits(int number) {
        int sum = 0;
//TH1:Nêếu number <0 => abs để convert sang số dương
        int numberAbs = Math.abs(number);
        while (numberAbs > 0) {
            sum += numberAbs % 10;
            numberAbs /= 10;
        }
        return sum;
    }

    public static void printArray(int[] listNumbers) {
        for (int i = 0; i < listNumbers.length; i++) {
            if (listNumbers[i] % 2 == 0) {
                System.out.println(listNumbers[i]);
            }
        }
    }

    public static void printChan(int[] listNumbers) {
// Cách 1: for truyền thống - duyêt theo index
//        for (int i = 0; i < listNumbers.length; i++) {
//            if (listNumbers[i] % 2 == 0) {
//                System.out.println(listNumbers[i]);
//            }
//        }
//    }
// Cách 2: for cải tiến -duyệt theo item
    for(int number:listNumbers){
        if (number% 2 == 0) {
            System.out.println(number);
        }
    }
}
    public static void printLe(int[]listNumbers){
        for(int i = 0;i < listNumbers.length;i++){
            if (listNumbers[i]% 2 != 0) {
                System.out.println(listNumbers[i]);
            }
        }
    }

    public static void printPrimes(int[]listNumbers){
        for (int number:listNumbers) {
            if(isPrime(number)){
                System.out.println(number);
            }
        }
        }



    public static void main(String[] args) {
        int number = 3;
        boolean check = isPrime(number);
        if (check) {// java tự hiểu check== true
            System.out.println("Số " + number + " là số nguyên tố");
        } else {
            System.out.println("Số" + number + " không là số nguyên tố");
        }
        int number2=-12345;
        int sum =sumDigits(number2);
        System.out.println("Tổng là: "+sum) ;

// Vòng lặp trong mảng dữ liệu
int[] listNumber = {5, 3, 7, 1, 9, 10};
// Bai 1: in các số trong mảng
// Bài 2: in các so chan, so le trong mảng
// Bai 3: in các số nguyên tố trong mảng
// function
// dùng void
// tham số:int[]
System.out.println("Các số trong mảng là:" );
printArray(listNumber);
System.out.println("Các số trong chan trong mảng là:" );
printChan(listNumber);
System.out.println("Các số lẻ trong mảng là:" );
printLe(listNumber);

    }
}

// For dùng khi biết đc số lan lặp
// While khi ko biết rõ số lần lặp
// - tính tổng các chữ số của 1 số
// <đk bat đầu vòng lap>while (<đk dừng>){
// code
// bước nhảy }
// Bài 2 tính tổng các chữ số của 1 số
// Vd: 1234 => 10
// Cách 1: nếu vẫn xài for => convert tu number => string => dùng function có sẵn của string



