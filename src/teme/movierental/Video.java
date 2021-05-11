package teme.movierental;

public class Video {
    private String title;
    private boolean checked;
    private double rating;
    public Video() {

    }
    public Video(String titie) {
        this.title = titie;
    }

    public void Check() {
        checked = true;
    }
    public String getTitle(){
        return title;
    }

    public boolean isChecked() {
        return checked;
    }

    public double getRating() {
        return rating;
    }

    public void returned() {
        checked = false;
    }
    public void setrating(int value) {
        rating += value;
    }


}
