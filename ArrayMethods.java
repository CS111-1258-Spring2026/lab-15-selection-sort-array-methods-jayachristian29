/********************************************
*	AUTHOR:	jaya eckert
* COLLABORATORS: <names>
*	COURSE:	CS 111 Intro to CS I - Java
*	LAST MODIFIED: <date>
********************************************/

/********************************************
*	ArrayMethods
*********************************************
*	PROGRAM DESCRIPTION:
*	Collection of useful methods for int arrays.
*********************************************
*	ALGORITHM:
*	FOR each index i in the array from 0 to length - 2:
* 1. Find the index of the minimum element (minIndex) in the remaining
* unsorted portion of the arrar (from i to end) using indexOfMin.
* 2. Swap the element at current index i with the element at minIndex
* using the swap method.
* 3. Repeat until the entire array is sorted.
*********************************************

/* UML CLASS DIAGRAM:
-----------------------------------------
ArrayMethods
-----------------------------------------
-----------------------------------------
+ arrayString(array : int[]) : String //static
+ swap(array : int[], a : int, b : int) : void //static
+ indexOfMin(array : int[], startIndex : int) : int //static
+ reverse(array : int[]) : void //static
+ selectionSort(array : int[]) : void //static
-----------------------------------------
*/


public class ArrayMethods
{

  /**DESCRIPTION: */
  public static String arrayString(int[] a)
  {
    String result = "{ ";
    for (int i = 0; i < a.length; i++) {
      result += a[i];
      if (i < a.length - 1 ){
        result += ", ";
      }
    }
    return result += " }"; //STUB to keep compiler happy
  }
  
  /**DESCRIPTION: */
  public static void swap(int[] array, int a, int b)
  {
   int temp = array[a]; 
   array [a] = array[b];
   array [b] = temp;
   }
	
	/**DESCRIPTION: */
  public static int indexOfMin(int[] array, int startIndex)
  {
    int minIndex = startIndex;

   for (int i = startIndex + 1; i < array.length; i++){
    if (array[i] < array [minIndex]){
      //minValue= array[i];
      minIndex = i;
     }
    }
  return minIndex;
  }


	/**DESCRIPTION: */
  public static void reverse(int[] array)
  {

    for (int i = 0; i < array.length / 2; i++)
      {
      swap(array, i, array.length - 1 - i);
    }
  }

	/**DESCRIPTION: */
  public static void selectionSort(int[] array)
  {
    for (int i = 0; i < array.length - 1; i++){
      int minPos = indexOfMin(array, i);
     // indexOfMin = i;
      swap(array, i, minPos);
    }
  } 
}