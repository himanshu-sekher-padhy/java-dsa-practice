class Main{
    public static void main(String[] args){
       for(int i=1; i<10; i++ ){
            for(int j=i; j<10; j++){
                System.out.print("  ");
            }
            for(int j=1; j<i; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
        System.out.println();
       }
       for(int i=1; i<=10; i++ ){
            for(int j=1; j<i; j++){
                System.out.print("  ");
            }
            for(int j=i; j<10; j++){
                System.out.print("* ");
            }
            for(int j=i; j<=10; j++){
                System.out.print("* ");
            }
        System.out.println();
       }
    }
}
// If we just add an extra white space at the end of each "" then we will get a diamond shape