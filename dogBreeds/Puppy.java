public class Puppy extends Dog {
    // int age;

    public Puppy(String name) {
        // This constructor has one parameter, name.
        System.out.println("Name chosen is :" + name);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        System.out.println("Puppy's age is : " + age);
        return age;
    }

    public static void main(String[] args) {
        /* Object creation */
        Puppy myPuppy = new Puppy("tommy");

        /* Call class method to set puppy's age */
        myPuppy.setAge(2);

        /* Call another class method to get puppy's age */
        myPuppy.getAge();

        /* You can access instance variable as follows as well */
        System.out.println("Variable Value : " + myPuppy.age);
    }
}