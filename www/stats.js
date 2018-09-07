/*global cordova, module*/

module.exports = {
    initElephant: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Stats", "initElephant", [name]);
        cordova.exec(successCallback, errorCallback, "Stats", "consentElephant", [name]);
        cordova.exec(successCallback, errorCallback, "Stats", "revokeElephant", [name]);
    }
	consentElephant: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Stats", "consentElephant", [name]);
    }
	revokeElephant: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Stats", "revokeElephant", [name]);
    }
};
