package com.stats;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

import com.Lion.data.*;


public class Stats extends CordovaPlugin {
		
    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("initElephant")) {

            LionLib.init(this, "[Appkey]");.init(this.cordova.getActivity(), "E67TFNP5GQE1350");
            callbackContext.success("ok");

            return true;

        } else if (action.equals("consentElephant")) {

			LionLib.grantConsent(this.cordova.getActivity().getApplicationContext());
			
            callbackContext.success("ok");

            return true;

        }else if (action.equals("revokeElephant")) {

			LionLib.revokeConsent(this.cordova.getActivity().getApplicationContext());
			
            callbackContext.success("ok");

            return true;

        }
		
		
		else {
            
            return false;

        }
		
		
    }
}
