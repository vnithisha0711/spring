public class secondLargest {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 6, 3, 3, 3, 2, 3, 5, 0};
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            } else if (a[i] > secondLargest && a[i] != largest) {
                secondLargest = a[i];
            }
        }
        
        System.out.println("Second largest element: " + secondLargest);
    }
}
