public class Main {
    public static void main(String[] args) {

        int ticket = 60;
        int mile = 1;
        int pay = 20;

        int AllMile = ticket * mile / pay;
        System.out.println("На вашем бонусном счете " + AllMile + " миль(и)");
    }
}
