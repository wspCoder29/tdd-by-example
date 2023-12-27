package guru.springframework;

public class Dollar {

    int amount;

    public Dollar(int multiplier) {
        amount = multiplier;
    }

    int times(int multiplier){
        amount = amount * 2;
        return amount;
    }



}
