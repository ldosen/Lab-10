## _Discuss the differences among the results. Does the starting point make a difference?_
The starting point absolutely makes a difference with each different kind of search iterator. The main reason for the difference is due to the difference in how the graph is traversed. For example, a breadth first search is going to list all connected nodes from the starting node before moving on to another. In this scenario, if Poland is the starting point, the entire graph will be traversed without it progressing to another node as Poland has a link to every node. If you set the starting point at Germany, the search will check all of Germany's edges before then checking Poland's edges which then would complete the graph traversal. Because the graph is cyclic, random walk search will never find an endpoint and thus will go into an infinite loop unless controlled somehow. 

## Give two or three examples of how/why a real-world map might require more than four colors.
One reason I can think of are countries with non-contiguous territories. For example, Kaliningrad is a Russian enclave on the Baltic coast that is separated from mainland Russia. If it weren't for this piece of territory, there is no reason why Poland could not be the same color as Russia. Multiple non-contiguous regions nearby could be cause for adding a 5th color to the map.

Another scenario where more than 4 colors would be needed is four countries that border each other completely surrounded on all sides by another country. 


