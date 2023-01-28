package us.challenge.client;

import constants.GlobalConstants;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class helps to handle rest requests.
 */
public final class RequestHandler {

    private static final RequestSpecification HTTP_REQUEST = RestAssured.given();
    private static final Logger LOGGER = LogManager.getLogger(RequestHandler.class.getSimpleName());

    /**
     * This constructor prevents instantiation.
     */
    private RequestHandler() {
    }

    /**
     * This method sets header values.
     *
     * @param key   of a header.
     * @param value of a header.
     */
    public static void setHeader(final String key, final String value) {
        LOGGER.info("ADD TO HEADER: " + key + ":" + value);
        HTTP_REQUEST.header(key, value);
    }

    /**
     * This method performs get request.
     *
     * @param endpoint url.
     * @return request response.
     */
    public static Response getRequest(final String endpoint) {
        LOGGER.info("GET: " + endpoint + " endpoint ");
        LOGGER.info("GET Authorization: " + GlobalConstants.get("accessToken"));
        return HTTP_REQUEST
                .header("Authorization", "Bearer " + GlobalConstants.get("accessToken"))
                .header("Content-Type", "application/json")
                .when().get(endpoint);
    }
}
