//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static String removeVowels(String str){
        if(str== null) return null;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<str.length();i++){
            char c = str.charAt(i);
            char lowerCase= Character.toLowerCase(c);
            if(lowerCase != 'u'&& lowerCase != 'e'&& lowerCase != 'o'&& lowerCase != 'a'&& lowerCase != 'i'){
                sb.append(c);
            }
        }
        return sb.toString();
    }
//    ================================
//FUNCTION TimSoLonThuHai(arr):
//    IF độ dài arr < 2:
//    RETURN Integer.MIN_VALUE
//
//            max1 = Integer.MIN_VALUE
//    max2 = Integer.MIN_VALUE
//
//    FOR mỗi x trong arr:
//    IF x > max1:
//    max2 = max1
//            max1 = x
//    ELSE IF x < max1 AND x > max2:
//    max2 = x
//
//    IF max2 == Integer.MIN_VALUE:
//    RETURN Integer.MIN_VALUE
//
//    RETURN max2


    public static int solonthuhai(int[]arr) {
        if (arr == null || arr.length < 2) {
            return Integer.MIN_VALUE;}
            int max1 = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            for (int x : arr) {
                if (x > max1) {
                    max2 = max1;
                    max1 = x;
                } else if (x < max1 && x > max2) {
                    max2 = x;
                }
            }
                if (max2 == Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
                return max2;
            }
    //    ===============================================
    public static int tongSoChan(int n) {
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            if(i % 2 == 0){
                sum += i ;
            }
        }
        return sum;
    }
//    =======================================================
public static int demSoTu(String str) {
    if (str == null || str.trim().isEmpty()) {
        return 0;
    }
    String[]words = str.split(" ");
    return words.length;
}
//===============================================
public static String chuCaiDau(String str) {
    if (str == null || str.trim().isEmpty()) {
        return "";
    }

    String[] words = str.trim().split("\\s+");
    String result = "";

    for (String word : words) {
        result += word.charAt(0);
    }

    return result;
}
            public static void main (String[]args){
                String str = "Cybersoft";
                System.out.println(removeVowels(str));
//     ==================================================
                int[] arr= {4, 2, 6, 8, 9};
                System.out.println(solonthuhai(arr));
//     ==================================================
                int n = 10;
                System.out.println(tongSoChan(n));
//     =================================================
                String str1="Xin chào các bạn";
                System.out.println(demSoTu(str1));
//     ===============================================
                 String str2 = "Xin Chào Các Bạn";
                 System.out.println(chuCaiDau(str2));
    }
        }
