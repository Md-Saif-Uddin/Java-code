import java.util.*;
import java.util.ArrayList;

class primeNum{
  public static void main(String[] args){
    int num = 910;
    List<String> arrangements = mathChallenge(num);

    if(arrangements.size()>1){
      for(String arrange : arrangements){
          Integer number = Integer.parseInt(arrange);
        if(isPrime(number)){
          System.out.println(arrange);
        }
      }
    }else{
      System.out.println(0);
    }
    
  }

  static List<String> mathChallenge(int num){
    List<String> permutations = new ArrayList<>();
    String numStr = Integer.toString(num);
    genPermutations(0,numStr.toCharArray(),permutations);
    return permutations;
  }

  static void genPermutations(int index,char[] digits, List<String> permutations){
    if(index == digits.length-1){
      String str = changeStr(digits);
      permutations.add(str);
    }else{
      for(int i = index; i < digits.length; i++){
        //here when we swapped then original array has changed
        swap(digits, index, i);
        genPermutations(index+1,digits,permutations);
        //again swapped just to get original array
        swap(digits, index, i);
      }
    }
  }

    //idk the methor how to convert char array to the string thats why i had to do this
  static String changeStr(char[] arr){
    String str  = "";
    for(int i = 0;i<arr.length;i++){
      str += arr[i];
    }
    return str;
  }

  

  static void swap(char[] arr, int first,int second){
    char temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }

  static boolean isPrime(Integer num){
    for(Integer i = 2; i<=num/2;i++){
      if(num%i==0){
        return false;
      }
    }
    return true;
  }
}