# 排序

## 稳定性

稳定性是指排序后相同数值的元素是否能保持相对顺序

各种排序算法的稳定性：

|算法|时间复杂度|空间复杂度|稳定性|备注|
|---|----|---|---|---|
|选择排序|O(N^2)|O(1)|不稳定|交换过程破坏了稳定性|
|冒泡排序|O(N^2)|O(1)|稳定|相等时不交换即可保证稳定性|
|插入排序|O(N^2)|O(1)|稳定|相等时不交换即可保证稳定性|
|归并排序|O(N*LogN)|O(N)|稳定|相等时先拷贝左边即可保证稳定性|
|随机快排|O(N*LogN)|O(LogN)|不稳定|patition的过程破坏了稳定性|
|堆排序|O(N*LogN)|O(1)|不稳定|堆化交换的过程破坏了稳定性|
|计数排序|O(N)|O(N)|稳定|不基于比较|
|基数排序|O(N)|O(N)|稳定|不基于比较|

## 总结
* 不基于比较的排序，对样本数据有严格要求，不易改写复用
* 基于比较的排序，只要规定好两个样本怎么比大小就可以直接复用
* 基于比较的排序，时间复杂度的极限是O(N*LogN)
* 事件复杂度O(N*LogN)、额外空间复杂度地狱O(N)、且稳定的基于比较的排序是不存在的。
* 为了绝对的速度选快排，为了省空间选堆排序、为了稳定性选归并。
* 工程上，Java类库中的sort中如果是基础类型，直接使用快排，如果是类类型，则使用归并。

## 常见的坑
* 归并排序的额外空间复杂度可以变成O(1)，"归并排序内部缓存法"，但是将变得不再稳定。
* "原地归并排序"是垃圾帖，会让时间复杂度变成O(N^2)
* 快速排序稳定性改进，"01 stable sort"， 但是会对样本数据要求更多。
  例如：在整型数组中，请把奇数放在数组的左边，偶数放在数组的右边，
  要求所有的奇数之间原始的相对顺序不变，所有的偶数之间原始相对顺序不变。
  时间复杂度做到O(N)，额外空间复杂度做到O(1)。
  面试时用来压价的题目。
  
