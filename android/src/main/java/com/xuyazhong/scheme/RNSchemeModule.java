
package com.xuyazhong.scheme;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import android.content.Intent;
import android.app.Activity;
import android.net.Uri;

public class RNSchemeModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNSchemeModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNScheme";
  }

  @ReactMethod
  public void open(String scheme) {
    Uri uri = Uri.parse(scheme);
    Intent intent = new Intent();
    intent.setData(uri);
    getCurrentActivity().startActivity(intent);
  }

}