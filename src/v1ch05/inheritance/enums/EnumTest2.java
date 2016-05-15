package v1ch05.inheritance.enums;

public class EnumTest2 {
    public static void main(String[] args) {
        Size s = Size.EXTRA_LARGE;
        System.out.println(s.ordinal());
        Size size = Enum.valueOf(Size.class, "EXTRA_LARGE");
        System.out.println("s == size: " + (s == size));
        System.out.println("s.equals(size): " + s.equals(size));
    }
}
