enum Card {
    SPADES(3),CLUBS(1),DIAMONDS(4),HEARTS();
    private int a;

    Card(){
        this.a = 100;
    }

    Card(int a){
        this.a = a;
    }

    public int getA(){
        return a;
    }
}
