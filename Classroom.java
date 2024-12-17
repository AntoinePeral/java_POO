public class Classroom {
    public static void main(String[] args) {
        Wilder jeanClaude = new Wilder("Jean-Claude", true);
        Wilder henri = new Wilder("Henri", false);
        Wilder lucas = new Wilder("Lucas", true);

        
        System.out.println("Everybody says : " + Wilder.sayHello());

        System.out.println(jeanClaude.whoAmI());
        System.out.println(henri.whoAmI());
        System.out.println(lucas.whoAmI());

        henri.setFirstName("Jean-Henri");
        System.out.println("Now my name is " + henri.getFirstName());

    }
}
