package v1ch03;

public class EnumTest {
    public static void main(String[] args) {
        Shose s = Shose.S;
        switch (s) {
            case S:
                System.out.println("S");
                break;
            case XL:
                System.out.println("Wow! XL");
                break;
        }
    }

    public enum Shose {
        S, M, L, XL, XXL
    }
}
