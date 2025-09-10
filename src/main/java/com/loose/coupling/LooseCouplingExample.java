package com.loose.coupling;



public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider databaseProvider = new UserDatabaseProvider();
        UserManager userManagerWithDb = new UserManager(databaseProvider);
        System.out.println(userManagerWithDb.getUserInfo());

        WebServiceProvider webServiceProvider = new WebServiceProvider();
        UserManager webServiceManager = new UserManager(webServiceProvider);
        System.out.println(webServiceManager.getUserInfo());

        MongoDbProvider mongoDbProvider = new MongoDbProvider();
        UserManager mongoDbManager = new UserManager(mongoDbProvider);
        System.out.println(mongoDbManager.getUserInfo());
    }
}
