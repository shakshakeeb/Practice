// given 2 arrays create a function that lets users know (true/false) whether
// these two arrays contain any common items(letters)

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import java.util.*;



class Practice {

    public static void main(String[] args) {
        String[] array1 = {"a", "b", "c", "x"};
        String[] array2 = {"z", "y", "a"};

        int[] array = {6, 4, 3, 2, 1, 7};
        int sum = 9;


        //boolean willFindPair = containsCommonItem(array1, array2);
        //boolean willFindPair = containsCommonItem2(array1, array2);
        //boolean willFindPair = containsCommonItem3(array1, array2);
        //boolean willFindSum = hasPairWithSum(array, sum);
        boolean willFindSum2 = hasPairWithSum2(array, sum);


        if (willFindSum2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

//    public static boolean containsCommonItem(String [] array1, String [] array2){
//        for (int i = 0; i < array1.length; i++) {
//            for (int j = 0; j < array2.length; j++) {
//                if(array1[i].equals(array2[j])){
//                    System.out.println("Found pair: " + array1[i]);
//                    return true;
//                }
//            }
//        }
//        System.out.println("Not found");
//        return false;
//    }
//}


//public static boolean containsCommonItem2(String [] array1, String [] array2){
//
//    Map<String, Boolean> map = new HashMap<>();
//    for (int i = 0; i < array1.length; i++) {
//        if(!map.containsKey(array1[i])){
//            map.put(array1[i], true);
//        }
//    }
//    //check if any item in arr2 is present in the map
//    for(int j = 0; j < array2.length; j++) {
//        if(map.containsKey((array2[j]))){
//            return true;
//        }
//    }
//    return false;
//    }
//}
// }

// Naive implementation
//    public static boolean hasPairWithSum(int[] array, int sum) {
//        int len = array.length;
//
//        for (int i = 0; i < len - 1; i++) {
//            for (int j = i + 1; j < len; j++) {
//                if (array[i] + array[j] == sum)
//                    return true;
//            }
//        }
//        return false;
//    }
//}


// Better implementation

public static boolean hasPairWithSum2(int [] array, int sum) {
    Set<Integer> mySet = new HashSet<>();
    int len = array.length;
    for(int i = 0; i < len; i++){
        if(mySet.contains(array[i])){
            return true;

        }
        mySet.add(sum-array[i]);
    }
    return false;

}

}













//public static boolean containsCommonItem3(String [] array1, String [] array2) {
//    return Arrays.stream(array1).anyMatch(item -> Arrays.asList(array2).contains(item));
//}

//
//public class Practice {
//    public static void main(String[] args) {
//        String[] array1 = {"a", "b", "c", "x"};
//        String[] array2 = {"z", "y", "a"};
//
//        // Call the findPair method from the main method
//         boolean result = findPair(array1, array2);
//
//
//    }
//
//    public static boolean findPair(String[] array1, String[] array2) {
//        for (int i = 0; i < array1.length; i++) {
//            for (int j = 0; j < array2.length; j++) {
//                if (array1[i].equals(array2[j])) {
//                    System.out.println("Found pair: " + array1[i]);
//                    return true;
//                }
//            }
//        }
//        System.out.println("Not found");
//        return false;
//    }
//}

