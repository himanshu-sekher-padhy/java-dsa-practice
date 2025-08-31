class Main{
    public static void main(String args[]){
        StringBuffer sb= new StringBuffer("Hello, EveryOne!");
        //initial capacity= 16+16=32
        
        sb.append(" How are you all?");
        System.out.println(sb);
        //capacity needed= 16+17=33 >initial capacity.
        // new capacity= (32*2)+2= 66
        
        System.out.println(sb.capacity());
        
        sb.insert(6," Shiva");
        System.out.println(sb);
        
        sb.replace(7,12,"Deepak");
        System.out.println(sb);
        
        sb.delete(13,22);
        System.out.println(sb);
        
        sb.reverse();
        System.out.println(sb);
        
        System.out.println("Current capacity: "+sb.capacity());
        sb.ensureCapacity(100);
        //(66*2)+2=134>100 so new capacity becomes 134, not 100.
        System.out.println("New capacity: "+sb.capacity());
        
        System.out.println(sb.charAt(0));
        sb.setCharAt(0, '!');
        System.out.println(sb);
        
        System.out.println(sb.substring(2,9));
        
        sb.deleteCharAt(0);
        System.out.println(sb);
        
    }
}