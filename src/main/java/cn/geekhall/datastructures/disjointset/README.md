# 并查集（Disjoint-set）

主要用于解决一些元素分组的问题。它管理一系列不相交的集合，并支持两种操作：

* 合并（Union）：把两个不相交的集合合并为一个集合。
* 查询（Find）：查询两个元素是否在同一个集合中。

典型问题包括：亲戚问题、黑帮问题等。

1. 若干个样本a, b, c, d...类型假设是V
2. 在并查集中一开始认为每个样本都在单独的集合里。
3. 用户可以在任何时候调用合并（Union）和查询（Find）：
4. 查询（Find）和合并（Union）的代价越低越好。

