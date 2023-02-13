# Strings

## Assignment

In this assignment, I reverse the words in a string using StringBuffer.
This is accomplished by splitting the input string by ' ' (space) giving us individual words, and storing those words in an array.
Then I loop through each value of the array, inserting it to index 0 of the StringBuffer.

Additionally, I also implemented a function where 2 strings are compared to ensure that they contain the same characters, and each character has the same amount of occurences.
This is done by sorting both inputs alphabetically, and then comparing the 2 sorted strings.

An example:
the sorted string of below is below
the sorted string of elbow is below
below is equal to below therefore elbow and below has the same character set

I additionally made a commented out version of this function that uses HashMaps as opposed to string sorting.

In this version, for each input, we create a hashmap
for each input we also loop through each character, and record the total number of occurrences in the respective hashmap

an example:
abacc would have a hashmap similar to: a -> 2, b -> 1, c -> 2

we then compare these hashmaps and ensure their contents are identical.

For example:
below

b -> 1, e -> 1, l -> 1, o -> 1, w -> 1

elbow

b -> 1, e -> 1, l -> 1, o -> 1, w -> 1

since the contents of these hash maps are the exact same, we can determine that elbow and below has the same character set
