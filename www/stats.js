/*global cordova, module*/

module.exports = {
    initElephant: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Stats", "initElephant", [name]);
    },
	consentElephant: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Stats", "consentElephant", [name]);
    },
	revokeElephant: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Stats", "revokeElephant", [name]);
    },
	initGeoUniq: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Stats", "initGeoUniq", [name]);
    }
};
