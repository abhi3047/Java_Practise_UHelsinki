public class LiteraryStat {
    private String country;
    private int year;
    private String gender;
    private double literaryPercentage;

    public LiteraryStat(String country, int year, String gender, double literaryPercentage){
        this.country=country;
        this.year=year;
        this.gender=gender;
        this.literaryPercentage=literaryPercentage;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public String getGender() {
        return gender;
    }

    public double getLiteraryPercentage() {
        return literaryPercentage;
    }

    @Override
    public String toString(){
        String text = this.getCountry()+" ("+this.getYear()+"), "+this.gender+", "+this.literaryPercentage;
        return text;
    }


    }

