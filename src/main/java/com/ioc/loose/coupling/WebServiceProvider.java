package com.ioc.loose.coupling;

public class WebServiceProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "Fetching Data from Web Service Provider";
    }

}
