package us.challenge.services;

import constants.GlobalConstants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseService {
    private static final Logger LOGGER = LogManager.getLogger(BaseService.class.getSimpleName());

    public int getResponseCode() {
        return Integer.parseInt(GlobalConstants.get("responseStatusCode"));
    }

    public void setUrl(String url) {
        GlobalConstants.set("urlEndpoint", url);
    }
}
