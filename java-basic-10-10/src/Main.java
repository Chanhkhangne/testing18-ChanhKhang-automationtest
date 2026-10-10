import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static String removeVowels(String str){
        if(str == null) return null;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            char lowerCase = Character.toLowerCase(c);
            if( lowerCase!= 'u' && lowerCase != 'e' && lowerCase != 'o' && lowerCase != 'a' && lowerCase != 'i'){
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static int countWords(String str){
// B1:string=> mảng các từ trong string vd"Xin chào các bạn"=>["Xin","Chào","Các","Bạn"]
// B2:dùng length có sắn của mảng để đếm số lượng item trong mảng
        String[]words = str.split(" ");
        return words.length;
    }
    public static String reverseString(String str){
// cách 1: dùng for duyệt tu ký tự cuoi cung di len đầu chuoi
        if(str == null) return null;
        StringBuilder sb =new StringBuilder();
        for (int i = str.length() - 1; i >=0  ; i--) {
//            System.out.print(str.charAt(i));
            char c = str.charAt(i);
            sb.append(c);
        }
        return sb.toString();
// Cách 2 : dùng hàm reverse có sẵn trong String
//        return new StringBuilder(str).reverse().toString();
}
//Collection trong java
    public static void learningCollection(){
        //mảng trong Collection
        Integer[]arr = {4,2,6,8,9};
        List<Integer> listInt = new ArrayList<>(Arrays.asList(arr));
        List<String> listStr = new ArrayList<>();
//        1.Sắp xếp mảng so
//        tăng dần
        Collections.sort(listInt);
        System.out.println(listInt);
//        giảm dần
        Collections.sort(listInt, Collections.reverseOrder());
        System.out.println(listInt);
//       Đảo ngược mảng
        Collections.reverse(listInt);
        System.out.println(listInt);
//      Tìm min,max
        System.out.println("Max: "+ Collections.max(listInt));
        System.out.println("Min: "+ Collections.min(listInt));
//    Đếm số lần xuất hiện của item bất kì
        System.out.println("Count 4: "+ Collections.frequency(listInt, 4));
// Thêm,xóa,sửa item trong list
//        Thêm item
        listStr.add("Hello");
        listStr.add("world");
        listStr.add(1,"Khang");
        System.out.println(listStr);
// Đọc item
        System.out.println(listStr.get(1));
// Update
        listStr.set(0,"Hello");
        System.out.println(listStr);
// Xoa Item
//- Xóa theo index
        listStr.remove(0);
        System.out.println(listStr);
//- Xóa theo item
        listStr.remove("world");
        System.out.println(listStr);
    }
// Tính tổng trong mảng
    public static void sum(){
        List<Integer> list = new ArrayList<>(Arrays.asList(5,3,7,2,9));
        int sum = 0 ;
        for (int i = 0; i < list.size() ; i++) {
            sum += list.get(i);
        }
        System.out.println("Sum: "+ sum);
// Tính trung bình
        double avg = (double) sum / list.size();
        System.out.println("Avg: "+ avg);
    }
    public static void removeSoam(){
        List<Integer> list = new ArrayList<>(Arrays.asList(3,-2,8,9,-4));
//        // Cách 1: dùng for
//        for (int i = 0; i < list.size() ; i++) {
//            if(list.get(i)<0 ){
//                list.remove(i);
//            }
//        }
//        System.out.println(list);
        // Cách 2: Dùng removeIf
        list.removeIf(num -> num < 0);
        System.out.println(list);

    }
    public static void main(String[] args) {
        //B1
    String str="Cybersoft";
    System.out.println(removeVowels(str));
        //B2
    String str1="Xin chào các bạn";
    System.out.println(countWords(str1));
    String str2="Hello world";
    System.out.println(countWords(str2));
    // B3
    String str3="Hello";
    System.out.println(reverseString(str3));
    String str4="World";
    System.out.println(reverseString(str4));

    learningCollection();
    removeSoam();

    }
}