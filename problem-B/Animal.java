public abstract class Animal {
    protected int legs;
    protected String name;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public abstract void eat();

    public void walk() {
        System.out.println(this.name + " walks on " + legs + " legs.");
    }

    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.eat();
        d.walk();

        c.play();
        c.eat();
        c.walk();

        a.eat();
        a.walk();

        e.eat();
        e.walk();

        p.play();
        ((Cat) p).eat();

        Animal animal1 = new Fish();
        Animal animal2 = new Cat("Mikey");

        animal1.eat();
        animal2.eat();


        Cat cat1 = new Cat("Tom") {
            public void play() {
                super.play();
                System.out.println("Tom also plays with a ball");
            }
        };

        cat1.play();
    }
}