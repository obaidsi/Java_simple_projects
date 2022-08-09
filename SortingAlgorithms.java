public class SortingAlgorithms {
    public SortingAlgorithms(){
    }

    public int[] bubbleSort(int[] list){
        int i, j, temp = 0;
        boolean noSwap = true;
        for (i=0; i<list.length-1; i++) {
            for (j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    noSwap = false;
                }

                if (noSwap) {
                    return list;
                }
            }
        }
        return list;
    }

    public int[] insertionSort(int[] list){
        int i, j, temp, key;
        for (i=1; i< list.length; i++){
            key = list[i];
            j = i-1;
            while(j>=0 && key<list[j]){
                temp = list[j];
                list[j] = list[j+1];
                list[j+1] = temp;
                j--;
            }
        }
        return list;
    }
}
