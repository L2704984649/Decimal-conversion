import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("请输入要转换的数和转换前的进制数及转换后的进制数(最高不超过36),（如：10进制转2进制就输入Parameter 10 2）:");
        System.out.println(Integer.toString(Integer.parseInt(scanner.next(), scanner.nextInt()),scanner.nextInt()));
    }
}