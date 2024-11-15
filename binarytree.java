/*
 ==> Types of binary tree
 1. binary tree : each node having At most 2 children 
 2. Full / Strict binary tree : each node have either 0 or 2 hcildren 
 3. All Most complete binary tree : node must be filled at one level before moving to the next level and insert left child before inserting right child
 3. Complete binary tree : All the internal node must have 2 children except leaf node

 Important terms :
 1 degree of tree : node having maximun no of child is the degree of the tree .
 2 level of tree: no of edge in between node to root .
 3 height of tree : no of node in between last node (leaf) and root node .
 4 depth of tree : no of node in between root node and last node (leaf) .

 properties of Binary tree
 1. max no of node possible at level i = 2^i .
 2. max no of node possible in a bt of height h = (2^h+1 -1)
 2. min no of node possible in a bt of height h = h+1
 3. max height of a bt having n nodes = n-1
 4. min height of a bt having n nodes = [log base2 (n+1) -1]

 ==> b-tree (Balanced tree)
 1. maintains sorted data
 2. all leaf node must be at same level
 3 . B tree of order m has following properties 
 a. every node has max m children 
 b. min children :- leaf -> 0
                    root-> 2
                    internal node ->m/2
 c. every node has max (m-1) keys
 d. min keys :- root-> 1
                all other node -> [m/2] -1
                


 */
