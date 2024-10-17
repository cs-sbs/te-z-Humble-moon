[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/zKCmOc4h)
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=16597870&assignment_repo_type=AssignmentRepo)
# 题目一：奇偶个数（答案参考org.example.OddEven）
### 题目内容：
你的程序要读入一系列正整数数据，输入-1表示输入结束，-1本身不是输入的数据。程序输出读到的数据中的奇数和偶数的个数。

### 输入格式:
一系列正整数，整数的范围是（0,100000）。如果输入-1则表示输入结束。

### 输出格式：
两个整数，第一个整数表示读入数据中的奇数的个数，第二个整数表示读入数据中的偶数的个数。两个整数之间以空格分隔。

### 输入样例：
9 3 4 2 5 7 －1 

### 输出样例：
4 2

###  时间限制：500ms内存限制：32000kb


# 题目二：数字特征值（请在org.example.NumberFeature中解答该问题）
### 题目内容：
对数字求特征值是常用的编码算法，奇偶特征是一种简单的特征值。对于一个整数，从个位开始对每一位数字编号，个位是1号，十位是2号，以此类推。
这个整数在第n位上的数字记作x，如果x和n的奇偶性相同，则记下一个1，否则记下一个0。按照整数的顺序把对应位的表示奇偶性的0和1都记录下来，就形成了一个二进制数字。比如，对于342315，这个二进制数字就是001101。

这里的计算可以用下面的表格来表示：<br>

|  |  |   |   |   |   |   |
|----|----|---|----|----|----|---|
| 数字 | 3 | 4 | 2 | 3 | 1 | 5 |
| 数位 | 6 | 5 | 4 | 3 | 2 | 1 |
| 数字奇偶 | 奇 | 偶 | 偶 | 奇 | 奇 | 奇 |
| 数位奇偶 | 偶 | 奇 | 偶 | 奇 | 偶 | 奇 |
| 奇偶一致 | 0 | 0 | 1 | 1 | 0 | 1 |
| 二进制位值 | 32 | 16 | 8 | 4 | 2 | 1 |


按照二进制位值将1的位的位值加起来就得到了结果13。

你的程序要读入一个非负整数，整数的范围是[0,100000]，然后按照上述算法计算出表示奇偶性的那个二进制数字，输出它对应的十进制值。

提示：将整数从右向左分解，数位每次加1，而二进制值每次乘2。

### 输入格式:
一个非负整数，整数的范围是[0,1000000]。

### 输出格式：
一个整数，表示计算结果。

### 输入样例：
342315

### 输出样例：
13
