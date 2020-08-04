/*Write a JavaScript code which creates a Java HashMap object, store 5 country and capital names as key and value.
Iterate them with for loop and display the elements one by one.
*/

var HashMap = Java.type("java.util.HashMap");
var hm = new HashMap();
hm.put("India", "New Delhi");
hm.put("Japan", "Tokyo");
hm.put("Germany", "Berlin");
hm.put("Russia", "Moscow");
hm.put("USA", "Washington DC");

for each (var i in hm.keySet()) print(i+ " : " + hm[i]);