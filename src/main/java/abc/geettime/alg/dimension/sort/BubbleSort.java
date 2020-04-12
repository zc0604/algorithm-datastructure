package abc.geettime.alg.dimension.sort;

/**
 * @Description 冒泡排序 [相邻元素两两相比较，最大的放到最后边]
 * @auther cong zhang
 * @email zc.bjut@gmail.com
 * @create 2020-04-12 18:29
 */
public class BubbleSort {

    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        int num [] = {124,56,5,4,6,7,8,9,11};
        sort.sort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    public void sort(int []num) {
        if (num == null || num.length < 2) {
            return;
        }
        for (int i = 0; i < num.length; i++) {
            for( int j = 0 ; j < num.length - i -1 ; j ++ ){
                if( num[j] > num[j+1]){
                    int t = num[j];
                    num[j] = num[j+1];
                    num[j+1] = t;
                }
            }
        }
    }
}
