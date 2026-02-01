package OOPs_super_Abstraction;
public class Interface_Variables {
    public static void main(String[] args) {
        Child use2 = new Child();
        use2.show(); //prints both 10 and 20
     // Parent1 use3 = new Parent1(); cannot create an object of something that is incomplete
        Parent1 use3 = new Child1();
        System.out.println(use3.x);
        Child1 use4 = new Child1();
       use4.show();
    }
}
    class Parent {
        int x = 10;
    }
    class Child extends Parent {
        int x = 20;
        void show() {
          System.out.println(x);        // 20 (child’s variable)
         System.out.println(super.x);  // 10 (parent’s variable)
        }
    }
    interface Parent1 {
        int x = 10;
    }
    class Child1 implements Parent1 {
        int x = 20;
        void show() {
          System.out.println(x);        // 20 (child’s variable)
       //  System.out.println(super.x); 10 (parent’s variable) we can use super in case of interface
        }
    }
