public class Classroom {

    public static void main(String[] args) {
        Wilder myName = new Wilder("Ethan", false);
        System.out.println(myName.whoAmI());

        Wilder yves = new Wilder("Yves", true);
        System.out.println(yves.whoAmI());

        Wilder idriss = new Wilder("Idriss", false);
        System.out.println(idriss.whoAmI());
    }
}
