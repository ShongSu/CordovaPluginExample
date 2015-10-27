package com.shongsu.plugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.PluginResult;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class performs sum called from JavaScript.
 */
public class ExamplePlugin extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("func_add")) {
            Integer num1 = args.getInt(0);
            Integer num2 = args.getInt(1);
            this.func_add(num1, num2, callbackContext);
            return true;
        } else if (action.equals("func_sub")) {
            Integer num1 = args.getInt(0);
            Integer num2 = args.getInt(1);
            this.func_sub(num1, num2, callbackContext);
            return true;
        } else if (action.equals("func_factorial")) {
            Integer num1 = args.getInt(0);
            this.func_factorial(num1, callbackContext);
            return true;
        }

        return false;
    }

    private void func_add(Integer num1, Integer num2, CallbackContext callbackContext) {
        if(num1 != null && num2 != null) {
            callbackContext.success(num1 + num2);
        } else {
            callbackContext.error("Expected two integer arguments.");
        }
    }

    private void func_sub(Integer num1, Integer num2, CallbackContext callbackContext) {
        if(num1 != null && num2 != null) {
            int s = num1 - num2;
            callbackContext.success(s);
        } else {
            callbackContext.error("Expected two integer arguments.");
        }
    }

    private void func_factorial(Integer num1, CallbackContext callbackContext) {
        if(num1 != null && num1 >= 0) {
            int result = 1;
            if (num1 == 0 || num1 ==1) {
              result = 1;
            } else {
              for(int i=1;i<=num1;i++)
              {
                result *= i;
              }
            }

            callbackContext.success(result);
        } else {
            callbackContext.error("Expected a non-negative integer argument.");
        }
    }

}
