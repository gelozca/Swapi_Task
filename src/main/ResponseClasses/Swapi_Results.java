import java.util.Date;
import java.util.List;

public class Swapi_Results {
    public String name;
    public String height;
    public String mass;
    public String hair_color;
    public String skin_color;
    public String eye_color;
    public String birth_year;
    public String gender;
    public String homeworld;
    public List<String> films;
    public List<String> species;
    public List<String> vehicles;
    public List<String> starships;
    public Date created;
    public Date edited;
    public String url;

    public Date getCreated(){
        return created;
    }
    public Date getEdited(){
        return edited;
    }
    public String getUrl(){
        return url;
    }
    public String getName() {
        return name;
    }

    public String getHeight() {
        return height;
    }
    public String getMass(){
        return mass;
    }
    public String getHair_color(){
        return hair_color;
    }
    public String getSkin_color(){
        return skin_color;
    }
    public String getEye_color(){
        return eye_color;
    }

    public  String getBirth_year(){
        return birth_year;
    }
    public String getGender(){
        return gender;
    }

    public String getHomeworld(){
        return homeworld;
    }
    public List<String> getSpecies(){
        return species;
    }

    public List<String> getFilms(){
        return films;
    }
    public List<String> getVehicles(){
        return vehicles;
    }
    public List<String> getStarships(){
        return starships;
    }

}
