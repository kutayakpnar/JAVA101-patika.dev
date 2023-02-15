import java.util.Random;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {


            int round = 1;
            while (this.f1.health >= 0 && this.f2.health >= 0) {
                if (isWin()) {
                    break;
                }

                System.out.println("----ROUND:" + round + "----");
                round++;
                Random rnd = new Random();
                int poss = rnd.nextInt(3);

                if (poss == 1) {


                    f2.health = f1.hit(f2);
                    Random rnd2 = new Random();
                    int poss2 = rnd2.nextInt(3);
                    if (poss2 == 1) {
                        if (isWin()) {
                            break;
                        }
                        else {
                            f2.health = f1.hit(f2);
                        }
                    }
                    else {
                        if (isWin()) {
                            break;
                        }
                        else {
                            f1.health = f2.hit(f1);
                        }
                    }

                    System.out.println("f2 health: " + this.f2.health);
                    System.out.println("f1 health: " + this.f1.health);

                }
                else {


                    f1.health = f2.hit(f1);
                    Random rnd3 = new Random();
                    int poss3 = rnd3.nextInt(3);
                    if (poss3 == 1) {
                        if (isWin()) {
                            break;
                        } else {
                            f1.health = f2.hit(f1);
                        }

                    } else {
                        if (isWin()) {
                            break;
                        } else {
                            f2.health = f1.hit(f2);
                        }

                    }
                    System.out.println("f1 health: " + this.f1.health);
                    System.out.println("f2 health: " + this.f2.health);
                }
            }
        } else {
            System.out.println("Watches do not fit.");
        }



    }


    boolean isCheck() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " won!!");
            return true;
        } else if (this.f2.health == 0) {
            System.out.println(this.f1.name + " won!!");
            return true;
        } else {
            return false;
        }

    }
}






