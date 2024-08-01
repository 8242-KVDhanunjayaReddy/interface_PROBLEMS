package InterfaceP;

interface CustomFunctional {
     void print(int num);

     default void print(String str){
         System.out.println(str);
     }
}
