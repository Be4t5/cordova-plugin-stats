package com.stats;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

import com.cdnbye.sdk.*;


public class Stats extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("initCDN")) {

			String token = data.getString(0);
			String server = data.getString(1);

			P2pConfig config = new P2pConfig.Builder()
			.wsSignalerAddr(server)
			.wifiOnly(true)
			.build();

			P2pEngine.initEngine(this.cordova.getActivity(), token, config);
            callbackContext.success("ok");

            return true;

        } else if (action.equals("parseUrl")) {

			String url = data.getString(0);
            String channelId = data.getString(1);
            String server = data.getString(2);


            P2pConfig config = new P2pConfig.Builder()
              .wsSignalerAddr(server)
              .wifiOnly(true)
              .channelId(new ChannelIdCallback() {
                @Override
                public String onChannelId(String urlString) {
                  return channelId;
                }
              })
              .build();

            P2pEngine.getInstance().setConfig(config);

            callbackContext.success(P2pEngine.getInstance().parseStreamUrl(url));

            return true;

        }

		else {

            return false;

        }


    }
}
