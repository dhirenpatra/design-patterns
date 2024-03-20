package com.dhiren.patterns;

import java.util.*;
import java.util.stream.Collectors;

public class ListDemp {

    public static void main(String[] args) {

        String[][] queries = {
                {"CREATE_ACCOUNT", "1", "account1"},
                {"CREATE_ACCOUNT", "2", "account2"},
                {"CREATE_ACCOUNT", "3", "account3"},
                {"DEPOSIT", "4", "account1", "2000"},
                {"DEPOSIT", "5", "account2", "3000"},
                {"DEPOSIT", "6", "account3", "4000"},
                {"TOP_ACTIVITY", "7", "2"},
                {"PAY", "8", "account1", "1500"},
                {"PAY", "9", "account2", "250"},
                {"DEPOSIT", "10", "account3", "250"},
                {"TOP_ACTIVITY", "11", "3"},
                {"TOP_ACTIVITY", "11", "4"}};
        var result = new ListDemp().solution(queries);
        System.err.println(Arrays.deepToString(result));
    }

    String[] solution(String[][] queries) {
        String[] solutions = new String[queries.length];
        int count = 0;


        for(String[] query : queries) {
            if("CREATE_ACCOUNT".equals(query[0])) {
                solutions[count] = createAccount(query[2]);
                count++;
            } else if ("DEPOSIT".equals(query[0])) {
                solutions[count] = depositAmount(query[2], query[3]);
                count++;
            } else if ("TOP_ACTIVITY".equals(query[0])){
                solutions[count] = sortByRanking(Integer.valueOf(query[2]));
                count++;
            }
            else {
                solutions[count] = payAmount(query[2], query[3]);
                count++;
            }
        }


        return solutions;
    }

    Map<String, Integer> maps = new HashMap<>();
    Map<String, Integer> activityMaps = new TreeMap<>();

    String createAccount(String name) {
        if (maps.get(name) == null) {
            maps.put(name, 0);
            activityMaps.put(name, 0);
            return "true";
        } else
            return "false";
    }

    String depositAmount(String accountId, String amount) {
        if("non-existing".equals(accountId) || maps.get(accountId) == null) {
            return "";
        }
        else {
            Integer finalAmount = maps.get(accountId) + Integer.valueOf(amount);
            maps.put(accountId, maps.get(accountId) + Integer.valueOf(amount) );
            activityMaps.put(accountId, Integer.valueOf(finalAmount));
            return String.valueOf(finalAmount);
        }
    }

    void addToActivity(String accountId, int amount) {
        activityMaps.put(accountId, amount);
    }

    String payAmount(String accountId, String amount) {

        if("non-existing".equals(accountId) || maps.get(accountId) == null) {
            return "";
        } else {
            Integer restAmount = maps.get(accountId) - Integer.valueOf(amount);

            if(restAmount < 0) {
                return "";
            }
            else {
                maps.put(accountId, restAmount);
                int amountForActivity = activityMaps.get(accountId) + Integer.valueOf(amount);
                System.out.println(accountId + " for " +activityMaps.get(accountId) + " prev amount " +Integer.valueOf(amount)+ " to update " + amountForActivity);
                addToActivity(accountId, amountForActivity);
                System.out.println(activityMaps);
                return String.valueOf(restAmount);
            }

        }
    }

    String sortByRanking(int n) {

        System.err.println(n + " " + activityMaps.entrySet().size());
        if ( n > activityMaps.entrySet().size()) {
            return "";
        }

        LinkedHashMap<String, Integer> res = activityMaps.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(n)
                .collect(LinkedHashMap::new, (map,entry) -> map.put(entry.getKey(), entry.getValue()), Map::putAll);

        String finalOut = res.entrySet().stream()
                .map(map -> map.getKey() + "(" + map.getValue() + ")")
                .collect(Collectors.joining(", "));

        System.out.println(activityMaps + " " + res);
        return finalOut;
    }

}
