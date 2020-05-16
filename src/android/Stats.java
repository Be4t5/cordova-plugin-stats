package com.stats;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

import com.cdnbye.sdk.P2pEngine;


public class Stats extends CordovaPlugin {
		
    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("initCDN")) {

			String token = data.getString(0);
			String server = data.getString(0);
			
			P2pConfig config = new P2pConfig.Builder()
			.wsSignalerAddr(server)        
			.wifiOnly(true)                                  
			.build();  

			P2pEngine.initEngine(this.cordova.getActivity(), token, config);
            callbackContext.success("ok");

            return true;

        } else if (action.equals("parseUrl")) {

			String url = data.getString(0);
			
            callbackContext.success(P2pEngine.getInstance().parseStreamUrl(url));

            return true;

        }

		else {
            
            return false;

        }
		
		
    }
}
