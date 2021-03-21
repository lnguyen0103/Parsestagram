package com.example.parsestagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("OgDBZ6oM3pmLCcwnTIfobuk44g7gNPPDIdkswpgs")
                .clientKey("g7J1Ut5OCOPXFV2ujc33JusBexuJL3LY5nkOo3ZI")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}
