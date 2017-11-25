package yejin.shortenURL.test.utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Pattern;

import yejin.shortenURL.test.commons.UrlAvailableException;

/**
 * Created by ByeongChan on 2017. 11. 23..
 */
public class Validator {

    static final String hostName = "localhost";
	static String regex ="^(https?:\\/\\/)?"
			+"((([a-z\\d](([a-z\\d-]*[a-z\\d])|([¤¡-ÆR]))*)\\.)+[a-z]{2,}|"
			+"((\\d{1,3}\\.){3}\\d{1,3}))"
			+"(\\:\\d+)?(\\/[-a-z\\d%_.~+]*)*"
			+"(\\?[;&a-z\\d%_.~+=-]*)?"
			+"(\\#[-a-z\\d_]*)?$";


    public static String validate(String originUrl) {
        URL tempUrl;

        try {

            tempUrl = new URL(originUrl);

            if (!tempUrl.getProtocol().equals("http") && !tempUrl.getProtocol().equals("https")) {

        		throw new UrlAvailableException("This URL is not vailable.");
            }

        } catch (MalformedURLException e) {

            try {
                tempUrl = new URL("http://" + originUrl);
            } catch (MalformedURLException e2) {
        		throw new UrlAvailableException("This URL is not vailable.");
            }
        }

        validate2(tempUrl);

        return tempUrl.toString();
    }

    private static void validate2(URL originUrl) {
    	
    	if(!Pattern.matches(regex, originUrl.toString())){
    		throw new UrlAvailableException("This URL is not vailable.");
    	}
    	
    	if (originUrl.getHost().equals(hostName)) {
    		throw new UrlAvailableException("This URL is not vailable.");
        }
    }
}
