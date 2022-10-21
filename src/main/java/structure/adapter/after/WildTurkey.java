package structure.adapter.after;

class WildTurkey implements Turkey{

    @Override
    public void gobble() {
        System.out.println("골골");
    }

    @Override
    public void fly() {
        System.out.println("퍼더덕");
    }

}
