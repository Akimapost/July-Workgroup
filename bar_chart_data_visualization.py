

name_df = dataset['Name'].value_counts().reset_index()
name_df.columns = ['name', 'count']
top_5_names = name_df.iloc[:5]
plt.barh(top_5_names['name'], top_5_names['count'], color='pink')
plt.xlabel('Count')
plt.ylabel('Name')
plt.title('Top 5 Most Frequent Names')
plt.grid(True)
plt.show()
