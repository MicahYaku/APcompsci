class Recursive
{
    public static void main(String[] args) 
    {
        int[] arr = {2,5,12,14, 15,17,23,45,56,67,69,82,83,99};
        String[] ar = {"aa","ab","bb","bc", "cc","cd","dd","de","ee","fe","ef","ff","fg","gg"};
        int foundIndex = recursiveBinarySearch(arr, 99, 0, arr.length-1);
        int foundIndex2 = recursiveBinarySearch(ar, "ef", 0, arr.length-1);
        System.out.println(foundIndex);
        System.out.println(foundIndex2);
    }
  
    public static int recursiveBinarySearch(int[] myArray, int target, int startVal, int endVal)
    {
        int middle = (startVal + endVal)/2;
        
        if(myArray[middle] == target)
        return middle;

        else if(endVal < startVal)
        return -1;
        
        else if(target < myArray[middle])
        return recursiveBinarySearch(myArray, target, startVal, middle-1);

        else
        return recursiveBinarySearch(myArray, target, middle+1, endVal);
    }

    public static int recursiveBinarySearch(String[] myArray, String target, int startVal, int endVal)
    {
        int middle = (startVal + endVal)/2;
        
        if(myArray[middle].equals(target))
        return middle;

        else if(endVal < startVal)
        return -1;
        
        else if(target.compareTo(myArray[middle]) < 0)
        return recursiveBinarySearch(myArray, target, startVal, middle-1);

        else
        return recursiveBinarySearch(myArray, target, middle+1, endVal);
    }

    
}