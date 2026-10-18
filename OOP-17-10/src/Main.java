//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
 //Vd:quản lý nhân viên
// nhân viên Fulltime
//  id,name,lương co ban
// fulltime :bonus
// partime: hour,rate
// phân tích:
//Employee -class cha
// Fulltime -clas con
// Partime - class con
        Employee[] listEmployee = {
                 new Fulltime("F01","Khang",10_000_000,5_000_000),
                 new Parttime("P01","Bo",10,500_000)
        };
        for (Employee e :listEmployee){
            System.out.println(e.getName() + " - " + e.calculateSalary());
        }
//VD2:hình học
// Circle,Rectangle
// Tính chuvi,dientich
// Shape- class cha
// Circle-class con
// Rectangle-class con
        Shape[]listShape={
                new Circle(10),
                new Rectangle(10,20)
        };
        for(Shape s : listShape){
            System.out.println(s);
        }
    }
}