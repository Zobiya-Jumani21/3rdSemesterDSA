public class HW1 {
    public static void main(String[] args) {
        String[] rollNUm=new String[]{"21sw140","21es056","hhcgxf","21cs047","21tl040"};
        int[] oopMarks=new int[]{80,81,82,83,84};
        int[] ppMarks = new int[]{50,51,52,53,54};

        String[][] usClass = new String[5][3];

        for(int s=0; s<usClass.length; s++) {

            usClass[s][0]=rollNUm[s];
            usClass[s][1]= String.valueOf(oopMarks[s]);
            usClass[s][2]=String.valueOf(ppMarks[s]);
        }
        for (int i=0; i<usClass.length; i++){
            for (int j=0; j<3 ; j++){
                System.out.println(usClass[i][j]);
            }
        }
    }



}
