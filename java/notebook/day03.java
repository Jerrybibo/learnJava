1:数组的概念
	概念:数组也是容器,可以存储同一种数据类型的0个或者多个值,数组里面存的值,给个名称叫元素

	声明:数据类型[] 数组名;//数据类型 变量名;数组是引用数据类型
	//变量名,对应数组名,数据类型[]也是一个数据类型,数组这种数据类型,数据类型表示数组里面存储的元素(值)的数据类型,
	//String[] names;表示我声明了一个数组名字叫names,这个数组的数据类型是String[](字符串数组),里面存的值(元素)的数据类型String字符串

	赋值:names = new String[4];//新建一个字符串数组,数组里面存4个值(元素);
	格式1:我们指定数组长度,系统给数组里面的元素默认值(int 0,double 0.0,boolean false,String null),动态初始化
	数组名 = new 数据类型[你一定要指定数组的长度];//数组的长度表示数组里面能够存储元素(值)的个数,names = new String[4];
	格式1声明和赋值一起写:String[] names = new String[4];
	格式2声明和赋值一起写:String[] names = new String[]{"张三","李四","王五","赵六};
	格式2有个变形,快速初始化:String[] names = {"张三","李四","王五","赵六};//不能先声明后赋值,不能分开写,要一起写

	格式2:我们给出数组里面元素的值,长度由系统来指定,我们不能指定,静态初始化
	数组名 = new 数据类型[]{可以有0个或者多个值,多个值之间以逗号,隔开};//names = new String[]{"张三","李四","王五","赵六"};
	格式2变形:快速初始化,要求声明和赋值一起写(不能分开写,一次成型),String[] names = {"张三","李四","王五","赵六};
	格式:数据类型[] 数组名 = {可以有0个多个多个值,多个值之间以逗号,隔开};

2:数组的特点
	特点:数组存储的值叫元素,为每一个元素进行编号(角标,下标,索引index),编号为0对应数组里面的第一个元素,其他以此类推

	如何表示数组里面元素:数组名[编号索引角标下标];比如上面的数组names的第一个元素,names[0];
	如何给数组里面的元素进行赋值:数组名[索引] = 值;例如names[0] = "小明";

	数组长度如何表示:数组名.length,表示数组里面存储元素的个数,例如names.length,数组长度是天生就有的,是数组的属性,固定死的

	数组最小索引:0,因为索引从0开始
	数组最大索引:长度-1;//数组名.length-1;因为索引从0开始

	数组问题:ArrayIndexOutOfBoundsException,数组索引越界异常
		原因:你访问了不存在的索引,比如数组的长度为0的时候,没有元素也就没有索引,更加没有0索引,0索引对应的是数组里面第一个元素
		解决:你访问存在的索引就可以了,你不要访问不存在的索引
		代码:
	public class Itheima {
		public boolean isFirstLastEquals(int[] arr){//int[] arr2 = new int[0];//isFirstLastEquals(arr2);
			//如果调用我方法传入的数组长度为0的时候,我就不要去通过0索引去访问元素
			int len = arr.length;//0
			if (len==0) {
				return true;//返回值,表示方法调用完毕得到的结果,能走到这里表示方法都已经结束了,下面的代码不走
			}
			
			int start = arr[0];//arr = arr2;//长度为0,没有元素,0索引对应的是第一个元素,没有0索引你去访问会出现问题
			int end = arr[arr.length-1];
			if (start==end) {
				return true;
			}else {
				return false;
			}
			
		}
	}

3:数组的使用和访问
	//姓名数组用来存两个名字
	//声明
	String[] names;

	//赋值
	格式1:动态初始化
		names = new String[2];//我们指定长度,元素的默认值由系统指定(int 0,double 0.0 boolean false,String等引用数据类型都是null)
		syso(arr[0]);//null,没有意义,就要给数组元素进行赋值,如何表示数组元素:数组名[索引从0开始];
		names[0] = "小明";
		names[1] = "小红";

	格式2;
		names = new String[]{"小明","小红"};//我们指定元素的值,长度由系统指定,我们不能指定,静态初始化

	声明和赋值一起写:
		格式1:String[] names = new String[2];
		格式2:String[] names = new String[]{"小明","小红"};
		格式2变形快速初始化:String[] names = {"小明","小红"};//只能声明和赋值一起写(一次成型),快速初始化

	数组长度:数组名.length;names.length;表示数组里面元素的个数,长度是天生就有,固定死的,是数组的属性,所以注意length后面没有()!!!

	数组索引:
		最小索引是0,索引从0开始
		最大索引:数组长度-1;数组名.length-1

	数组问题:ArrayIndexOutOfBoundsException,数组索引越界异常问题
		原因:你访问了不存在的索引,比如数组的长度为0的时候,没有元素也就没有索引,更加没有0索引,0索引对应的是数组里面第一个元素
		解决:你访问存在的索引就可以了,你不要访问不存在的索引

4:面向对象入门
	概述:万物皆对象,一切事物都是对象,对象通过类来new出来创建的
	编程:模拟事物,解决事物的问题
	事物:属性(事物名词表示特征)和行为(事物的动词表示事物能够做什么),一类一类事物,以类型区分
	类:一类事物用类来模拟,写一个类表示一类事物,在类里面写个成员变量表示事物的属性,在类里面写个方法表示事物的行为,属性和行为的集合,类型
	对象:一类事物中某个事物就是一个对象,对象是类的一个具体的体现,实现,实例,老师类模拟老师这类事物,具体的一个老师就是对象
	如何创建对象:格式,记忆:类名 对象名 = new 类名();//类,就是模板,根据类这个模板来创建对象啊?类里面有变量和方法
	对象有什么用:既然对象是类的一个具体的体现,类这个模板都有变量和方法,那么类的一个具体对象也有变量和方法,而且每个对象都有自己的一份
		         对象里面有变量和方法,怎么使用:通过对象名(对象).点调用,.使用调用的意思

	记忆:面向对象入门:创建对象,通过对象名.来调用使用变量和方法,创建对象格式:类名 对象名 = new 类名();
	     为了便于你理解:一句话,创建对象拿到对象名.来调用对象对应的类里面的变量和方法!!!
	
5:String类:不管字符串是在前面还是在后面,任何东西跟字符串通过+相连接得到都是一个新的字符串,
	String 类代表字符串。Java 程序中的所有字符串字面值（如 "abc" ）都作为此String类的实例实现,即"abc"就表示String类的一个对象!!!
	String s = new String();//s就是对象名,存的是对象的地址值,new String()是一个对象
	String s2 = "abc";//s2就是对象名,存的是对象的地址值,"abc"也是一个对象,底层是下面两行代码这么做的
		char[] data = {'a', 'b', 'c'};
		String str = new String(data);

	通过对象名(或者对象).来调用方法,比如我想调用别人写好的类String类里面的length()方法://哪里不会点哪里,通过对象名或者对象!!
		s.length();//表示我调用的是对象名s对应的String类里面的length()方法
		new String().length();
		s2.length();
		"abc".length();

6:字符串常见操作(判断获取和转换)
concat();//把调用方法的字符串和传入方法的字符串连接起来串起来成为一个新的字符串,要求连接的东西都是字符串
		String a1 = "哈哈";//a1对象名
		String a2 = "嘎嘎";//a2对象名
		
		//通过对象名或者对象来.调用方法,暂时用对象名.
		String s = a1.concat(a2);//把调用方法的字符串和传入方法的字符串连接起来串起来成为一个新的字符串,要求连接的东西都是字符串
		System.out.println(s);//哈哈嘎嘎
		
		System.out.println(a1+a2);//哈哈嘎嘎,+字符串连接符,只要有一个是字符串就可以了

length();//字符串长度,表示调用方法的字符串里面字符的个数
		String a1 = "哈哈";//a1对象名
		//通过对象名.来调用方法
		
		int len = a1.length();//字符串长度,表示调用方法的字符串里面字符的个数
		System.out.println(len);//2

isEmpty();//判断调用方法的字符串的是否为空,即里面字符的个数是否为0,如果是返回true,否则返回false
		String a1 = "";//a1对象名
		//通过对象名.来调用方法
		
		boolean b = a1.isEmpty();//判断调用方法的字符串的是否为空,里面字符的个数是否为0,如果是返回true,否则返回false
		System.out.println(b);//true

equals();//调用方法的字符串跟传入方法的字符串的内容值是否相等,区分大小写的,相等返回true,否则返回false
		String a1 = "a";//a1对象名
		String a2 = new String("A");
		//通过对象名.来调用方法
		
		boolean b = a1.equals(a2);//调用方法的字符串跟传入方法的字符串的内容值是否相等,区分大小写的,相等返回true,否则返回false
		System.out.println(b);//false

equalsIgnoreCase();//调用方法的字符串跟传入方法的字符串的内容值是否相等,不区分大小写的,相等返回true,否则返回false
		String a1 = "a";//a1对象名
		String a2 = new String("A");
		//通过对象名.来调用方法
		
		boolean b = a1.equalsIgnoreCase(a2);
		//调用方法的字符串跟传入方法的字符串的内容值是否相等,不区分大小写的,相等返回true,否则返回false
		System.out.println(b);//true

charAt(int index);//得到调用方法的字符串里面的字符,从传入方法的索引得到,0索引对应的是字符串里面第一个字符,其他以此类推
		String a1 = "cba";//a1对象名
		//通过对象名.来调用方法
		
		char c = a1.charAt(0);//得到调用方法的字符串里面的字符,从传入方法的索引得到,0索引对应的是字符串里面第一个字符,其他以此类推
		System.out.println(c);//c

contains();//调用方法的字符串是否包含传入的字符串,如果包含返回true,否则返回false,这里的包含是当做一个整体,可以自己包含自己
	    String a1 = "itheima";//a1对象名
		//通过对象名.来调用方法
		
		boolean b = a1.contains("itheima");//调用方法的字符串是否包含传入的字符串,如果包含返回true,否则返回false,
		这里的包含是当做一个整体,有就可以了,甚至可以自己包含自己
		System.out.println(b);//true

startsWith();//判断调用方法的字符串是否以传入方法的字符串开头,如果是返回true,否则返回false,这里的开头甚至可以包含自己
		String a1 = "itheima";//a1对象名
		//通过对象名.来调用方法
		
		boolean b = a1.startsWith("itheima");//判断调用方法的字符串是否以传入方法的字符串开头,如果是返回true,否则返回false,
		这里开头甚至可以包含自己
		System.out.println(b);//true

endsWith();//判断调用方法的字符串是否以传入方法的字符串结尾,如果是返回true,否则返回false,这里的结尾甚至可以包含自己
		String a1 = "itheima";//a1对象名
		//通过对象名.来调用方法
		
		boolean b = a1.endsWith("ia");//判断调用方法的字符串是否以传入方法的字符串结尾,如果是返回true,否则返回false
		System.out.println(b);//true

indexOf("a");//求传入方法的字符或者字符串(当做一个整体),在调用方法的字符串里面第一次出现的位置 的索引,找不到返回-1表示
		String a1 = "aabc";//a1对象名
		//通过对象名.来调用方法
		
		int index = a1.indexOf("a");//求传入方法的字符或者字符串在调用方法的字符串里面第一次出现的位置 的索引,找不到返回-1表示
		System.out.println(index);//0

		String a1 = "aabc";//a1对象名
		//通过对象名.来调用方法
		
		int index = a1.indexOf(97);//97对应的字符a,//求传入方法的字符或者字符串在调用方法的字符串里面第一次出现的位置 的索引,
								   //找不到返回-1表示
		System.out.println(index);//0

lastIndexOf();//求传入方法的字符或者字符串(当做一个整体),在调用方法的字符串里面最后一次出现的位置 的索引,找不到返回-1表示
		String a1 = "hellh";//a1对象名
		//通过对象名.来调用方法
		
		int i = a1.lastIndexOf("h");//求传入方法的字符或者字符串在调用方法的字符串里面最后一次出现的位置 的索引,找不到返回-1表示
		System.out.println(i);//4

		String a1 = "abca";//a1对象名
		//通过对象名.来调用方法
		
//		System.out.println('h'+0);//104

		int i = a1.lastIndexOf(97);//97对应的a字符,在调用方法的字符串里面最后一次出现的位置的 索引,找不到返回-1表示
		System.out.println(i);//3

replace("heima", "itheima");//用传入方法的后一个字符串替换调用方法的字符串里面的前一个字符串得到一个新的字符串定义变量接收,替换所有
                            //原来的没有改变
		String a1 = "hello heima heima heima";//a1对象名,如果前一个字符串在调用方法的字符串不存在,替换失败,结果还是原来的
		//通过对象名.来调用方法
		
		String s = a1.replace("haoma", "itheima");
		//用传入方法的后一个字符串替换调用方法的字符串里面的前一个字符串得到一个新的字符串,替换所有
		System.out.println(s);//replace sth with sth;

split();//调用方法的字符串按照传入方法字符串进行切割,split切割的意思,你就理解为相当于把它吃掉了
		String a1 = "hello###heima";//a1对象名
		//通过对象名.来调用方法
		
		String[] arr = a1.split("###");//调用方法的字符串按照传入方法字符串进行切割,split切割的意思,你就理解为相当于把它吃掉了
		String s = arr[arr.length-1];
		System.out.println(s);//heima
		System.out.println(arr[0]);//hello

		String a1 = "hello.heima";//a1对象名
		//通过对象名.来调用方法
		
		String[] arr = a1.split("\\.");
		//切割.的时候不能用.用\\.,.因为这个切割的规则是个正则表达式,.在正则表达式里面表示任意字符,\\.才是我认为.
		System.out.println(arr[0]);//hello
		System.out.println(arr[1]);//heima

substring(int start,int end);//截取一个字符串,从start索引开始,到end索引-1的那一段字符串,得到一个新的字符串定义变量来接收,包头不包尾,神龙见首不见尾,原来的字符串没有改变
		String a1 = "abca";//a1对象名
		//通过对象名.来调用方法
		
		String s = a1.substring(0,3);
		//截取一个字符串,从开始索引开始,到结尾索引-1的那一段字符串,得到一个新的字符串,包头不包尾,神龙见首不见尾
		System.out.println(s);//abc

substring(int start);//从开始索引start截取一直到字符串的末尾的那一段字符串,产生一个新的字符串,原来的字符串没有改变
		String a1 = "abca";//a1对象名
		//通过对象名.来调用方法
		
		String s = a1.substring(1);//从开始索引截取一直到字符串的末尾的那一段字符串,产生一个新的字符串
		System.out.println(s);//bca

toLowerCase();//把调用方法的字符串里面所有的字母变成小写,产生一个新的字符串,原来的字符串没有改变
		String a1 = "I LovE HEIMA";//a1对象名
		//通过对象名.来调用方法
		
		String s = a1.toLowerCase();//把调用方法的字符串里面所有的大写字母变成小写,产生一个新的字符串
		System.out.println(s);//i love heima

toUpperCase();//把调用方法的字符串里面所有的小写字母变成大写,产生一个新的字符串,原来的字符串没有改变
		String a1 = "I LovE HEIMA";//a1对象名
		//通过对象名.来调用方法
		
		String s = a1.toUpperCase();//把调用方法的字符串里面所有的小写字母变成大写,产生一个新的字符串
		System.out.println(s);//I LOVE HEIMA

trim();//去,去除调用方法的字符串前后两端的空白字符(空格,tab键),保留中间的空白字符
		String a1 = "	I LovE HEIMA  ";//a1对象名
		//通过对象名.来调用方法
		
		String s = a1.trim();//去,去除调用方法的字符串前后两端的空白字符(空格,tab键),保留中间的空白字符
		System.out.println(s);//I LovE HEIMA

toCharArray();//字符串底层就是字符数组,把字符串变成字符数组
		char[] arr = a1.toCharArray();
		System.out.println(arr[0]);//a

valueOf(Object obj万物皆对象);//把任意东西变成一个字符串
		String a1 = "abc";//a1对象名,"哈哈"是对象,tab
		String s = a1.valueOf(true);
		System.out.println(s.length());//"true" 4

7:补充内容
回顾:变量是容器,变量最终只能存储一个值,尽管这个值可以发生变化,你给它赋值就可以了
定义变量格式:数据类型 变量名 = 变量值;//声明和赋值一起写,初始化,比如int a = 666;先声明int a;后赋值a = 666;
定义格式变形:声明:数据类型 变量名;	赋值:变量名 = 变量值;//声明:String name;向计算机申请一块空间,空间名字叫name,用来存姓名

比较字符串的内容值不能用==号,要用equals方法,代码:
public class Itheima {
	public boolean isFirstLastEquals(String[] arr){//String[] arr2 = new String["haha",new String("haha")];isFirstLastEquals(arr2)
		int len = arr.length;
		if (len==0) {//2
			return true;
		}
		
		String start = arr[0];//String start = "haha";//引用数据类型的变量存的是地址值,start存的是常量池中的地址值
		String end = arr[arr.length-1];//String end = new String("haha");//end存的是new出来东西所在的堆内存的地址值
		//常量池跟堆内存不是同一个地方,所以他们的地址值不相同
		
		if (start.equals(end)) {//比较字符串的内容值不能用==号,应该用equals方法,==比较的是字符串的地址值
			return true;
		}else {
			return false;
		}

//		if (start==end) {//比较字符串的内容值不能用==号,应该用equals方法,==比较的是字符串的地址值
//			return true;
//		}else {
//			return false;
//		}
		
	}
}

