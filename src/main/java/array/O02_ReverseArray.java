package array;

public class O02_ReverseArray {

    //Redid - 1
    public char[] reverse(char[] array) {
        int n = array.length;
        for (int i=0;i<n/2;i++) {
            swap(array,i,n-1-i);
        }
        return array;
    }

    private void swap(char[] array, int leftIndex, int rightIndex) {
        char temp = array[leftIndex];
        array[leftIndex] = array[rightIndex];
        array[rightIndex] = temp;
    }
}
