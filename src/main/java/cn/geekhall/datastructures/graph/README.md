# 图 （graph）

## 图的面试题如何搞定
   
图的算法都不算难，只不过coding的代价比较高

1. 先用自己最熟练的方式，实现图结构的表达
2. 在自己熟悉的结构上，实现所有常用的图算法作为模板
3. 把面试题提供的图结构转化为自己熟悉的图结构，再调用模板或改写即可

## 图的宽度优先&深度优先遍历
   
### 宽度优先遍历

1. 利用队列实现
2. 从源节点开始依次按照宽度进队列，然后弹出
3. 每弹出一个点，把该节点所有没有进过队列的邻接点放入队列
4. 直到队列变空

### 深度优先遍历
1. 利用栈实现
2. 从源节点开始把节点按照深度放入栈，然后弹出
3. 每弹出一个点，把该节点下一个没有进过栈的邻接点放入栈
4. 直到栈变空

## 拓扑排序
在图论中，拓扑排序（Topological Sorting）是一个有向无环图（DAG, Directed Acyclic Graph）的所有顶点的线性序列。且该序列必须满足下面两个条件：

每个顶点出现且只出现一次。
若存在一条从顶点 A 到顶点 B 的路径，那么在序列中顶点 A 出现在顶点 B 的前面。
有向无环图（DAG）才有拓扑排序，非DAG图没有拓扑排序一说

步骤：

1. 从 DAG 图中选择一个 没有前驱（即入度为0）的顶点并输出。
2. 从图中删除该顶点和所有以它为起点的有向边。
3. 重复 1 和 2 直到当前的 DAG 图为空或当前图中不存在无前驱的顶点为止。后一种情况说明有向图中必然存在环。

应用：

常用来解决复杂工程之间的依赖问题

## 最小生成树

### Kruskal算法


### Prim算法

## Dijkstra 算法

求起点到所有点的最短距离

