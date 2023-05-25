interface Inter {


    int m4();
}
class T implements Inter{
    public int m4(){
        return  9;
    }

    public static void main(String[] args) {
        T g=new T();
        g.m4();
    }
}
