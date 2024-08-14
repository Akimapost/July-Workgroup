//Create UserController endpoint to get all users
// 1. Create a UserService method to get all users
// 2. Create a UserRepository method to get all users
// 3. Add user with a postman
// 4. Try to get all the users with GET method
// 5. Repeat step 4 and 5

UserController.java
```java
     //Create UserController endpoint to get all users;
    @GetMapping("/usersList")
    public List<User> getUsersList(){
        return userService.getUsersList();
    }
```

UserService.java
```java
    //Create a UserService method to get a list of all users
    public List<User> getUsersList() {
        return userRepo.getUsersList();
    }
```

UserRepo.java
```java
      // Create a UserRepository method to get all users
    public List<User> getUsersList() {
        return users;
    }
```




