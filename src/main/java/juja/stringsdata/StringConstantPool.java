package juja.stringsdata;

public class StringConstantPool {
    public static void main(String[] args) {
        constantPoolDemo();
    }

    public static void constantPoolDemo() {
        String str1 = "Hello!";
        String str2 = "Hello!";
        System.out.println(str1 == str2);

        str1 = new String("Hello!").intern();
        System.out.println(str1 == str2);

        String s1 = "jim";
        String s2 = "j" + "im";
        System.out.println(s1 == s2);

        String s3 = "j";
        String im = "im";
        s3 = s3 + im;
        System.out.println(s1 == s3);
    }
}


