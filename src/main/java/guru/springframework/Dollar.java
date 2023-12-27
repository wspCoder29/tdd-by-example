package guru.springframework;

public class Dollar {

    int amount;

    public Dollar(int multiplier) {
        amount = multiplier;
    }

    void times(int multiplier){
        amount *=multiplier;
    }
}
