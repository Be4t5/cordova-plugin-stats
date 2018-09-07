/*global cordova, module*/

module.exports = {
    greet: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Stats", "initElephant", [name]);
        cordova.exec(successCallback, errorCallback, "Stats", "consentElephant", [name]);
        cordova.exec(successCallback, errorCallback, "Stats", "revokeElephant", [name]);
    }
};
