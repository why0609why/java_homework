import org.junit.Test;

import java.util.Arrays;

public class Main {
    @Test
    public void test() {
        int[] base = new int[]{3, 6, 5, 2, 2, 4, 8, 1};
        // 统计偶数个数
        int even = 0;
        for (int i = 0; i < base.length; i++) {
            if (base[i] % 2 == 0) {
                even++;
            }
        }
        // 新建奇偶数组
        int[] oddArr = new int[base.length - even];
        int[] evenArr = new int[even];
        int oIdx = 0, eIdx = 0;
        for (int i = 0; i < base.length; i++) {
            if (base[i] % 2 == 0) {
                evenArr[eIdx++] = base[i];
            } else {
                oddArr[oIdx++] = base[i];
            }
        }
        // 打印
        print(oddArr, evenArr);
    }

    // 输出
    private void print(int[] oddArr, int[] evenArr) {
        int[] arr = new int[oddArr.length + evenArr.length];
        // 奇偶下标 数组下标
        int oIdx = 0,eIdx = 0, aIdx = 0;
        // 奇偶顺序输出
        while (oIdx < oddArr.length && eIdx < evenArr.length) {
            arr[aIdx++] = oddArr[oIdx++];
            arr[aIdx++] = evenArr[eIdx++];
        }
        // 多余 输出
        while (oIdx < oddArr.length){
            arr[aIdx++] = oddArr[oIdx++];
        }
        while (eIdx < evenArr.length){
            arr[aIdx++] = evenArr[eIdx++];
        }
        System.out.println(Arrays.toString(arr));
    }
}
