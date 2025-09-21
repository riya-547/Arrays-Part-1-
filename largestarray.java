public class largestarray {
    public static int find(int array[]){
         int largest = Integer.MIN_VALUE;  // -infintiy
        int smallest = Integer.MAX_VALUE;// +infinity
          for(int i = 0 ; i < array.length ; i++){
           
            if(largest < array[i] ){
                largest = array[i];
            
            }
            if(smallest > array[i]){
                smallest = array[i];
            }
          }
          System.out.println("smallest value of array is " + smallest );
          return largest;
    }
    public static void main(String[] args){
        int array[] = {11,56,78,12,89,20};
         int finds = find(array);
         System.out.println("largest value of array is " + finds);
    }
}
