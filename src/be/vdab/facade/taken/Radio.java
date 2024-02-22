package be.vdab.facade.taken;

class Radio implements Geluidsbron{

    @Override
    public void start() {
        System.out.println("Radio gestart");
    }

    public void stop() {
        System.out.println("Radio gestopt");
    }

}
