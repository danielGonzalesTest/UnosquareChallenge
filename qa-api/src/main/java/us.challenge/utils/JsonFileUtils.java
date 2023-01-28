package us.challenge.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;


/**
 * Json File utils class.
 */
public final class JsonFileUtils {

    private static final Logger LOGGER = LogManager.getLogger(JsonFileUtils.class.getName());


    /**
     * Constructor to prevent instantiation.
     */
    private JsonFileUtils() {
    }

    /**
     * Method to convert String value to JsonObject.
     * @param value string to convert.
     * @return Json Object converted.
     */
    public static JSONObject convertStringToJson(String value) {
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject = new JSONObject(value);

        } catch (JSONException err) {
            LOGGER.error("Error", err.toString());
        }
        return jsonObject;
    }
}
