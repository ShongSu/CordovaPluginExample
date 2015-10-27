window.func_add = function(num1, num2, successCallback, errorCallback) {
	cordova.exec(successCallback, errorCallback, "ExamplePlugin", "func_add", [num1, num2]);
};

window.func_sub = function(num1, num2, successCallback, errorCallback) {
	cordova.exec(successCallback, errorCallback, "ExamplePlugin", "func_sub", [num1, num2]);
};

window.func_factorial = function(num1, successCallback, errorCallback) {
	cordova.exec(successCallback, errorCallback, "ExamplePlugin", "func_factorial", [num1]);
};
