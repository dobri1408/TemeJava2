package teme.movierental;

public class VideoStore {
    private int cnt = 0;
    Video videos[] = new Video[20];

    public void addVideo(String s) {
        Video x = new Video(s);
        videos[++cnt] = x;

    }

    public void checkOut(String s) {
        for (int i = 1; i <= cnt; ++i)
            if (videos[i].getTitle().equals(s)) {
                videos[i].Check();
            }
    }

    public void returnVideo(String s) {
        for (int i = 1; i <= cnt; ++i)
            if (videos[i].getTitle().equals(s)) {
                videos[i].returned();
            }
    }

    public void receiveRating(String s, int value) {
        for (int i = 1; i <= cnt; ++i)
            if (videos[i].getTitle().equals(s)) {
                videos[i].setrating(value);
            }

    }
    public void listInventory(){
        for ( int i = 1; i<= cnt; ++i)
            System.out.println(videos[i].getTitle() + " " + videos[i].getRating() + " "+ videos[i].isChecked() );
    }
}
