public class Artist {
    private String name;
    private String nationality;
    private float rating;

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public float getRating() {
        return rating;
    }
    Artist(String name,String nationality,float rating){
        this.name=name;
        this.nationality=nationality;
        this.rating=rating;
    }

    @Override
    public String toString() {
        String display = String.format("Name:%s Nationality:%s Rating:%.2f",name,nationality,rating);
        return display;
    }
}
