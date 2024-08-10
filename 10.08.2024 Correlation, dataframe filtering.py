```py
# 1/Create two DataFrame Grass and Water
import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
pokemon_df = pd.read_csv('/content/Pokemon.csv')

grass_df = pokemon_df[pokemon_df['Type 1'] == 'Grass'][['Attack', 'Defense']]
print("Grass-Type Pokemon:")
print(grass_df.head())

water_df = pokemon_df[pokemon_df['Type 1'] == 'Water'][['Attack', 'Defense']]
print("\nWater-Type Pokemon:")
print(water_df.head())

# 2/Create the regression plots for each (Grass and Water)

#grass
plt.figure(figsize=(10, 8))
plt.title('Regression plot for Grass-type Pokemon')
sns.regplot(
    data=grass_df, x="Attack", y="Defense", 
    ci=99, marker="x", color=".3", line_kws=dict(color="r"),
)

#water
plt.figure(figsize=(10, 8))
plt.title('Regression plot for Water-type Pokemon')
sns.regplot(
    data=water_df, x="Attack", y="Defense", 
    ci=99, marker="x", color=".3", line_kws=dict(color="r"),
)
```

