# 段落换行--Atx形式 

段落换行--Setext形式
=======

段落换行
-------

# 区块应用 #

> esgnuihneagjkn  
> DGD  
> SDGZ

> 区块引用嵌套
>> 内部引用

> 引用的区块内也可以使用其他的 Markdown 语法，包括标题、列表、代码区块等
>
> 1. 这是第一行列表项
> 2. 这是第二行列表项
>
> >    System.out.print("this is test!");
>
>>   return shell_exec("echo $input | $markdown_script");

# **列表**

* 无序列表支持使用星号、加号或是减号作为列表标记
+ 无序列表支持使用星号、加号或是减号作为列表标记
- 无序列表支持使用星号、加号或是减号作为列表标记

1. 有序列表则使用数字接着一个英文句点

<ol>
<li>Bird</li>
<li>McHale</li>
<li>Parish</li>
</ol>

1. 列表1
1. 列表2
1. 列表3

* 你都会得到完全相同的 HTML 输出。重点在于，你可以让 Markdown 文件的列表数字和输出的结果相同，或是你懒一点，你可以完全不用在意数字的正确性。

* 如果你使用懒惰的写法，建议第一个项目最好还是从 1. 开始，因为 Markdown 未来可能会支持有序列表的 start 属性。

* 列表项目标记通常是放在最左边，但是其实也可以缩进，最多 3 个空格，项目标记后面则一定要接着至少一个空格或制表符。

* 要让列表看起来更漂亮，你可以把内容用固定的缩进整理好：

1. This is a list item with two paragraphs. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aliquam hendrerit mi posuere lectus.

2. Suspendisse id sem consectetuer libero luctus adipiscing.

* 护甲歌还玩一飞

    > 三极管看  
    >激动死嘎多好

*   A list item with a blockquote:

    > This is a blockquote
    > inside a list item.

*  如果要放代码区块的话，该区块就需要缩进两次，也就是 8 个空格或是 2 个制表符 

1. 一列表项包含一个列表区块：
        <代码区域>

1986\. What a great season.

# 代码区块

* 和程序相关的写作或是标签语言原始码通常会有已经排版好的代码区块，通常这些区块我们并不希望它以一般段落文件的方式去排版，而是照原来的样子显示，Markdown 会用 <pre> 和 <code> 标签来把代码区块包起来。 </code></pre>

<p>这是一个普通段落：</p>

<pre><code>这是一个代码区块。
</code></pre>

# 分割线

********
- - - - 
--------

# 区段元素

* Markdown 支持两种形式的链接语法： 行内式和参考式两种形式;
* 不管是哪一种，链接文字都是用 [方括号] 来标记。
* 要建立一个行内式的链接，只要在方块括号后面紧接着圆括号并插入网址链接即可，如果你还想要加上链接的 title 文字，只要在网址后面，用双引号把 title 文字包起来即可

This is [an example](http://example.com/ "Title") inline link.
[This link](http://example.net/) has no title attribute.

[foo]: http://example.com/  "Optional Title Here"
[foo]: http://example.com/  'Optional Title Here'
[foo]: http://example.com/  (Optional Title Here)

# 强调

Markdown 使用星号（*）和底线（_）作为标记强调字词的符号，被 * 或 _ 包围的字词会被转成用 <em> 标签包围，用两个 * 或 _ 包起来的话，则会被转成 <strong> </strong></em>

*single asterisks*

_single underscores_

**double asterisks**

__double underscores__

<em>single asterisks</em>

<em>single underscores</em>

<strong>double asterisks</strong>

<strong>double underscores</strong>

# 代码

如果要标记一小段行内代码，你可以用反引号把它包起来（`）

Use the `printf()` function.

如果要在代码区段内插入反引号，你可以用多个反引号来开启和结束代码区段：

``There is a literal backtick (`) here.``

A backtick-delimited string in a code span: `` `foo` ``

# 图片

很明显地，要在纯文字应用中设计一个「自然」的语法来插入图片是有一定难度的。

Markdown 使用一种和链接很相似的语法来标记图片，同样也允许两种样式： 行内式和参考式。

* 行内式的图片语法看起来像是：

![Alt text](https://user-gold-cdn.xitu.io/2018/5/10/163497a368b3591d?imageView2/0/w/1280/h/960/format/webp/ignore-error/1 " bushid ")

![Alt text](/path/to/img.jpg "Optional title")

详细叙述如下：

一个惊叹号 !
接着一个方括号，里面放上图片的替代文字
接着一个普通括号，里面放上图片的网址，最后还可以用引号包住并加上 选择性的 'title' 文字

* 参考式的图片语法则长得像这样：

> ![Alt text][id]  
> [id]: url/to/image  "Optional title attribute"

# 其他

Markdown 可以利用反斜杠来插入一些在语法中有其它意义的符号，例如：如果你想要用星号加在文字旁边的方式来做出强调效果（但不用 <em> </em>标签），你可以在星号的前面加上反斜杠：

\*literal asterisks\*

Markdown 支持以下这些符号前面加上反斜杠来帮助插入普通的符号：
\   反斜线
`   反引号
*   星号
_   底线
{}  花括号
[]  方括号
()  括弧
#   井字号
+   加号
-   减号
.   英文句点
!   惊叹号

# 自动链接

Markdown 支持以比较简短的自动链接形式来处理网址和电子邮件信箱，只要是用方括号包起来， Markdown 就会自动把它转成链接。一般网址的链接文字就和链接地址一样，例如：

<http://example.com/>  
<address@example.com>