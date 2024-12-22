public static int[] getRowWithMaxSum(int[][] array2D){
    int[] maxRow = array2D[0];
    int maxSum = 0;
    for(int i = 0;i < array2D.length;i++){
        int sum = 0;
        for(int j = 0;j < array2D[i].length;j++){
            sum += array2D[i][j];
        }
        if(sum > maxSum){
            maxSum = sum;
            maxRow = array2D[i];
        }
    }
    return maxRow;
}