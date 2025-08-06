package test.example.Javapractice.Arrays;

//**Remove duplicates from an array**

public class RemoveDuplicates {

    public static void main(String[] args) {
               int[] arr = {10, 20, 10, 30, 20, 40, 50};
                int[] temp = new int[arr.length];
                int newLength = 0;

                for (int i = 0; i < arr.length; i++) {
                    boolean isDuplicate = false;
                    for (int j = 0; j < newLength; j++) {
                        if (arr[i] == temp[j]) {
                            isDuplicate = true;
                            break;
                        }
                    }
                    if (!isDuplicate) {
                        temp[newLength++] = arr[i];
                    }
                }

                System.out.println("Unique elements:");
                for (int i = 0; i < newLength; i++) {
                    System.out.print(temp[i] + " ");
                }
            }

}
