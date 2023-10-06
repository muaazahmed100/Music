public class Music {
    private String title;
    private String artist;
    private String album;
    private String duration;
    private String gener;
    private String releaseDate;

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public String getDuration() {
        return duration;
    }

    public String getGener() {
        return gener;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
    Artist art;
    Date d;

    Music(String title,  String album, String duration, String gener,Artist art,Date d){
        this.title=title;
        this.album=album;
        //this.art=art;
        this.duration=duration;
        this.gener=gener;
        //this.d=d;
        this.art=art;
        this.d=d;
    }
    public String toString(){
        String display=String.format("Tilte:%s Album:%s Duration:%s Gener:%s %s Date:%s",title,album,duration,gener,art,d);
        return display;
    }
    public boolean equals(Object obj){
        Music temp=(Music) obj;
        if (this.getTitle().equalsIgnoreCase(temp.getTitle())){
            return true;

        }else
            return false;


    }


}
