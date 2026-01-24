package OOPs;
public class Use_of_this {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = new Cat("mufasa");
        Cat c3 = new Cat("lucy");
        Cat c4 = new Cat("spicy");
        Cat c5 = new Cat("oggy");
        System.out.println(c2.nameGiven);
        System.out.println(c3.name);
    }
}
class Cat{
    String nameGiven, name;
    Cat(){
        System.out.println("DC");
    }
    Cat(String nameGiven){
        name = nameGiven; /*doesn't print null because instance variable = parameter but still it is better
        to use this.name = nameGiven as a part of convention because what if someone change nameGiven to
        name*/
        nameGiven = nameGiven; /*Reassigns the parameter to itself. Does not affect the instance variable.
        so prints null if code ends at this line*/
        this.nameGiven = nameGiven;
        nameGiven = nameGiven; //Null is printed only when the instance variable is never assigned.
    }
    void running() {
        int local_var = 10; // Local varaible
        System.out.println("Who is running -> " + this.nameGiven);
    }
}
