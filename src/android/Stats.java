package com.stats;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import com.elephant.data.ElephantLib;
import com.geouniq.android:sdk-library:2.1.2;

public class Stats extends CordovaPlugin {
	
	private GeoUniq geoUniq;
	public static geouniq_mobile_key = "SGtBeWlwYXNTSEJxTTg5Uk50OGVEWGRJUU9IRk16WU46OUJSaHZoem45V1hzQ05BNHZISnhCcnRsVlV6aFV0bUY=";
	
    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("initElephant")) {

            ElephantLib.init(this.cordova.getActivity(), "PK28KR6MQP559PVN5L53HDGA");
            callbackContext.success("ok");

            return true;

        } else if (action.equals("consentElephant")) {

			ElephantLib.grantConsent(this.cordova.getActivity().getApplicationContext());
			
            callbackContext.success("ok");

            return true;

        }else if (action.equals("revokeElephant")) {

			ElephantLib.revokeConsent(this.cordova.getActivity().getApplicationContext());
			
            callbackContext.success("ok");

            return true;

        }
		else if (action.equals("initGeoUniq")) {

			this.geoUniq = GeoUniq.getInstance(this);
			this.geoUniq.enable();

			
            callbackContext.success("ok");

            return true;

        } 
		else {
            
            return false;

        }
		
		
    }
}
