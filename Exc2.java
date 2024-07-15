public class DoublyStochastic {
    public static void main(String[] args) {
        double[][] Array = new double[][] {
                {0.4,0.3,0.2,0.1},
                {0.1,0.4,0.3,0.2},
                {0.3,0.2,0.1,0.4},
                {0.2,0.1,0.4,0.3}
        };// A doubly stochastic Matrix

        double e = 0.000000001;
        double sum = 0;
        boolean RowCheck = false,ColumCheck = false,OverAllCheck = false;

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                sum = sum + Array[i][j];
            }
            if (sum < 1+e && sum > 1-e){
                RowCheck = true;
                sum = 0;
            }
            else{
                RowCheck = false;
                break;
            }

        }

        sum = 0;

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                sum = sum + Array[j][i];
            }
            if (sum < 1+e && sum > 1-e){
                ColumCheck = true;
                sum = 0;
            }
            else{
                ColumCheck = false;
                break;
            }

            if (ColumCheck == true && RowCheck == true)
                OverAllCheck = true;

        }

        StdOut.println(OverAllCheck);
    }


}
