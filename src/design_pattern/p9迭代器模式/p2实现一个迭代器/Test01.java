package design_pattern.p9迭代器模式.p2实现一个迭代器;

/**
 * @author xm
 * @date 2021/9/16 16:49
 * @description:
 */
public class Test01 {
    public static void main(String[] args) {
        int[] arry = new int[6];
        for (int i = 0; i < 6; i++) {
            arry[i] = i;
        }

        IteratorImp imp = new IteratorImp(arry);
        while (imp.hasNext()){
            System.out.println(imp.next());
        }
    }
}

