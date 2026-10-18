import java.util.ArrayList;
import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


//Selenium
//POM -Page object model pattern
// VD LoginPage
// -Locator(thẻ HTML trên page đó)
// - login Btn,usernameInput,passwordInput,logo,label,...
//- thuộc tính
// +clickLoginBtn()
// +fillUsername()
// +fillPassword()

// Viết testcase => tạo class để chứa testcase của page đó
// -Login test
// từng test case tương ứng với từng function của class LoginTest

// class để tương tác với page trên website
// Driver,ChromeDriver....
public class Main {
    public static void main(String[] args) {
// tạo đối tượng Student
//        Student hs1 = new Student();
////        hs1.id="123456";
////        hs1.age = 20;
////        hs1.email = "k@gmail.com";
////        hs1.name = "Khang";
////        System.out.println(hs1.id);
////        System.out.println(hs1.age);
////        System.out.println(hs1.email);
////        System.out.println(hs1.name);
//        hs1.input();
////        hs1.display();
//        Student hs2 = new Student();
//        hs2.input();
////        hs2.display();
//
//
//        Student hs3 = new Student("3", "name","HCM","024681012","D","Nam",20);
//
//        //  Tao ds học sinh
//        List<Student> listStudent = new ArrayList<>();
//        listStudent.add(hs1);
//        listStudent.add(hs2);
//        listStudent.add(hs3);
//        for (Student student : listStudent){
//            student.display();
//            System.out.println("==========================");
//        }
//        System.out.println("Exsample for automation test");
//        LoginPage loginPage = new LoginPage();
//        loginPage.login("admin","12356");
//        if(loginPage.isLoginSuccess()){
//            System.out.println("Login success");
//        }else {
//            System.out.println("Login falsed");
//        }
        // Lưu ý
// 1. K đc dùng class cha vì class cha CHỈ ĐỂ KẾ THỪA
        Car mec = new Car("1","Maybach","S600","Black",4,"Xăng");
        mec.display();

//        Vehicle vehicle = new Vehicle();=>> LỖI vì class Vehicle là class cha
    }

}