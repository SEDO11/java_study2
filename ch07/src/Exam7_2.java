import java.util.Arrays;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        // 코드 작성
        for (int i = 0; i < CARD_NUM; i++) {
            if (i == 0) {
                cards[i] = new SutdaCard();
            } else if (i == 2) {
                cards[i] = new SutdaCard(i+1, true);
            } else if (i == 7) {
                cards[i] = new SutdaCard(i+1, true);
            } else {
                cards[i] = new SutdaCard((i%10)+1, false);
            }
        }

    }

    void shuffle() {
        for(int i=0; i<cards.length;i++) {
            int j = (int)(Math.random()*cards.length);
            SutdaCard tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;
        }
    }

    SutdaCard pick(int index) {
        return cards[index];
    }

    SutdaCard pick() {
        int ran = (int)(Math.random()*19);
        return cards[ran];
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    // info()대신 Object클래스의 toString()을 오버라이딩했다.
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

public class Exam7_2 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();
        for (int i = 0; i < 20; i++) {
            System.out.print(deck.cards[i] + ",");
        }
        System.out.println();
        deck.shuffle();
        for (int i = 0; i < 20; i++) {
            System.out.print(deck.cards[i] + ",");
        }
        System.out.println();
        System.out.println(deck.pick());
        System.out.println(deck.pick(1));

    }
}
