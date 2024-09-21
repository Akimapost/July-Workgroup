# July-Workgroup
### Team 28 😎
**Team members:**
- Tetiana (My name's Tetiana, I'm from Ukraine but live in Riga, and programming is a new field for me. Let's explore together!:-)
- Sanita 
- Ieva
- Kristine
---------------------------------------------------------------------
Workgroup for Java and Python projects on WoTech program in 2024
---------------------------------------------------------------------
### 13.07.2024. Teamwork: 
  (Start with Task 1 and proceed further as complexity will increase):To complete the tasks use 'transaction_dataset.csv'
  
  **Task 1:** Create a bar chart that shows the count of transactions for each unique value in the 'Gender' column (including NaN values). - *easy*
  
  **Task 2:** Create a horizontal bar chart that shows the top 5 most frequent names in the DataFrame, based on the 'name' column. (First, create a grouped DataFrame (name_df), then filter it using iloc, and finally create the visualization.) -*medium*
  
  **Task 3:** Create a filtered DataFrame that includes Category == 'Clothing' and Gender == 'M'. How many rows are there in this filtered DataFrame? Format the result as follows: The filtered DataFrame has XXXX rows. - *hard*
  
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### 03.08.2024. Teamwork ('Pokémon exploratory data analysis' in Python): 
  *( To complete the tasks use 'pokemon.csv' dataset )*

**Answer the following questions:** 
1. How many Pokémons are with 'Type 1' == Water as a % of total?
2. What is the maximum 'Speed' value? What is the minimum 'Speed' value? What is the difference between max and min 'Speed'?
3. Filter the DataFrame to include only the Pokémon with 'Speed' >= 80. How many Pokémon meet this criterion? Display this DataFrame using your preferred visualization method.
   
4. (DIFFICULT) Find Pokémon with the longest name (excluding spaces)? What is this pokemons name?

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

### 07.08.2024. Teamwork ('Architecture and structure' in Java):
Discuss and find information about clean architecture

*1. What's the importance of each layer*

*2. Why is there needed some kind of structure and architecture*

*3. Find other architecture types, figure out pros and cons*

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### 08.08.2024. Teamwork ('Create controller/service/dto' in Java):

1. Create MessageController.java
   
2. Create MessageService.java
   
3. Create Message.java
   
4. In message controller, create an endpoint, which uses both MessageService and Message.java
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### 10.08.2024 Teamwork ('Correlation, dataframe filtering'in Python)
Task: Visualizing the correlation of Attack and Defense variables of two Types: Grass and Water Type 1 Pokémon.

*1. Create two DataFrame Grass and Water*

*2. Create the regression plots for each (Grass and Water)*

*3. Calculate the Pearson correlation for each DataFrame (variables: Attack and Defense)*

*4. Explain to each other what do you see and what it means.*
   
Watch this video in your free time: [https://www.youtube.com/watch?v=7ArmBVF2dCs&pp=ygUjd2hhdCBpcyBsaW5lYXIgcmVncmVzc2lvbiBzdGF0cXVlc3Q%3D]

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### 14.08.2024 Teamwork ('Create a GET method for users' in java)

1. Create UserController endpoint to get all users
2. Create a UserService method to get all users
3. Create a UserRepository method to get all users
4. Add user with a postman
5. Try to get all the users with GET method
6. Repeat step 4 and 5

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### 15.08.2024 Teamwork ( 'Create CheeseShop API'in java)
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### 17.08.2024 Teamwork ('Scikit-learn'in Python)

**Task: Look at scikit-learn library together. Suggested questions to discuss:**

*1. What is an error rate?*

*2. Where you could use other machine-learning models?*

*3. What is the difference between supervised and unsupervised training?*

*4. How to import different models from the scikit-learn package?*

*5. How can you evaluate the performance of a machine learning model in scikit-learn?*

*6. What metrics are commonly used for evaluation?*

*7. What is model overfitting, and how can it be prevented?*

Linear regression models: [https://scikit-learn.org/stable/modules/linear_model.html]
The overall documentation: [https://scikit-learn.org/stable]

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### 21.08.2024 Teamwork ('Explore different filters and their combinations with SQL'in Java)
1. Use our Pet clinics files
2. Use online free SQLight platform https://sqliteonline.com/

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### 22.08.2024 Teamwork ('SQL'in Java)
**Perform the following tasks:**
1. Calculate total Sales by City
2. Calculate total Sales by Pet Kind
3. Calculate total Sales by City and Pet Kind
4. Calculate Average sales by City
5. If you have additional time, explore relationships with SQLight

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### 24.08.2024 Teamwork ('Cross-validation on titanic dataset'in Python)
*EASY:* 
Add DecisionTreeClassifier to titanic data predictions. 

*HARD:* 
Investigate what is cross-validation and implement cross-validation on any classification model you prefer on Titanic data. Explain to each other, what do you see. 

*Example:*
```
k_fold = KFold(n_splits=10, shuffle=True, random_state=42)
accuracy_scores = cross_val_score(model_knn_cv, X, y, cv=k_fold, scoring='accuracy')
```
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### 28.08.2024 Teamwork ('Databases'in Java)

1. Download dbBrowser for sqlite: [https://sqlitebrowser.org/dl/]

2. Try to open the database that you created in your project (you can see the my.db in files on the left side)

3. Read about SQL, learn insert, delete, update, select on this page: [https://sqliteonline.com/]

*A lot of resources is here:*
[https://www.w3schools.com/sql/default.asp]

4. Create 3 tables with some non-complex data, populate them with values, you will be able to use this database later on, but this is just for you to practise and understand db a bit better.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### 29.08.2024 Teamwork ('SQL in repository'in Java)

1. Use the example of SQL in Java and add an "AddUser" method inside the previous Datorium API project - User repository.
2. Try and run postman and verify with db browser that the data is there
3. COPY the code from today's lesson. Open the project with Controllers/Services/Repositories (we used it 2 weeks ago).
4. Open UserRepository
5. Inside add(User user) method, paste the code.

*Should look something similar to this:*
```java    public void add(User user){
        String url = "jdbc:sqlite:my.db";
        try (var conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                var statement = conn.createStatement();
                statement.execute("INSERT INTO people (name) VALUES ('" + user.name + "')");
                //INSERT INTO people (name) VALUES ('');DROP TABLE people;--')
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
```

*NOTE: previously we returned int in this method, change it to void. (You will have to make changes inside userController and userService as well*

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### 07.09.2024 Teamwork ('Numpy mathematical simulations'in Python)

1. Design a simulation where you toss two coins simultaneously. 
2. Record the possible outcomes (heads or tails for each coin) and run the simulation for multiple trials (e.g., 100, 500, or 1000 tosses). 
3. After collecting the data:

- Calculate the probabilities of each outcome (HH, HT, TH, TT).
- Visualize the results using a bar chart or pie chart to represent the frequencies and probabilities of each outcome.
- Analyze whether the results align with the expected theoretical probabilities.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### 11.09.2024 Teamwork ('Test that the Update is working correctly'in Java)
Task: Test the /user/update endpoint. All the code and what is needed in postman is sent in Java channel

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### 14.09.2024 Teamwork ('Git commands'in Python)
Task: Explore how Git works:
- Install VS Code
- Create a repository in GitHub
- Clone the repository from GitHub to VS Code
- Try to push changes to GitHub

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### 18.09.2024 Teamwork ('Unit testing weird sum method'in Java)
Task: Hi, I want to be able to get a sum of 2 numbers, but if the sum is above 100, then I want to receive 0 instead.

1. Create MathService

2. Create a method sum()

3. Create a unit test for this method.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### 19.09.2024 Teamwork ('Bigger than, smaller than, equal'in Java)
Task:
1. Create a game where you have to guess a number.
2. If the number is too big, then we return 3
3. If the number is too small, we return 2
4. If the number is exactly the same, we return 1.

*EDIT: If you are advanced enough, just use enums*

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
