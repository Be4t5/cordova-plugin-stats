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
    },
	consentGeoUniq: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Stats", "consentGeoUniq", [name]);
    },
	revokeGeoUniq: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Stats", "revokeGeoUniq", [name]);
    },
	checkGeoUniq: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Stats", "checkGeoUniq", [name]);
    }
};
