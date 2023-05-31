 class mouse {
    private int x, y;
    public mouse(){
        this.x = 10;
        this.y = 20;

    }
    public mouse(int _x, int _y){
        this.x = _x;
        this.y = _y;

    }
    public void printLocation() {
        System.out.println("x="+this.x+" y="+this.y);
    }
}
