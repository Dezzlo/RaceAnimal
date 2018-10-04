public class RabbitAndTurtle {
    public static void main(String[] args) {
        AnimalThread animalRabbit = new AnimalThread("Кролик" , 10);
        animalRabbit.start();
        AnimalThread animalTurtle = new AnimalThread("Черепаха" , 1);
        animalTurtle.start();
    }
}
