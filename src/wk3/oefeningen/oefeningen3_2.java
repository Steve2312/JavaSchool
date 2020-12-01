package wk3.oefeningen;

public class oefeningen3_2 {
    String a;
    String b;
    boolean vergelijking;
    public static void main(String[] args)
    {
        oefeningen3_2 x = new oefeningen3_2();
        x.a = new String("abcd");
        x.b = new String("abcd");

        x.vergelijking = (x.a.equals(x.b));
        System.out.println(x.vergelijking);

    }
}
