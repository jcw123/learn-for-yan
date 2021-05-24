#### 问题描述

（1）请描述下Set数据结构的特点，什么场景可以使用这个结构？然后写一段代码体现Set数据结构的特点
数据不重复
集合中的对象不按特定的方式排序，并且没有重复对象。
***允许包含值为null的元素，但最多只能有一个null元素

包括：Hashset+Treeset
HashSet： HashSet类按照哈希算法来存取集合中的对象，存取速度比较快 
TreeSet ：TreeSet类实现了SortedSet接口，能够对集合中的对象进行排序

Set的基本操作：
boolean add(Object o)      :向集合中加入一个对象的引用
void clear()               :删除集合中所有的对象，即不再持有这些对象的引用
boolean isEmpty()          :判断集合是否为空
boolean contains(Object o) : 判断集合中是否持有特定对象的引用
Iterartor iterator()       : 返回一个Iterator对象，可以用来遍历集合中的元素
boolean remove(Object o)   :从集合中删除一个对象的引用
int size()                 :返回集合中元素的数目
Object[] toArray()         :返回一个数组，该数组中包括集合中的所有元素


NaN 属性是代表非数字值的特殊值

