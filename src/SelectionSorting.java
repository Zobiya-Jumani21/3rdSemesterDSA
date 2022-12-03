// Selection sorting
// there are three steps of selection sort
// 1st is select the main elements
// 2nd is Replace/swap it with the left most element of unsorted array part
// 3rd is Repeat step 1 and 2 until all element are sorted.
public class SelectionSorting {
    public static void main(String[] args) {
        int[] array2 = new int[6];
        array2[0]=10; array2[1]=2;
        array2[2]=8;
        array2[3]=7;
        array2[4]=6;
        array2[5]=3;
        int temp;
        int minIndex;

        for (int i=0; i< array2.length-2; i++){
            minIndex=i;
            for (int j=i+1; j< array2.length-1; j++){
                if (array2[j]<array2[minIndex]){
                    minIndex=j;}}

                temp=array2[i];
                array2[i]=array2[minIndex];
                array2[minIndex]=temp;


        }
        for (int k=0; k< array2.length; k++){
            System.out.println(array2[k]);
        }
    }
}
