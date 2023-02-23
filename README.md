# removeOdds

Write a method removeOdds that accepts an integer parameter n and that returns the integer formed by removing the odd digits from n. The following table shows several calls and their expected return values:

Call

Valued Returned

removeOdds(8342116);

8426

removeOdds(4109);

40

removeOdds(8);

8

removeOdds(-34512);

-42

removeOdds(-163505);

-60

removeOdds(3052);

2

removeOdds(7010496);

46

removeOdds(35179);

0

removeOdds(5307);

0

removeOdds(7);

0

If a negative number with even digits other than 0 is passed to the method, the result should also be negative, as shown above when -34512 is passed. Leading zeros in the result should be ignored and if there are no even digits other than 0 in the number, the method should return 0, as shown in the last three outputs.

Question 2:

Write a recursive method indexOf that accepts two Strings as parameters and that returns the starting index of the first occurrence of the second String inside the first String (or -1 if not found). The table below lists several calls to your method and their expected return values. Notice that case matters, as in the last example that returns -1.

Call	Value Returned
indexOf("Barack Obama", "Bar")	0
indexOf("Barack Obama", "ck")	4
indexOf("Barack Obama", "a")	1
indexOf("Barack Obama", "McCain")	-1
indexOf("Barack Obama", "BAR")	-1
Strings have an indexOf method, but you are not allowed to call it. You are limited to these methods:

Method	Description
equals(String other)	returns true if the two Strings contain the same characters
length()	returns the int number of characters in the String
substring(int fromIndex, int toIndex)
substring(int fromIndex)	returns a new String containing the characters from this String from fromIndex (inclusive) to toIndex (exclusive), or to the end of the String if toIndex is omitted
You are not allowed to construct any structured objects other than Strings (no array, List, Scanner, etc.) and you may not use any loops to solve this problem; you must use recursion.

