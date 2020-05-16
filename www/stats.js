/*global cordova, module*/

module.exports = {
    initCDN: function (token, server, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Stats", "initCDN", [token, server]);
    },
	parseUrl: function (url, channelId, server, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Stats", "parseUrl", [url, channelId, server]);
    }
};
