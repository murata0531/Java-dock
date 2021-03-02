class Foo{
    
    private int num;

    public boolean equals(Object o){

        if((o instanceof Foo) && (((Foo)o).num == this.num)){
            return true;
        }else {
            return false;
        }
    }

}