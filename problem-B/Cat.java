public class Cat extends Animal implements Pet {
    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        this("");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println(name + " plays with a ball");
    }



    public void eat() {
        System.out.println(name + " eats Viskas");
    }
}