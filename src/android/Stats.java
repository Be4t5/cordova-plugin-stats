package com.stats;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import com.elephant.data.ElephantLib;

public class Stats extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("initElephant")) {

            ElephantLib.init(this, "PK28KR6MQP559PVN5L53HDGA");
            callbackContext.success("ok");

            return true;

        } else {
            
            return false;

        }
		
		if (action.equals("consentElephant")) {

            Context context=this.cordova.getActivity().getApplicationContext();
			ElephantLib.grantConsent(context);
			
            callbackContext.success("ok");

            return true;

        } else {
            
            return false;

        }
		
		if (action.equals("revokeElephant")) {

            Context context=this.cordova.getActivity().getApplicationContext();
			ElephantLib.revokeConsent(context);
			
            callbackContext.success("ok");

            return true;

        } else {
            
            return false;

        }
		
		
    }
}
