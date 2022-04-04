
// 3. Write a Java program to reverse an array of integer values.

public class Programme03 {
    public static void main(String[] args) {
        // initialize arrary
        int[] arr = new int[] { 10,20,30,40,50,60,70,80,90,100};
        System.out.println(" Original array ");
        for (int i = 0; i< arr.length; i++) {
            System.out.println(arr[i]+"");
        }

        System.out.println();
        System.out.println("Reverse array");
        for (int i = arr.length -1; i>=0;i--){
            System.out.println(arr[i]+"");
        }
    }




}
