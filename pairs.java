public class pairs {
    public static void pairss(int array[]){
        int tp=0;
        for(int i = 0 ; i < array.length ; i++){
            int curr = array[i];
                for(int j =  i +  1 ; j < array.length ; j++){
                      System.out.print("(" + curr + "," + j + ") ");
                      tp++;
                }
                System.out.println();
                
        }
          System.out.println(tp);
    }
    public static void main(String[] args){
        int array[] = {1,2,3,4,5,6};
        pairss(array);
      

    }
}
// time complexity - O(n^2)
//space complexity - O(1) constant