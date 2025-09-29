//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int balance = 5000;
    double interest = 0.17;
    int firstMonth = (int) (balance*interest + balance);
    int secondMonth = (int) (firstMonth*interest + firstMonth);
    System.out.println("The first month of interest equals: " + firstMonth);
    System.out.println("The second month of interest equals: " + secondMonth);

    }
}