var HashMap = Java.type("java.util.HashMap");
var hm = new HashMap();
hm.put("India", "New Delhi");
hm.put("Japan", "Tokyo");
hm.put("Germany", "Berlin");
hm.put("Russia", "Moscow");
hm.put("USA", "Washington DC");

for each (var i in hm.keySet()) print(i+ " : " + hm[i]);