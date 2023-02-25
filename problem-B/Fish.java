public class Fish extends Animal implements Pet{
    public Fish() {
        super(0);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(this.name + " eats food");
    }

    public void walk() {
        System.out.println(this.name + " can't walk");
    }

    @Override
    public void play() {
        System.out.println(this.name + " plays with a ball");
    }
}