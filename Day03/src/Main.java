import org.junit.Test;

public class Main {
    // 打印 99 乘法表
    @Test
    public void print99() {
        System.out.println("打印 99 乘法表");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + i + " * " + j + " = " + i * j);
            }
            System.out.println();
        }
    }

    // 打印等腰三角形
    @Test
    public void printTriangle() {
        System.out.println("打印等腰三角形");
        System.out.println(" /\\\n/  \\\n——");

    }


}
