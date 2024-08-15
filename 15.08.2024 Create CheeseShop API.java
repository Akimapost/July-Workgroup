//Cheese shop:
//1. CheeseShopController
//2. CheeseShopService
//3. CheeseShopRepository
//Add / Update / Get

Cheese.java
```java
  package com.datorium.Datorium.API.DTOs;

public class Cheese {
    public String name;
}
```

UpdateCheeseDTO.java
```java
  package com.datorium.Datorium.API.DTOs;

public class UpdateCheeseDTO {
    public Cheese cheese;
    public int cheeseIndex;
}
```

CheeseShopController.java
  ```java
  package com.datorium.Datorium.API.Controllers;
import com.datorium.Datorium.API.DTOs.Cheese;
import com.datorium.Datorium.API.DTOs.UpdateCheeseDTO;
import com.datorium.Datorium.API.Services.CheeseShopService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/cheese")

public class CheeseShopController {
    private CheeseShopService cheeseShopService;
    public CheeseShopController(){
        cheeseShopService = new CheeseShopService();
    }
    //Add Cheeses
    @PostMapping("/add") //localhost:8080/cheese/add
    public int addCheese(@RequestBody Cheese cheese){
        return cheeseShopService.addCheese(cheese);
    }

    // Get Cheeses
    @GetMapping("/get") //localhost:8080/cheese/get
    public ArrayList<Cheese> getCheese(){
        return cheeseShopService.getCheese();
    }

    //Update Cheese
    @PostMapping("/update") //localhost:8080/cheese/update
    public Cheese updateCheese(@RequestBody UpdateCheeseDTO updateCheeseDTO){
        return cheeseShopService.updateCheese(updateCheeseDTO.cheeseIndex, updateCheeseDTO.cheese);
    }
}
```

CheeseShopRepository.java
```java
  package com.datorium.Datorium.API.Repo;
import com.datorium.Datorium.API.DTOs.Cheese;

import java.util.ArrayList;

public class CheeseShopRepository {
    private ArrayList<Cheese> cheeses = new ArrayList<Cheese>(); //Mocked DataBase

    // a method to add a cheese
    public int addCheese(Cheese cheese){
        cheeses.add(cheese);
        return cheeses.size();
    }
    // a method to get all the cheese
    public ArrayList<Cheese> getCheese(){
        return cheeses;
    }
    // a method to update a cheese
    public Cheese updateCheese(int cheeseIndex, Cheese updateCheeseDTO){
        var cheese = cheeses.get(cheeseIndex);
        cheese.name = updateCheeseDTO.name;
        return cheese;
    }
}
```

CheeseShopService.java
```java
  package com.datorium.Datorium.API.Services;
import com.datorium.Datorium.API.DTOs.Cheese;
import com.datorium.Datorium.API.Repo.CheeseShopRepository;
import java.util.ArrayList;

public class CheeseShopService {
    private CheeseShopRepository cheeseShopRepository;

    public CheeseShopService(){
        cheeseShopRepository = new CheeseShopRepository();
    }
    // to add a cheese
    public int addCheese(Cheese cheese) {
        return cheeseShopRepository.addCheese(cheese);
    }

    // to get all cheeses
    public ArrayList<Cheese> getCheese() {
        return cheeseShopRepository.getCheese();
    }

    // to update a cheese
    public Cheese updateCheese(int cheeseIndex, Cheese updateCheeseDTO) {
        return cheeseShopRepository.updateCheese(cheeseIndex, updateCheeseDTO);
    }
}
```


