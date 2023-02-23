// Name: Murad Mohammed
// Date: 02/23/2023
// In Class Assignments 

class Main {
  public static void main(String[] args) {

    System.out.println(removeOdds(8342116));
    System.out.println(removeOdds(4109));
    System.out.println(removeOdds(8));
    System.out.println(removeOdds(-34512));
    System.out.println(removeOdds(-163505));
    System.out.println(removeOdds(3052));
    System.out.println(removeOdds(7010496));    
    System.out.println(removeOdds(35179));
    System.out.println(removeOdds(5307));
    System.out.println(removeOdds(7));

    System.out.println();

    System.out.println(indexOf("Barack Obama", "Bar"));
    System.out.println(indexOf("Barack Obama", "ck"));
    System.out.println(indexOf("Barack Obama", "a")	);
    System.out.println(indexOf("Barack Obama", "McCain"));
    System.out.println(indexOf("Barack Obama", "BAR")	);
    
  }


  public static int removeOdds(int n) {
    if (n == 0) {
        return 0;
    } else if (n < 0) {
        return -removeOdds(-n); // handle negative numbers
    } else {
        int lastDigit = n % 10;
        if (lastDigit % 2 == 0) { // even number
            int result = removeOdds(n / 10);
            if (result == 0 && lastDigit == 0) {
                return 0; // ignore leading zeros
            } else {
                return result * 10 + lastDigit; // add even digit to result
            }
        } else { // odd number
            return removeOdds(n / 10);
        }
    }
}

  public static int indexOf(String firstString, String secondString){

    if(firstString.length() < secondString.length()) {
      return -1;
    }
      else if(firstString.substring(0, secondString.length()).equals(secondString)) {
        return 0;
      }
      int index = indexOf(firstString.substring(1), secondString);

      if(index == -1) {
        return -1;
      }
      return index + 1;
    }


}