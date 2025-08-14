//Number pattern printing

//(1)
class main{
    public static void main(String[] args){
        
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("1 ");
            }
            System.out.println();
        }
    }
}

// output:
1
1 1
1 1 1
1 1 1 1
1 1 1 1 1

-----------------------------------------------------------------------------------------------

//(2)
class main{
    public static void main(String[] args){
        
        for(int i=1; i<= 10; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

// output:
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
1 2 3 4 5 6 7 
1 2 3 4 5 6 7 8 
1 2 3 4 5 6 7 8 9 
1 2 3 4 5 6 7 8 9 10

-----------------------------------------------------------------------------------------------

//(3)
class main{
    public static void main(String[] args){
        
        for(int i=1; i<= 10; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

// output:
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 
6 6 6 6 6 6 
7 7 7 7 7 7 7 
8 8 8 8 8 8 8 8 
9 9 9 9 9 9 9 9 9 
10 10 10 10 10 10 10 10 10 10 

-----------------------------------------------------------------------------------------------

//(4)
class main{
    public static void main(String[] args){
        for(int i=1,p=5; i<=5; i++,p--){
            for(int j=1; j<=i; j++){
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}

// output:
5 
4 4 
3 3 3 
2 2 2 2 
1 1 1 1 1

-----------------------------------------------------------------------------------------------

//(5)
class main{
    public static void main(String[] args){
        for(int i=1,p=0; i<=5; i++,p+=2){
            for(int j=1; j<=i; j++){
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}

// output:
0 
2 2 
4 4 4 
6 6 6 6 
8 8 8 8 8

-----------------------------------------------------------------------------------------------

//(6)
class main{
    public static void main(String[] args){
        for(int i=1; i<=10; i++){
            for(int j=1; j<=i; j++){
                if(i%2==0){
                    System.out.print("2 ");
                }
                else
                    System.out.print("1 ");
            }
            System.out.println();
        }
    }
}

// output:
1 
2 2 
1 1 1 
2 2 2 2 
1 1 1 1 1 
2 2 2 2 2 2 
1 1 1 1 1 1 1 
2 2 2 2 2 2 2 2 
1 1 1 1 1 1 1 1 1 
2 2 2 2 2 2 2 2 2 2

-----------------------------------------------------------------------------------------------

//(7)
class main{
    public static void main(String[] args){
        for(int i=1,p=1; i<4; i++,p++){
            for(int j=i; j<4; j++){
                System.out.print("  ");
            }
            for (int j=1; j<i; j++){
                System.out.print(p+" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(p+" ");
            }
        System.out.println();
        }
        for(int i=1,p=4; i<=4; i++,p--){
            for(int j=1; j<i; j++){
                System.out.print("  ");
            }
            for (int j=i; j<4; j++){
                System.out.print(p+" ");
            }
            for(int j=i; j<=4; j++){
                System.out.print(p+" ");
            }
        System.out.println();
        }
    }
}

// output:
      1 
    2 2 2 
  3 3 3 3 3 
4 4 4 4 4 4 4 
  3 3 3 3 3 
    2 2 2 
      1 

----------------------------------------------------------------------------------------------- 

//(8)
class main{
    public static void main(String[] args){
        int p=1;
        for(int i=1; i<4; i++,p++){
            for(int j=i; j<4; j++){
                System.out.print("  ");
            }
            for (int j=1; j<i; j++){
                System.out.print(p+" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(p+" ");
            }
        System.out.println();
        }
        for(int i=1; i<=4; i++,p++){
            for(int j=1; j<i; j++){
                System.out.print("  ");
            }
            for (int j=i; j<4; j++){
                System.out.print(p+" ");
            }
            for(int j=i; j<=4; j++){
                System.out.print(p+" ");
            }
        System.out.println();
        }
    }
}

// output:
      1 
    2 2 2 
  3 3 3 3 3 
4 4 4 4 4 4 4 
  5 5 5 5 5 
    6 6 6 
      7 

-----------------------------------------------------------------------------------------------

//(9)
class main{
    public static void main(String[] args){
        for(int i=1; i<=4; i++){
            int p=1;
            for(int j=i; j<4; j++){
                System.out.print("  ");
            }
            for (int j=1; j<i; j++){
                System.out.print(p++ +" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(p++ +" ");
            }
        System.out.println();
        }
    }
}

// output:
      1 
    1 2 3 
  1 2 3 4 5 
1 2 3 4 5 6 7 

-----------------------------------------------------------------------------------------------

//(10)
class main{
    public static void main(String[] args){
        for(int i=1; i<=5; i++){
           for(int j=i; j<5; j++){
               System.out.print("  ");
           }
           for(int j=1; j<i; j++){
               System.out.print(j+" ");
           }
           for(int j=i; j>=1; j--){
               System.out.print(j+" ");
           }
        System.out.println();
        }
    }
}

// output:
        1 
      1 2 1 
    1 2 3 2 1 
  1 2 3 4 3 2 1 
1 2 3 4 5 4 3 2 1 

-----------------------------------------------------------------------------------------------

//(11)
class main{
    public static void main(String[] args){
        int n=9;
        for(int i=1; i<=n; i++){
           for(int j=1; j<i; j++){
               System.out.print("  ");
           }
           for(int j=((n+1)-i); j>=1; j--){
               System.out.print(j+" ");
           }
        System.out.println();
        }
    }
}

// output:
9 8 7 6 5 4 3 2 1 
  8 7 6 5 4 3 2 1 
    7 6 5 4 3 2 1 
      6 5 4 3 2 1 
        5 4 3 2 1 
          4 3 2 1 
            3 2 1 
              2 1 
                1