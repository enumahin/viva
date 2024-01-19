package com.alienworkspace.ems.ch04;

import com.alienworkspace.ems.ch04.model.CachedItem;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveIfTest {

    public static void main(String[] args) {

        List<CachedItem> cachedItems = getCachedItems();
        
        // Using for loop - don't do this !
        // usingForLoop(cachedItems);
        
        // Using Iterator
//         usingIterator(cachedItems);
        
        // Java 8 onwards
         usingLambdas(cachedItems);
    }
    private static void usingForLoop(List<CachedItem> cachedItems) {
        for (CachedItem stock : cachedItems){
            if(isStale(stock)) {
                cachedItems.remove(stock);
            }
        }
        System.out.println(cachedItems);
    }

    private static void usingIterator(List<CachedItem> cachedItems) {
        Iterator<CachedItem> it = cachedItems.iterator();
        while (it.hasNext()) {
            CachedItem  item = it.next();
            if (isStale(item)){
                it.remove();
            }
        }
        System.out.println(cachedItems);
    }

    private static void usingLambdas(List<CachedItem> cachedItems) {
        cachedItems.removeIf(RemoveIfTest::isStale);
        System.out.println(cachedItems);
    }

    private static boolean isStale(CachedItem cachedItem) {
        return cachedItem.getDuration().compareTo(Duration.ofSeconds(60)) > 0;
    }

    private static List<CachedItem> getCachedItems() {

        List<CachedItem> items = new ArrayList<>();

        items.add(new CachedItem("AAPL", Duration.ofSeconds(30)));
        items.add(new CachedItem("AMZN", Duration.ofSeconds(40)));
        items.add(new CachedItem("MSFL", Duration.ofSeconds(50)));
        items.add(new CachedItem("GOOGL", Duration.ofSeconds(60)));
        items.add(new CachedItem("NFLX", Duration.ofSeconds(90)));

        return items;
    }
}
