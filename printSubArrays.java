public class printSubArrays {
    public static void subArrays(int arrys[]){
        for(int i = 0 ; i < arrys.length ; i++){
          for(int j = i ; j < arrys.length ; j++){
             for(int k = i ; k <= j ; k++){
                System.out.print(arrys[k] + " ");
             }
             System.out.println();
          }
          System.out.println();
    }
    }
    
    public static void main(String[] args){
        int arrys[] =  {1,2,3,4,5};
        subArrays(arrys);
        

    }
}
