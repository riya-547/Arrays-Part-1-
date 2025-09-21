public class linear {
    // TIME COMPLEXITY OD LINEAR SEARCH IS O(n)
    // public static int linearSearch(int numbers[] , int key){
    //     // for(int i = 0 ; i<numbers.length ; i++ ){
    //     //     if(numbers[i] == key){
    //     //         return i;
    //     //     }
          
    //     // }
    //     //  return -1;
    // }
    public static int linearS(String dish[] , String key){
        for(int i = 0 ; i < dish.length ; i++){
            if(dish[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        // int numbers[] = {1,2,3,4,5,6,7,8};
        // int key = 5;

        // int index = linearSearch(numbers, key);
        // if(index == -1){
        //     System.out.println("NOT FOUND");
        // }
        // else{
        //     System.out.println("key is found at index : " + index);
        // }
              

        String dish[] = {"noodles" , "chaumin" , "samosa" , "manshurian" , "poha" , "jalebi"};
        String key = "samosa";

        int stridish = linearS(dish , key);

        if(stridish == -1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("KEY IS FOUND AT INDEX " + stridish);
        }
    }
}
