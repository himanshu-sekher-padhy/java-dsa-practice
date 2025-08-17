import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        ArrayList<Integer> list= new ArrayList<>();
        
        System.out.print("Enter number of elements: ");
        int n= sc.nextInt();
        
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }
        Collections.reverse(list);
        System.out.println("Reversed array: "+list );
        Collections.sort(list);
        System.out.println("sorted array: "+list );
        sc.close();
    }
}

/*

Collections is a utility class in java(import java.util.Collections;) that provides built in static methods to perform operaions on collections(ArrayList, linked-list etc.) like sorting, reversing, shuffling, etc.

return type of Collections.sort(), Collections.reverse() are void, so we don't need to assign it to any variable.

Only the original list is modified, no new list is created.

To use array inside Collection method we need to convert it to ArrayList first, as Collections methods work on Collection types.

                                NOTE: Arrays.asList(array);

Also the array type has to be any Wrapper class type, not primitive type.
For example, Integer[] instead of int[].

*/


import java.util.*;
class Main{
    public static void main(String[] args){
        Integer[] arr= {1,4,6,8,0,2,-3,5};
        
        System.out.println("Original array: "+Arrays.toString(arr));

        Collections.reverse(Arrays.asList(arr));
        System.out.println("Reversed array: "+Arrays.toString(arr));
        
        Collections.sort(Arrays.asList(arr));
        System.out.println("sorted array: "+Arrays.toString(arr));
    }
}