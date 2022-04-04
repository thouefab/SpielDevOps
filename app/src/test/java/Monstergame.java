import org.junit.jupiter.api.Test;

public class Monstergame {
    private int gesundheit = 100;
    public void angriff (int staerke) {
        if (gesundheit > staerke) {
            gesundheit = gesundheit - staerke;
        } else { 
            System.out.println("besiegt");
            }
        }
        public int getGesundheit(){
            return gesundheit;
        }

    }
