// bubble sorting
public class Sorting {
    public static void main(String[] args) {
        int[] array1 = new int[6];
        array1[0]=10; array1[1]=2;
        array1[2]=8;
        array1[3]=7;
        array1[4]=6;
        array1[5]=3;
        int temp;
       // System.out.println(array1.length);

        for (int i=0; i<array1.length-2; i++){
            for (int j=0; j<array1.length-1-i; j++){
                if (array1[j]>array1[j+1]) {
                    temp = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = temp;
                }
            }

        }
        for (int k=0; k< array1.length; k++){
            System.out.println(array1[k]);
        }

    }
}
