//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// tài khoản ngân hàng
//        saving account
//        =+ không được rút tiền qua số dư trong tài khoản
//        checking account
//        + rút tối đa 1.000.000VND
//        Account -class cha
//        Saving -class con
//        Checking -class con
//        SavingAccount account1= new SavingAccount(1_000_000, "An");
////        account1.withdraw(2_000_000);
//        account1.withdraw(500_000);
//        System.out.println(account1.getBalance());
        CheckingAccount account2= new CheckingAccount(1_000_000,"Khang");
        account2.withdraw(1_200_000);
    }
}