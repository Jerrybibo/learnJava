1:集合概念入门
	概述:集合也是容器,用来存储不固定个数的元素(值),集合的长度可以自动增长(理解:类比生活中的气球型容器),而数组的长度是固定的
	分类:
		单列集合:存储一个一个数据,常用的类是ArrayList
		双列集合:存储一对一对数据,常用的类是HashMap,要注意的是,先有双列集合,再有单列集合
		
2:HashMap 类:特点:键是唯一的(键不能重复,只保留一个,跟值无关);无序(存和取的顺序有可能不一致);通过键找到对应的值,只跟键相关(get(key))

	概述:映射,就是一种对应关系,例如y=f(x);f就是映射关系,x就是键,x通过映射关系f找到的x这个键对应的值y,(x,y)键值对,用来存储键值对

	声明:HashMap map;没有限定集合里面元素的数据类型; HashMap<String,String> map;限定集合里面键和值的数据类型都是String
	//HashMap<String,String>是集合的数据类型,map就是变量名(集合对象名),<String,String>就是集合里面元素的数据类型,
	//这个是双列集合,里面存储的元素是键和值,键值对,String就是集合里面存储的键的数据类型,第二个String,存的是集合里面值的数据类型

	赋值:
		map = new HashMap();//可以,但是不推荐
		map = new HashMap<String,String>();//推荐使用
		map = new HashMap<>();//推荐使用,JDK1.7开始支持,菱形泛型 alt /
	先声明后赋值可以,当然,声明和赋值一起写也是可以的,这里就不再列出了

	方法:

	put(key,value):往双列集合里面添加一对数据,键值对,这个方法的返回值如果第二次添加有重复的键,只保留原来的那个键,
	               键对应的值给新的值覆盖替换掉,方法的返回值表示被覆盖替换那个旧的值,其他情况没有覆盖都是返回null

	size():集合的长度就是集合里面存储元素的个数,这里是双列集合,存的是键和值,键值对,就是键值对的个数

	get(key键);//通过方法传入的键得到对应的值,方法的返回值是对应的值,如果没有这个键,就没有这个值,返回null表示

	isEmpty();//判断集合是否为空,判断集合里面是否有元素,如果没有返回true,否则返回false

	containsKey(key);//判断集合是否包含传入的键,如果包含返回true,否则返回false
	containsValue(value);//判断集合是否包含传入的值,如果包含返回true,否则返回false

	clear();//清空集合里面所有元素,把集合里面所有键值对删除掉
	remove(key);//移除删除方法传入的键和键对应的值,删除键值对的,这个方法的返回值就是被删除的键对应值,
	            //如果没有这个键,没有这个值,删除不了,返回null表示
	
3:ArrayList 类:特点:元素可以重复存储;有序(存和取的顺序一致);通过索引找到元素(get(index)方法)

	声明:ArrayList names;//ArrayList表示集合数据类型,现在集合里面元素数据类型没有限定,names变量名或者对象名
	     ArrayList<String> names;// ArrayList<String>表示集合数据类型,集合里面 元素 数据类型<String>,限定String

	赋值:names = new ArrayList();//可以,但是不推荐
	     names = new ArrayList<String>();//推荐使用
		 names = new ArrayList<>();//推荐使用,JDK1.7开始支持这种写法,菱形泛型
	     
	声明和赋值一次写初始化:ArrayList names = new ArrayList();//对象名names
						   ArrayList<String> names = new ArrayList();
						   ArrayList<String> names = new ArrayList<String>();
						   ArrayList<String> names = new ArrayList<>();

	add(element元素):往集合里面添加元素,方法的返回值表示添加元素是否成功,这里一直都是成功,成功返回true,因为可以添加重复元素

	get(int index):传入索引得到集合里面对应的元素,0索引对应集合里面第一个元素,其他以此类推,如果没有这个索引就报索引越界异常

	set(int index,element元素):把传入方法的索引对应的元素设置(替换)为后面传入方法的element元素,如果没有这个索引就报索引越界异常
	                           这个方法的返回值表示被替换掉那个元素
	比如,set(0,666);//把0索引对应第一个元素设置(替换)为666,返回被换掉那个元素

	remove(element元素);//直接删除传入的元素,方法的返回值是否删除成功,成功返回true,失败返回false,没有这个元素那就无法删除,删除失败返回false
	remove(int index);//根据传入的索引删除索引对应的元素,方法的返回值表示这个索引对应的被删除的元素,没有这个索引就报索引越界异常,问题
					 //如果传入的是0索引,删除的是集合里面第一个元素,其他以此类推
		             //注意事项,如果刚好看起来两个方法都可以使用到的时候,优先使用用索引删除对应元素的那个方法!!!,因为get得到用的是索引

	isEmpty();//判断集合是否为空,集合里面是否有元素,没有返回true,否则返回false

	indexOf(element元素);//判断传入的元素在调用方法的集合里面第一次出现的位置 的 索引,找不到这个元素,没有索引返回-1表示
	lastIndexOf(element元素);//判断传入的元素在调用方法的集合里面最后一次出现的位置 的 索引,找不到这个元素,没有索引返回-1表示

	//把集合list的内容转换为对象数组arr,把集合里面元素存到转换成数组对应元素里面,对象也可看做一类事物写个类叫Object表示,万物皆对象
	Object[] arr = list.toArray();

	//了解一下
	String[] arr = new String[list.size()];//这个自定义的数组,长度怎么指定,你的集合里面有多少个元素我就写多少个
	list.toArray(arr);//需要T[] 数组,具体这个T的类型怎么写,有你想要转换成数组的集合里面元素的数据类型来决定,前提条件要创建一个数组供这个方法使用
	System.out.println(arr[0]);//对应就是原来那个集合里面第一个元素,其他以此类推

	String s = Arrays.toString(arr);//通过数组工具类的静态toString方法,把数组arr变成一个 特殊格式的字符串 赋值给s,
	System.out.println(s);//[张三丰, 张无忌, 欧阳锋, 洪七公, 张三丰]

	size();//得到集合的长度,集合里面存储元素的个数

4:泛型入门//理解
	概述:规范我们的数据类型,限定我们的数据类型,用在集合里面就是限定集合里面的元素的数据类型,
		 在Java里面用尖括号<里面要求是引用数据类型(对象实例类型)>表示,比如<String,String>,用在双列集合,限定集合里面元素的数据类型

5:包装类//理解,部分记忆
	概述:基本数据类型都有它对应的引用数据类型(包装类),这个引用数据类都可以new出来创建对象,包装成对象,叫包装类,说白了也是类!!!
	byte:		Byte//类,其他都是首字母大小,其他字母小写
	short:		Short
	int:		Integer//记忆 int alt/ 提示选
	long:		Long
	double:		Double
	float:		Float
	char:		Character//记忆 
	boolean:	Boolean
	作用:把基本数据类型包装成引用数据类型(类),这个引用数据都可以new出来创建对象,拿到对象名调用引用数据类型(包装类)里面方法等,
	     可以更加方便的操作我们的基本数据类型
	代码如下:
		public class 包装类 {
			public static void main(String[] args) {
				int i = 666;
				
				Integer i2 = new Integer(i);//把基本数据类型变成引用数据类型,i2对象名
				System.out.println(i2.MAX_VALUE);//2147483647
			}
		}

	字符串"3"与整数3之间的转换,最简单的两种方式:
		//parseInt方法要求这个字符串是(+或-)数字字符串或者不能超出int类型的范围,否则会报NumberFormatException,数字格式化异常,问题
		int i = Integer.parseInt("3");//新的要记忆!!!把字符串"3"解析为int类型3,静态方法可以通过类名.来调用,也可以通过对象名.来调用
		System.out.println(i);//3
		
		//把整数3变成字符串"3";这个,本来,我们就会的
		int ii = 3;
		String s = ii+"";
		System.out.println(s.length());

6:集合体系结构,子父类之间关系,//了解,看看就好,不懂也没关系
	双列集合:Map 接口 干爹
			 HashMap 类 ,干儿子  TreeMap 类,干儿子
			 LinkedHashMap 类,是HashMap的亲儿子,是双列集合唯一一个可以保证怎么存就怎么取的集合(有序)

	单列集合:Collection 接口 干爹
			 List  Set  Collection接口亲儿子
			
			 类 List接口的干儿子
			 ArrayList  Vector  LinkedList 

			 类 Set接口的干儿子 
			 HashSet TreeSet 
			 LinkedHashSet 是HashSet的亲儿子

	 常用的类是 HashMap ArrayList 

7:增强for循环,jdk1.5的新特性
	增强for循环:用来遍历数组或者单列集合,也就是得到数组里面每一个元素 或者单列集合里面 每一个元素
	格式:
		for(元素的数据类型 变量名:数组名或者单列集合对象名){//变量名就表示数组或者集合里面 每一个元素
			System.out.println(变量名);
		}

	得到数组里面的每一个元素,代码:
		int[] arr = {1,2,3};
			
		for(int i:arr){//变量名i就表示数组里面  每一个元素
			System.out.println(i);
		}//fore 按 alt / 在eclipse里面可以快速生成

	得到单列集合里面的每一个元素:
		//单列集合
		ArrayList<Integer> al = new ArrayList<>();//对象名al
		al.add(1);
		al.add(1);
		al.add(3);
		
		for(Integer i:al){//变量名i就表示者集合里面  每一个元素
			System.out.println(i);
		}//fore 按 alt / 在eclipse里面可以快速生成

	通过双列集合得到里面单列集合,键的集合,可以通过增强for循环得到每一个键,通过每一个键得到每一个值
	代码:
	//双列集合能不能直接用增强for循环得到集合里面的每一个元素
		HashMap<String, String> hm = new HashMap<>();//hm是双列集合的对象名
		hm.put("fbb", "lic");
		hm.put("lbb", "fed");
		hm.put("baby", "hxm");
		//直接来不行,因为增强for循环针对的是数组或者 单列集合,所以双列集合不能直接用,那么,双列集合里面到底有没有单列集合?有,分别叫键的集合,键值对的集合,通过双列集合对象名hm调用方法得到
		//键的集合,是个单列集合,通过双列集合对象名hm调用方法得到
		for(String key:hm.keySet()){//key键,Set集合,keySet()得到键的集合,键的集合里面存储的是 每一个键 (元素),s就是每一个键的集合里面每一个元素,也就是每一个键key
			//key代表键的集合里面存储的元素,也就是 每一个键
			String value = hm.get(key);//通过每一个键,得到每一个值value
			System.out.println(key+":"+value);
		}

	通过双列集合得到单列集合,键值对对象的集合,通过增强for循环得到每一个键值对对象,键值对由键和值构成,所以它里面有得到键和得到值的方法
	代码:
	//键值对的集合,是个单列集合,通过双列集合对象名hm调用方法得到
		for(Entry<String, String> en :hm.entrySet()){//entry实体就是键值对,Set集合,键值对的集合,存储每一个键值对,键值对由键和值,得到每一个键值对,就可以调用方法得到每个键,得到每个值
			//en就是每一个键值对,键值对由键和值,就可以调用方法得到每个键,得到每个值
			String key = en.getKey();//得到每一个键值对里面每一个键
			String value = en.getValue();//得到每一个键值对里面每一个值
			System.out.println(key+":"+value);
		}

8:其他补充内容
A:用输入语句输出引用数据类型的变量,默认会调用它的toString()方法,不写也是写,系统给你写
	System.out.println(map);//{},用输入语句输出引用数据类型的变量map,默认会调用它的toString()方法
	System.out.println(map.toString());//{}

背背佳:
B:集合跟数组的区别:
下面关于HashMap和数组Array的说法正确的是?
    A. HashMap里面存放的数据是无序的.array里面的数据是有序的
    B. array用下标访问数据
    C. HashMap用key访问数据
    D. HashMap大小不固定,可以动态添加数据,array大小固定

C:通过[]去访问得到一个数据,只有数组里面用,用来获取数组里面元素的,格式数组名[索引];其他地方都没有这种用法!!!





