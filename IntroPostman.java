```java
	@PostMapping("/itemId")
	public Item showItem(@RequestBody Item item) {
		if (item.id.equals("TT11111")) {
			var item1 = new Item();
			item1.id = item.id.toUpperCase();
			item1.name = "Banana";
			item1.description = "Ripe bananas from Ecuador";
			return item1;
		}
		return null;
	}
```
```java
package com.datorium.Datorium.API;

public class Item {
    public String name;
    public String description;
    public String id;
}
```




