public interface QueueBehaviour {

    void addPack();
    void getPack();
    void addHuman();
    void delHuman();

    public static void main(String[] args) {
        Update update = new Update();
        MarketBehaviour marketBehaviour = new MarketBehaviour();
        while (true){
            marketBehaviour.addHuman();
            marketBehaviour.getName();
            marketBehaviour.addHuman();
            marketBehaviour.getName();
            marketBehaviour.delHuman();

            update.addPack();
            update.getPack();

        }


    }

}
