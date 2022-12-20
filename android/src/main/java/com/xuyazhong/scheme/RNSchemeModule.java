
package com.xuyazhong.scheme;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import android.content.ComponentName;
import android.content.pm.PackageManager;
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
  public void open(Callback callback) {
    Uri uri = Uri.parse("seeyon://com.seeyon.cmp/path?param1=abc&param2=cde");
    Intent intent = new Intent();
    intent.setData(uri);
    PackageManager packageManager = getCurrentActivity().getPackageManager();
    ComponentName componentName = intent.resolveActivity(packageManager);
    if (componentName!=null){
      Activity currentActivity = getCurrentActivity();
      currentActivity.startActivity(intent);
    }
  }

}