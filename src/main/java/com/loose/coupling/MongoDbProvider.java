package com.loose.coupling;

public class MongoDbProvider implements UserDataProvider{
    @Override
    public String getUserDetails() {
        return "User Details from Mongo DB Provider";
    }
}
