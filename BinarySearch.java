public class BinarySearch {
    // for binary search array must be sorted
    public static int binary(int array[] , int key){
      int start = 0;
      int end = array.length - 1;
      while(start <= end){
        int mid = (start + end ) / 2;
        if(array[mid] == key){
            return mid;
        }
        if(array[mid] < key){
            start = mid + 1;

        }else{
            end = mid - 1;
        }
      }
      return -1;
    }
    public static void main(String[] args) {
        int array[] = { 1,2,3,4,5,6,7,8};
         int key = 10;
         System.out.println("the index of " + key + " in an array is " + binary(array , key));
    }
}
// time complexuty of binary search is O(log n )
