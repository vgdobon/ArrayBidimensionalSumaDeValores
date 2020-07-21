import java.util.Random;

public class ArrayBidimensionalSuma {
    int [][] myArray ;

    public ArrayBidimensionalSuma(int tamaño){
        myArray=new int[tamaño][tamaño];

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if(i<myArray.length-1){
                    myArray[i][j]=new Random().nextInt(10);
                }
            }
        }
    }

    public void suma (){
        int sumatorio=0;
        for (int i = 0; i < myArray.length; i++) {
            sumatorio=0;
            for (int j = 0; j < myArray.length; j++) {
                if(j<myArray.length-1){
                    sumatorio=sumatorio+myArray[j][i];
                }else{
                    myArray[j][i]=sumatorio;
                }

            }

        }
    }

    public void draw(){
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                System.out.print(myArray[i][j]+"  ");
            }
            System.out.println();
        }
    }


}
