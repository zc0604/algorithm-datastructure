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
        int num [] = {1,2,2,2,3};
        System.out.println(binarySort.binarysort3(num, 2));
    }

    public int binarysort2(int []num, int key){
        int low = 0 ;
        int high = num.length ;

        while( low < high ){
            int mid = (low+ high)/2 ;
            if( num[mid] >= key){
                high = mid ;
            }else if( num[mid] < key){
                low = mid + 1;
            }
        }
        System.out.println(low + " " + high);
        return low >= num.length || num[low] != key ? -1 : low;
    }

    public int binarysort3(int []num, int key){
        int low = 0 ;
        int high = num.length ;

        while( low < high ){
            int mid = (low+ high)/2 ;
            if( num[mid] > key){
                high = mid -1 ;
            }else if( num[mid] <= key){
                low = mid ;
            }
        }
        System.out.println(low + " " + high);
        return low >= num.length || num[low] != key ? -1 : low;
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
