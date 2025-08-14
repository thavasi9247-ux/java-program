import java.util.Scanner;
class FamilyMember {
    String name;
    FamilyMember(String name) {
        this.name = name;
    }
    void display() {
        System.out.println(name);
    }
}
class Father extends FamilyMember {
    Father(String name) {
        super(name);
    }
}
class Mother extends FamilyMember {
    Mother(String name) {
        super(name);
    }
}
class GrandFather extends FamilyMember {
    GrandFather(String name) {
        super(name);
    }
}
class GrandMother extends FamilyMember {
    GrandMother(String name) {
        super(name);
    }
}
class Me extends FamilyMember {
    Me(String name) {
        super(name);
    }
}
public class SimpleInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Grandfather's name: ");
        GrandFather gf = new GrandFather(sc.nextLine());
        System.out.print("Enter Grandmother's name: ");
        GrandMother gm = new GrandMother(sc.nextLine());
        System.out.print("Enter Father's name: ");
        Father f = new Father(sc.nextLine());
        System.out.print("Enter Mother's name: ");
        Mother m = new Mother(sc.nextLine());
        System.out.print("Enter Your name: ");
        Me me = new Me(sc.nextLine());
        System.out.println("\n--- Family Members ---");
        System.out.print("Grandfather: "); gf.display();
        System.out.print("Grandmother: "); gm.display();
        System.out.print("Father: "); f.display();
        System.out.print("Mother: "); m.display();
        System.out.print("Me: "); me.display();
        sc.close();
    }
}