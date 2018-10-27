public class Dog {
    String name;
    private int numberOfLegs;

    public Dog() {this.numberOfLegs = 4;    }

    public Dog(String name) {
        this();
        this.name = name;
    }


    public void bark() {System.out.println("hua");}


    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
}

