package OOPs_super_Abstraction;
public class Interface_Variables {
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
}