import java.util.List;

import static io.restassured.RestAssured.*;

public class Swapi {
    static final String BASE_URL = "https://swapi.dev/api/people";

    private Swapi_Root getSwapiResults() {
        return when()
                .get(BASE_URL)
                .then()
                .extract().body().as(Swapi_Root.class);
    }

    private List<Swapi_Results> getResultsList() {
        Swapi_Root swapiResponse = getSwapiResults();
        return swapiResponse.results;
    }

    public boolean hasNumberOfPeopleHeight(int nbrPeople, int height) {
        List<Swapi_Results> resultsList = getResultsList();

        long countPeople = resultsList.stream()
                .filter(item -> Integer.parseInt(item.height) > height).count();

        if (countPeople != nbrPeople) {
            return false;
        }
        return true;
    }

    public boolean hasIndividualsNames(String[] names) {
        List<Swapi_Results> resultsList = getResultsList();

        for (String name : names) {
            if (resultsList.stream().noneMatch(item -> item.name.equals(name))) {
                return false;
            }
        }

        return true;
    }

    public boolean hasNumberOfPeopleChecked(int nbrPeople) {
        if (getSwapiResults().count != nbrPeople) {
            return false;
        }
        return true;
    }

    public boolean hasResponseCode(long code) {
        long statusCode = given()
                .when()
                .get(BASE_URL).getStatusCode();

        if (statusCode != code) {
            return false;
        }
        return true;
    }

}
