package com.ssstrangersoccer;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.pusherman.networkinfo.RNNetworkInfoPackage;
import com.airbnb.android.react.maps.MapsPackage;
import co.apptailor.googlesignin.RNGoogleSigninPackage;
import com.evollu.react.fcm.FIRMessagingPackage;
import com.learnium.RNDeviceInfo.RNDeviceInfo;
import co.apptailor.googlesignin.RNGoogleSigninPackage;
import com.devfd.RNGeocoder.RNGeocoderPackage;
import com.evollu.react.fcm.FIRMessagingPackage;
import com.ninty.system.setting.SystemSettingPackage;
import org.devio.rn.splashscreen.SplashScreenReactPackage;
import com.pusherman.networkinfo.RNNetworkInfoPackage;
import com.learnium.RNDeviceInfo.RNDeviceInfo;
import com.gettipsi.stripe.StripeReactPackage;
import cl.json.RNSharePackage;
import com.oblador.vectoricons.VectorIconsPackage;
import com.airbnb.android.react.maps.MapsPackage;
import com.imagepicker.ImagePickerPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;
import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;
import com.facebook.reactnative.androidsdk.FBSDKPackage;
import com.facebook.appevents.AppEventsLogger;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private static CallbackManager mCallbackManager = CallbackManager.Factory.create();
 
  protected static CallbackManager getCallbackManager() {
    return mCallbackManager;
  }

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            new RNNetworkInfoPackage(),
            new MapsPackage(),
            new RNGoogleSigninPackage(),
            new FIRMessagingPackage(),
            new RNDeviceInfo(),
            new RNGoogleSigninPackage(),
            new RNGeocoderPackage(),
            new SystemSettingPackage(),
            new SplashScreenReactPackage(),
            new RNNetworkInfoPackage(),
            new RNDeviceInfo(),
            new StripeReactPackage(),
            new ImagePickerPackage(),
            new RNSharePackage(),
            new FBSDKPackage(mCallbackManager),
            new VectorIconsPackage(),
            new MapsPackage(),
            new FIRMessagingPackage()
      );
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    FacebookSdk.sdkInitialize(getApplicationContext());
    // If you want to use AppEventsLogger to log events. 
    AppEventsLogger.activateApp(this);
    SoLoader.init(this, /* native exopackage */ false);
  }
}
