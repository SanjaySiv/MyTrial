package udemy;

public class LogicalOperators {
    public static void main(String[] args){
        int var1=4;
        int var2=3;
        int var3=7;
        int var4=9;
        boolean try1=var1<var2;
        boolean try2=var3>var4;
        boolean try3=var1<var3&&var3>var2;
        boolean try4=var1>var3||var3>var2;
        System.out.println(try1);
        System.out.println(try2);
        System.out.println(try3);
        System.out.println(try4);
    }
}
