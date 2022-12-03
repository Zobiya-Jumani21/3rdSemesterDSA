public class Main {
    public static void main(String[] args) {
       String[]  name = new String[]{"z", "o", "b", "i", "y"};
       int[] rollNum = new int[]{1,2,3,4,5};

       String[][] myClass = new String[5][2];

       for (int i=0; i< myClass.length; i++){
           myClass[i][0]=name[i];
           myClass[i][1]= String.valueOf(rollNum[i]);
       }
       for (int j=0; j<5; j++){
           for (int z=0; z<2; z++){
               System.out.println(myClass[j][z]);
           }
       }



    }
}