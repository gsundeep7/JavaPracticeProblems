package test.example.Javapractice.OOPS.Inheritance;

public class Main1 {
        public static void main(String[] args) {
            // Polymorphism: Animal reference, Dog/Cat object
            Animal1 a1 = new Dog1();
            Animal1 a2 = new Cat1();

            // ✅ Common behaviors (inherited from Animal)
            a1.eat();
            a1.sleep();
            a1.sound();  // Dog barks (runtime polymorphism)

            a2.eat();
            a2.sleep();
            a2.sound();  // Cat meows (runtime polymorphism)

            // ✅ Specific behaviors (need casting or direct reference)
            if (a1 instanceof Dog1) {
                ((Dog1) a1).guard();
            }

            if (a2 instanceof Cat1) {
                ((Cat1) a2).climb();
            }
        }


}
