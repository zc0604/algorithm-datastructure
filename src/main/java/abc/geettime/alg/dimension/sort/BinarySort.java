package abc.geettime.alg.dimension.sort;

/**
 * @Description 二分查找
 * @auther cong zhang
 * @email zc.bjut@gmail.com
 * @create 2020-04-12 18:05
 */
public class BinarySort {

    public static void main(String[] args) {
        BinarySort binarySort = new BinarySort();
        int num [] = {1,4,5,5,5,6,7,8,9,11};
        System.out.println(binarySort.binarysort(num, 5));
    }

    public int binarysort(int []num, int key){
        int low = 0 ;
        int high = num.length - 1;

        while( low <= high){
            int mid = (low+ high)/2 ;
            if( num[mid] < key){
                low = low + 1;
            }else if( num[mid] > key){
                high = high - 1;
            }else {
                return mid;
            }
        }
        return -1 ;
    }



}
