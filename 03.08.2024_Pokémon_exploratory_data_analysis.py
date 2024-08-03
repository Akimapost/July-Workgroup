```py
# 1. How many Pokémons are with 'Type 1' == Water as a % of total?

water_pokemons = pokemon_df[pokemon_df['Type 1'] == 'Water'].shape[0] 
total_pokemons = pokemon_df.shape[0]
percentage_water_pokemons = (water_pokemons / total_pokemons) * 100 
print(f"Water-type Pokémons are {percentage_water_pokemons:.2f} % of total number of Pokemons.")

# What is the maximum 'Speed' value? What is the minimum 'Speed' value? What is the difference between max and min 'Speed'?

max_speed = pokemon_df['Speed'].max()
min_speed = pokemon_df['Speed'].min()
speed_difference = max_speed - min_speed
print(f"Maximum Speed is {max_speed}")
print(f"Minimum Speed is {min_speed}")
print(f"Difference between Max and Min Speed is {speed_difference}")

```
