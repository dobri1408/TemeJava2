package teme.movierental;

public class main {
    public static void main(String[] args) {
        VideoStore  store = new VideoStore();
        store.addVideo("Titanic");
        store.receiveRating("Titanic",20);
        store.listInventory();
    }
}
