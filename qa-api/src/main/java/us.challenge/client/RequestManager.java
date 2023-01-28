package us.challenge.client;

import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import us.challenge.utils.PropertyAccessorApi;

/**
 * This class manages rest requests.
 */
public final class RequestManager {
    private static final Logger LOGGER = LogManager.getLogger(RequestManager.class.getSimpleName());
    private static RequestManager requestManager = null;
    private String uriApi = PropertyAccessorApi.getInstance().getBaseApi();

    /**
     * This is a singleton method that retrieves RequestManager instance.
     *
     * @return RequestManager instance.
     */
    public static RequestManager getInstance() {
        if (requestManager == null) {
            requestManager = new RequestManager();
        }
        return requestManager;
    }

    /**
     * This method performs get request.
     *
     * @param endpoint url.
     * @return request response.
     */
    public Response sendGet(final String endpoint) {
        RequestHandler.setHeader("Content-Type", "application/json");
        Response response = RequestHandler.getRequest(uriApi.concat(endpoint));
        if (response.statusCode() != 200) {
            LOGGER.error("Failed to GET request: " + endpoint + " Status Code " + response.statusCode()
                    + " Body " + response.getBody().asString());
        }
        return response;
    }
}
