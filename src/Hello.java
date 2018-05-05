public class Hello {
    /* public: anyone can access it
       static: method can be run without creating an instance of hte class containing the main method
       void: method doesn't return any value
       main: the name of the method
    */
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // store an integer called myFirstNumber and assign value of 5 to it
        int myFirstNumber = 5;
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;

        int myTotal = (myFirstNumber + mySecondNumber + myThirdNumber);

        int myNumber = 1000 - myTotal;

        System.out.println(myTotal);
        System.out.println(myNumber);
    }
}
