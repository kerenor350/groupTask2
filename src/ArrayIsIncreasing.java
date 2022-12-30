import java.util.Scanner;

public class ArrayIsIncreasing {
    public static void main(String[] args) {
        System.out.println("Enter an array  (Use comma for separation) ");
        Scanner scanner = new Scanner(System.in);
        String formUser;
        formUser = scanner.nextLine();
        String[] formUserSplit = formUser.split(",");
        int[] arr = new int[formUserSplit.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(formUserSplit[i]);
        }
        int result = increasingArray(arr);
        System.out.println(result);
    }
    public static int increasingArray(int [] toCheckArray) {
        int indexTop= -1;
        for (int i = 0; i < toCheckArray.length; i++) {
            if (toCheckArray[i] >= toCheckArray[i + 1]) {
                indexTop = i;
                break;
            }
        }
        for (int i = indexTop; i < toCheckArray.length-1; i++) {
            if (toCheckArray[i] <= toCheckArray[i+1]) {
                indexTop = -1;
                break;
            }
        }
        return indexTop;
    }
}