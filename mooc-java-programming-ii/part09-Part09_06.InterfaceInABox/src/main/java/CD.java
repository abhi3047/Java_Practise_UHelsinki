public class CD implements  Packable{
    private String artistName;
    private String cdName;
    private int publicationYear;
    private double cdWeight;

    public CD(String artistName,String cdName,int publicationYear){
        this.artistName=artistName;
        this.cdName=cdName;
        this.publicationYear=publicationYear;
        this.cdWeight=0.1;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getCdName() {
        return cdName;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    public double getCdWeight(){
        return this.cdWeight;
    }

    @Override
    public double weight() {
        return getCdWeight();
    }

    @Override
    public String toString(){
        String text=this.getArtistName()+": "+this.getCdName()+" ("+this.getPublicationYear()+")";
        return text;
    }
}
