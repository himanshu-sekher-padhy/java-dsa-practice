import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,5,7,4,2,3,5,6));
        boolean[] visited= new boolean[list.size()];
        
        if(list.isEmpty()){
            System.out.print("It's Empty!");
        }
        else{
            for(int i=0; i<list.size(); i++){
                if(visited[i]) {
                    continue;
                }
                else{
                    int freq= Collections.frequency(list, list.get(i));
                    System.out.println(list.get(i)+" appeared "+freq+" times.");
                    
                    for(int j=i; j<list.size(); j++){
                        if(list.get(j).equals(list.get(i)))
                            visited[j]=true;
                    }
                }
            }
        }
    }
}