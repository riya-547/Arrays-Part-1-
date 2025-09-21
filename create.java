public class create{
    public static void main(String[] args) {
        int array[] = new int[500];
        int arrays[] = {1,2,3,4};
        String arraays[] = {"apple" , " bananan" , "hekko"};
        array[0] = 1;
        array[1] = 6;
        array[2] = 4;

        System.out.println(array[0]);
        System.out.println(arrays[2]);
        System.out.println(arraays.length);
        System.out.println(array.length);
        arrays[2] = 5;
        array[0] += 6;
        System.out.println(arrays[2]);
        System.out.println(array[0]);
    }
}