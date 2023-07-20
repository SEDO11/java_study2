public class Example1 {
    public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard();

        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}

class SutdaCard {
    private int num;
    private boolean isKwang;
    
    SutdaCard() {
        this.num = 1;
        this.isKwang = true;
    }
    
    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String info() {
        String s = "";
        if(isKwang) {
            s+= num + "K";
        } else {
            s += num;
        }
        return s;
    }
}
