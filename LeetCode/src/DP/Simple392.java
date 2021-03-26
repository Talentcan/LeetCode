package DP;

import java.util.ArrayList;

public class Simple392 {
    public static void main(String[] args) {
        String t = "aaaaaa";
        String s = "baaaaa";
//        ArrayList<Character> arrayList = new ArrayList<>();
//        for (int i=0 ; i <string2.length() ; i++){
//            for (int j=0 ; j< string1.length() ; j++){
//                if (string1.charAt(j) == string2.charAt(i)){
//                    arrayList.add(string1.charAt(j));
//                    break;
//                }
//            }
//        }
//        boolean result = true;
//        for (int i=0 ; i<arrayList.size()-1 ; i++){
//            if (arrayList.get(i) > arrayList.get(i+1) || !string2.equals(arrayList.toString())){
//                result = false;
//            }
//        }
//        if (result && string2.length() == arrayList.size())
//            System.out.println("true");
//        else
//            System.out.println("false");


        int index = -1;
        for (char c : s.toCharArray()){
            index = t.indexOf(c, index+1);
            if (index == -1) System.out.println(false);
        }
        System.out.println(true);





//        String string1 = "123456789";
//        String string2 = "105";
//        int [] arr = new int [string2.length()];
//        for (int i=0 ; i <string2.length() ; i++){
//            for (int j=0 ; j< string1.length() ; j++){
//                if (string1.charAt(j) == string2.charAt(i)){
//                    arr[i]=j;
//                    break;
//                }
//            }
//        }
//        boolean result = true;
//        for (int i=0 ; i<arr.length-1 ; i++){
//            if (arr[i] > arr[i+1] || string2.charAt(arr[i])==string2.charAt(i)){
//                result = false;
//            }
//        }
//        if (result)
//            System.out.println("true");
//        else
//            System.out.println("false");
    }
}
