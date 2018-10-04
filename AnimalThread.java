public class AnimalThread extends Thread {
    public String nameAnimal;
    public int priorityAnimal;

    public AnimalThread(String nameAnimal, int priorityAnimal){
        this.nameAnimal = nameAnimal;
        this.priorityAnimal = priorityAnimal;
    }

    public void run(){
        int countMetr = 0;

        do{
            countMetr++;

            if (countMetr %100 == 0){
                System.out.println(nameAnimal + " бежит на " + countMetr + " метре");
            }

            if (countMetr == 2000){
                setPriority(priorityAnimal);
            }

        }while (countMetr < 10000);
    }
}
