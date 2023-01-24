public class HumanApplication {
    public static void main(String[] args) {

        Human human1 = new Human();
        human1.name = "Adam";
        human1.age = 40.5;
        human1.height = 178;

        human1.olderTaller();
        human1.youngerShorter();
    }
}
