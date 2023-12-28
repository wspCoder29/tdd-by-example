package guru.springframework;

public class Dollar {

    int amount;

    public Dollar(int multiplier) {
        amount = multiplier;
        //DIFF
    }

    Dollar times(int multiplier){
        amount *=multiplier;
        return new Dollar(amount);
    }

    public boolean equals(Object object){
        Dollar dollar = (Dollar)object;
        return amount==dollar.amount;
    }



}
