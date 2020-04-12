package abc.geettime.alg.dimension.sort;

/**
 * @Description 选择排序[从第一个元素开始 与后边每一个元素比较，最小的弄到前边]
 * @auther cong zhang
 * @email zc.bjut@gmail.com
 * @create 2020-04-12 18:25
 */
public class SelectionSort {

    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();
        int num [] = {124,4,5,6,7,8,9,11};
        sort.sort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

    public void sort(int []num){
        if( num == null || num.length <2){
            return ;
        }
        for( int i = 0 ; i < num.length ; i++){
            int minindex = i ;
            for( int j = i+1 ; j <num.length ; j++){
                if( num[minindex] > num[j]){
                    minindex = j ;
                }
            }
            if( minindex != i){
                int temp = num[i];
                num[i] = num[minindex];
                num[minindex] = temp ;
            }
        }
    }
}
