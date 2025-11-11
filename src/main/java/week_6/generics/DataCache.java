package week_6.generics;

import java.util.HashMap;

public class DataCache<K, V> {



    private HashMap<K, V> cache = new HashMap<>();

    public void cacheData(K key, V value) {
        cache.put(key, value);
    }

    public V retrieveData(K key) {
        return cache.get(key);
    }

    public boolean isCached(K key) {
        return cache.containsKey(key);
    }

    public void clearCache() {
        cache.clear();
    }

    public static void main (String[] args) {
        DataCache<Integer, UserProfile> userCache = new DataCache<>();
        UserProfile Dora = new UserProfile("Dora","dora1234@gmail.com");
        UserProfile Os = new UserProfile("Os","os1234@gmail.com");
        userCache.cacheData(1, Dora);
        userCache.cacheData(2, Os);

        UserProfile user1 =userCache.retrieveData(1);
        UserProfile user2 = userCache.retrieveData(2);

        System.out.println("the user information :  \n - " + user1.name + "\n - " + user1.email + "\n");
        System.out.println("the user information :  \n - " + user2.name + "\n - " + user2.email + "\n");


    }



}
