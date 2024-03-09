import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour {

    private List<Actor> marketActors = new ArrayList<>();
    private List<Actor> queue = new ArrayList<>();

    @Override
    public void acceptToMarket(Actor actor) {
        marketActors.add(actor);
        System.out.println(actor.getName() + " принят в магазин.");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            marketActors.remove(actor);
            System.out.println(actor.getName() + " вышел из магазина");
        }
    }

    @Override
    public void update() {
        System.out.println("Состояние магазина обновлено.");
    }

    @Override
    public void takeOrders() {
        System.out.println("Принимаем заказы.");
    }

    @Override
    public void giveOrders() {
        System.out.println("Выдаём заказы.");
    }

    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
        System.out.println(actor.getName() + " встал в очередь.");
    }

    @Override
    public void releaseFromQueue() {
        if (!queue.isEmpty()) {
            Actor actor = queue.remove(0);
            System.out.println(actor.getName() + " освобождён из очереди.");
        } else {
            System.out.println("Очередь пуста.");
        }
    }

    public static void main(String[] args) {
        Market market = new Market();

    }
}
