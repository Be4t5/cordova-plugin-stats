package com.stats;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import com.geouniq.android.GeoUniq;
import com.elephant.data.ElephantLib;


public class Stats extends CordovaPlugin {
	
	private GeoUniq geoUniq;
	
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

			geoUniq = GeoUniq.getInstance(this.cordova.getActivity());
			geoUniq.enable();

			
            callbackContext.success("ok");

            return true;

        } 
		else if (action.equals("consentGeoUniq")) {

			geoUniq = GeoUniq.getInstance(this.cordova.getActivity());
			geoUniq.setConsentStatus(true);

			
            callbackContext.success("ok");

            return true;

        } 
		else if (action.equals("revokeGeoUniq")) {

			geoUniq = GeoUniq.getInstance(this.cordova.getActivity());
			geoUniq.setConsentStatus(false);

			
            callbackContext.success("ok");

            return true;

        } 
/*		
		else if (action.equals("checkGeoUniq")) {

			geoUniq = GeoUniq.getInstance(this.cordova.getActivity());
			geoUniq.showConsentDialogAndSet(new GeoUniq.IConsentAlertResponseListener() {

				@Override
				public void onResponse(boolean accepted) {
					// Your logic here.
					// You might exploit this callback to keep trace of the last time the alert has been shown to the user in order to avoid showing it too often
					if(accepted)
						callbackContext.success("accepted");
					else
						callbackContext.success("not accepted");
				}
			});

            return true;

        } 
		*/
		else {
            
            return false;

        }
		
		
    }
}
