import java.util.List;

interface MarketBehaviour {
    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Actor> actors);
    void update();
    void takeOrders();
    void giveOrders();
    void takeInQueue(Actor actor);
    void releaseFromQueue();
}

