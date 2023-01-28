package us.challenge.services;

import constants.GlobalConstants;
import io.restassured.response.Response;
import us.challenge.client.RequestManager;
import us.challenge.objects.User;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class UsersService extends BaseService {

    public void sendGetRequest() {
        Response response = RequestManager.getInstance().sendGet(GlobalConstants.get("urlEndpoint"));

        GlobalConstants.set("responseStatusCode", String.valueOf(response.statusCode()));
        GlobalConstants.set("responseBody", response.getBody().asString());
    }

    public User getFirstUser(String endpoint) {
        Response response = RequestManager.getInstance().sendGet(endpoint);
        ArrayList<LinkedHashMap<String, Object>> allUsers = response.getBody().jsonPath().get("data");
        LinkedHashMap<String, Object> firstUser = allUsers.get(0);

        return new User((int)firstUser.get("id"), (String)firstUser.get("employee_name"),
                (int)firstUser.get("employee_salary"), (int)firstUser.get("employee_age"),
                (String)firstUser.get("profile_image"));
    }
}
