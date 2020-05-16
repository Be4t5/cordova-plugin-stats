/*global cordova, module*/

module.exports = {
    initCDN: function (token, server, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Stats", "initCDN", [token, server]);
    },
	parseUrl: function (url, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Stats", "parseUrl", [url]);
    }
};
