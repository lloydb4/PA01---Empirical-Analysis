import java.util.*;

public class Main
{
    
    public static void increaseSize(int original[]) {    
        //create a temporary array with a size that is 1000 elements larger
        int[] temp = new int[original.length + 1000];
        
           for (int i = 0; i < original.length; i++){
               //copy the elements of the original into the temp
               temp[i] = original[i];
           }
           original = temp;
    }
/*------------------------------------------------------------------------------------*/    
    //Sort analysis method
    public static void SortCounter(int array[])
    {
       // Counter to count number of comparisons
       int count = 0;
       int n = array.length;
      
       // Loops till length minus one times
       for(int i = 1; i < n-1; i++)
        {
            //Stores i index position value as key value
            int key = array[i];          
            int j = i - 1;
          
            // Move elements of array[0..i - 1], that are greater than key,
            // to one position ahead of their current position
            while(j >= 0 && array[j] > key)
            {
                // Increase the counter by one
                count++;
                // Swaps each element of the array one position to right
                array[j + 1] = array[j];
                j--;
            } //End of while
            if(j>=0){
                count++;
            }
            array[j + 1] = key;
        } //End of for
        //ouput 
        return count;
    } //End of method
 /*------------------------------------------------------------------------------------*/   
    //test code
        public static void main(String[] args) {
                
                int count;
                //Create array for sorting
                int randomArray[] = new int[1000];
                int size = randomArray.length;

                System.out.println("\n----Ascending order----");
                for(int i = 0; i < 20; i++) {
                    
                    //Generate array size with random values
                    generateArray(randomArray);
                    // Calls the method to sort the array in ascending order
                    count = SortCounter(randomArray);
                    // Displays the number of comparisons
                    System.out.println( + size + "\t" + count); 
                    size+=1000;
                }
                
                
                        /*System.out.println("\n----Descending order----");
                for(int t = 0; t < 20; t++) {
                    
                    //random size of array
                    Random r = new Random();
                    int size = r.nextInt(1000);
                    int arr[] = new int[size];
                    
                    //reverse loop
                    for(int i = size-1; i > -1; i--) {
                        
                        arr[size-i-1] = i;
                    }
                    
                   //cal sort function
                    SortCounter(arr);
                }
                
                
                        System.out.println("\n----Random order----");
                for(int t = 0; t < 20; t++) {
                    
                    //random size of array
                    Random r = new Random();
                    int size = r.nextInt(1000);
                    int arr[] = new int[size];
                    
                    for(int i = 0; i < size; i++) {
                        
                        //load random elements in the array
                        arr[i] = r.nextInt(10000);
                    }
                    
                   //cal sort function
                    SortCounter(arr);
                }*/
        }
}
