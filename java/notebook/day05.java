1:面向对象再次入门
//理解,类,类型,对应一类事物,类装了属性(变量)和行为(方法);对象是这个类类型一个具体的体现,对象也有变量和方法,对象名或者对象.来使用
	概述:万物皆(类型)对象,编程就是为了模拟现实生活中的事物,解决事物身上的问题
	事物://一类事物对应Java里面就是类
		属性:事物身上的名词,表示事物的特征,对应类里面的成员变量,写在类中{},方法外
		行为:事物身上的动词,表示事物能够做什么,对应我们写的类里面的方法,写在类中{}

	类:类型,模型,模板,模具,图纸,蓝图,就是一类事物属性和行为的集合(一个类里面装了属性变量和行为方法)
	举个例子:你要找什么类型的女朋友:白,富,美(属性),爱我,孝敬父母(行为),具体某一个人就是对象,比如我的女朋友(对象),林志玲

	对象:就是一个类的具体体现,实现,实例,个例,个体(一个类可以有多个对象)//一类事物中的具体的一个事物就是对象

	如何创建对象:通过类来new出来,格式:类名 对象名 = new 类名();//()里面可以有0个或者多个实参,实参本质就是一个值(变量的值或者变量名)
	比如创建String类的对象:String s = new String();//s对象名,存的是对象的地址值,通过对象的地址值就可以找到对象,new String();是对象
	对象有什么用:创建对象就可以得到对象或者对象名,通过对象名.就有可以调用(使用)这个对象对应的类里面的成员,包括变量和方法(错误理解)
	(理解:类是类型,模型,模板,有个方法,对象作为类的具体的体现,作为模板生出来的具体的东西,模板都有这个方法,具体东西对象肯定有)

	比如我要使用(调用)String类里面的length()方法,s.length();//调用格式:对象名.方法名();//哪里不会点哪里,.点理解diao,调用

	//新建一个项目,模拟女朋友这类事物,写一个类带有main方法程序才能运行起来,因为main方法是所有程序的入口,程序都是从这里开始执行的
	//一个文件可在里面写多个类,但只能有一个用public修饰的类,这个类的名字Java要求跟文件的名字一样,通常是main(主)方法所在类,主类,测试类
	代码:
	public class Test {//alt shif j 文档注释快捷键
		public static void main(String[] args) {
			//写一个类几乎是没有用的,关键要把这个类里面的东西使用(调用)起来,通过这个类来创建对象,拿到对象名.来调用成员,包括变量和方法
			//创建对象格式:类名 对象名 = new 类名();记不住用alt /提示创建对象
			Nvpengyou npy = new Nvpengyou();//npy就是对象名
	//		npy.loveMe();//表示我调用npy这个对象名对应的类Nvpengyou里面的loveMe()方法
			
	//		String name = npy.name;//表示调用npy这个对象名对应的类Nvpengyou里面名叫name那个变量,null
	//		System.out.println(name);//null
	//		System.out.println(npy.name);//null

			//我想给Nvpengyou类里面的变量name进行赋值,拿到变量通过=赋值号赋值,手动初始化
	//		npy.name = "范冰冰";
	//		System.out.println(npy.name);//
			
			//自己在类里面直接给成员变量进行赋值,显示初始化
	//		System.out.println(npy.age);//
			System.out.println(npy.name);//
			
		}
	}

	//编程就是为了模拟现实生活中的事物,解决事物身上的问题
	//模拟女朋友这类事物,在Java里面用类来表示
	 class Nvpengyou {
		//属性,对应Java类的成员变量,写在类中{},方法外
		 String name = "fbb";//null,就给范冰冰覆盖了,成员变量有默认值,引用数据类型都是null,int 0,doule 0.0, boolean false 
		 int age = 18;//0
		 
		//行为,对应Java类的方法,写在类中{}
		 public void loveMe(){
			 System.out.println("i love you!!!");
		 }
		 
	}
	
2:构造方法:创建对象时,通过new关键字调用构造方法来创建对象拿到对象名,既然调用到了构造方法,我就可以在构造方法里面做事情,
           比如可以在构造方法里面给类的成员变量进行赋值

	概述:创建对象的时会调用到构造方法,//Test t = new Test();//new新建理解.调用,使用Test()方法
	如何写一个构造方法,比如我写的一个类的名字叫Test,它的构造方法如何写,如何定义
	public Test(){//()可以有0个或者多个形参,形参就是一个没有赋值只是声明的变量而已,没有赋值,搞个形式,形式参数
		//return;不写也是写,系统给你写,返回,用来结束方法,在哪里调用的,调用完就回到哪里去
	}
	特点:1.方法名跟类名一致 2.构造方法没有返回值,甚至连void都没有 3.构造方法没有返回值,但是可以return;(巧记很特别,构造方法还叫构造器)
	
	注意事项:如果我们没有写构造方法,系统会默认给我们提供一个无参的构造方法,不写也是写(系统提供构造方法只是用来创建对象拿到对象名)
	         如果我们写了构造方法,不管有参还是无参,系统就不再提供默认的无参构造方法
			 如果我们写了有参构造方法,系统将不再提供默认的无参构造方法,我又想通过无参构造方法创建对象,那就自己写一个,
			 建议大家无参有参都写
	
	作用:
	     1.通过new关键字调用构造方法来创建对象(拿到对象名)
	     2.可以在创建对象的时候给对象进行初始化,给对象所在的类的成员变量进行赋值
		   (创建对象的时会调用到构造方法,那就跑到构造构造方法里面去了,
		   我就可以在构造方法里面做事情,写代码,比如我给类的成员变量进行赋值)

public class Test {//class表示类,后面跟的是类的名字,类名,Test
	int i;//888
	public static void main(String[] args) {//new 新建,理解.都是表示调用的意思
		//通过类来创建对象,拿到对象名,通过对象名点来调用变量和方法
		//创建对象的格式:类名 对象名 = new 类名();即创建对象是通过new关键字来调用构造方法Test();
		//创建对象会调用到构造方法,但我们没有写构造方法,但是却可以调用,说明系统给我们提供了一个默认无参的构造方法,不写也是写
		Test t = new Test();
		Test t2 = new Test(888);
//		System.out.println(t.i);//0
		
		//给成员变量赋值第一种方式,拿到成员变量通过=号赋值
//		t.i = 666;
//		System.out.println(t.i);//666
		
		//直接在类里面给成员变量赋值,显示初始化
//		System.out.println(t.i);
		
		//因为创建对象会调用到构造方法,那么我们就可以在构造方法里面拿到成员变量,给成员变量赋值,构造方法初始化
		System.out.println(t.i);//888
		System.out.println(t2.i);//999
		
	}
	
	public void method(){
		int i = 999;
		System.out.println("method");
	}
	
	//我们自己写一个构造方法,如果我们写了构造方法,不管有参还是无参,系统就不再提供默认的无参构造方法
	//可以在创建对象的时候给对象进行初始化,给对象所在的类的成员变量进行赋值
	public Test(){//成员变量可以给类的所有方法使用调用,是因为成员变量在类中方法的外面,方法里面都可以看的到,那就可以使用调用!!!
//		System.out.println("666");
//		System.out.println(i);
		i = 666;//无参的构造方法,可以给成员变量赋值,但是这个值写死了,一直都是666
	}
	
	//写一个有参的构造方法,给成员变量赋值,赋值的是一个变量,更加灵活多变
//	public Test(int j){// j = 888;只是形参,现在没有值,这个方法给别人调用的时候回传入实参给他赋值
//		i = j;//888
//	}
	
}

3:封装
	概述:隐藏对象的属性(成员变量)和实现细节(方法),仅仅对外提供公共的访问方式
	为什么要有封装:没有封装,别人(在其他类里面)拿到我的对象名设置我的成员变量的值为一些我不想要的数据,有风险,不安全,不是我想要的数据,
	我不想别人修改,就要用到封装(即封装可以提高代码的安全性)

	如何封装:暂时先用private关键字(封装就是私有private是错误的还有其他手段)去修饰你不想给别人修改的成员变量,private,私有的意思,仅仅在本类中被访问,本类,
	你私有的成员变量所在的类
	代码://如何封装:暂时先用private关键字去修饰你不想给别人修改的成员变量,private,私有的意思,仅仅在本类中被访问
	private String name = "fbb";//null,本类GirlFriend,隐藏对象的属性

	公共的访问方式:写一个用public修饰公有方法,别的类可以直接访问到,比如我想要比人拿到我的成员变量,我就把成员变量当做我这个方法的
	返回值,因为返回值表示的是我这个方法调用完毕得到的结果
	//想别人得到我成员变量的值,即写一个get方法
	public String getName(){//公共的访问方式
//		System.out.println("getName");//我不想输出,而是调用完getName方法得到我成员变量name的值
		//返回值表示一个方法调用完毕得到的结果
		return name;//name就是返回值
	}

	//想别人修改我成员变量的值,即写一个set方法
	public void setName(String n){//提供公共的访问方式,设置成员变量name的值,n = "lbb";公共的访问方式,用来给别人修改我成员变量name的值
		name = n;
	}

	//概述:隐藏对象的实现细节(方法),仅仅对外提供公共的访问方式public修饰的方法
	public void giveMeMoney(int i){//i = 666;
		if (i>=6000) {
			//够
			beauty();//调用方法
		}else {
			System.out.println("对不起你的钱不够");
		}
//		return;//不写也是写,返回,用来结束方法
	}
	
	private void beauty(){//public公有的,修饰的东西在哪里都可以访问,公共的访问方式,private,私有的意思,仅仅在本类中被访问,本类,
		System.out.println("美美哒");
//		return;
	}

	//权限修饰符:private,默认前面什么都不写,protected,public

4:面向对象案例分析
编程就是为了模拟现实生活的事物,解决事物身上的问题
模拟顾客到家具城买家具跟卖家的对话的过程
事物:
	顾客类:
		属性:姓名,号码,钱,商品ID
		行为:告诉卖家你要商品ID,告诉卖家姓名,告诉卖家号码

	卖家类:
		属性:商品名称数组,商品价格数组
		行为:罗列本店商品,告诉顾客想要的商品名称和价格,询问顾客姓名,询问顾客的号码

	家具城:主要是测试类,里面有个main方法,是程序的入口,所有程序都是从main方法里面开始,
		   所以我在main方法里面分别创建顾客类对象,卖家类对象,才能调用各个类里面的变量和方法

总的代码如下:
public class JiajuchengTest {
	public static void main(String[] args) {
		//main方法里面分别创建顾客类对象,卖家类对象,格式:类名 对象名 = new 类名();
		Guke gk = new Guke();//对象名gk  alt /
		Maijia mj = new Maijia();//对象名mj
		
		//拿到对象名有什么用,就可以通过对象名点来调用这个对象对应的类里面变量和方法,怎么调用,哪里不会点哪里
		//卖家要罗列本店商品
		mj.showShopList();//表示我调用了mj对象名对应的类Maijia里面的showShopList方法,F3
		
		//顾客看到商品,顾客就要告诉卖家想要的商品的ID,商品的id对应起来东西就是商品名称数组里面索引
		//我想要商品id是随机产生的,用随机数类Random,通过类名来创建对象,通过对象名.来调用方法
		Random r = new Random();//对象名是r
		int id = r.nextInt(4);//表示我产生随机数的范围是包含0-3,0,1,2,3
		
		gk.tellId(1);//把1存到顾客类里面成员变量id里面去了
//		System.out.println(gk.id);//1,卖家如何知道我顾客类里面成员变量id呢,只要卖家类拿到我顾客类对象名gk
		
		//假如卖家类已经拿到顾客类商品id,告诉顾客商品名称和商品的价格
		//返回值表示方法调用完毕得到的价格,调用完这个方法想得到对应ID的商品价格,就把这个对应id商品价格当做方法的返回值返回12.3;
		double shopMoney = mj.tellShopInfo(gk);
		
		//顾客已经看到价格12.3,比较一下自己的钱跟这个价格的大小,如果大于等于钱够买买买,不够就说再见
		double gkMoney = gk.money;
		if (gkMoney>=shopMoney) {
			System.out.println("买买买");
			//卖家看到顾客想买,询问顾客姓名,号码,顾客回答姓名回答号码
			mj.askName();
			mj.askNum();
			
			gk.tellName();
			gk.tellNum();
			
		}else {
			System.out.println("see you next time 886");
		}
	}
}

class Guke {
	String name;
	String num;
	double money= 666.6;
	int id;//1
	
	public void tellId(int i){//i = 1;这里先写i,不要写成id,否则要用this.id才能赋值成功,这是明天的内容
		id = i;//1
	}
	
	public void tellName(){
		System.out.println("我的名字是刘得花");
	}
	
	public void tellNum(){
		System.out.println("13866666666");
	}
}

/**
 * @author Administrator
 * 	属性:商品名称数组,商品价格数组
		行为:罗列本店商品,告诉顾客想要的商品名称和价格,询问顾客号码,询问顾客的姓名
 */
class Maijia {
	String[] names = {"大沙发","小沙发","桌子","龙椅"};
	double[] prices = {23.4,12.3,55.0,8888.8};
	
	public void showShopList(){
		System.out.println("欢迎光临,本店有以下商品:");
		System.out.println(names[0]+","+names[1]+","+names[2]+","+names[3]);
	}
	
	public double tellShopInfo(Guke gk){//gk2 = gk,对象名,存的是对象的地址值,同一个地址值不是找到同一个对象
		//假如卖家类以及拿到顾客类商品id,告诉顾客商品名称和商品的价格,,只要卖家类拿到我顾客类对象名gk
		int id = gk.id;//1,表示调用gk对象名对应的类Guke里面的成员变量id
		System.out.println("你想要的商品的名字是"+names[id]);
		System.out.println("你想要的商品的价格是"+prices[id]);
		//返回值表示方法调用完毕得到的价格,调用完这个方法想得到对应ID的商品价格,就把这个对应id商品价格当做方法的返回值返回
		return prices[id];//12.3
	}
	
	public void askName(){
		System.out.println("老板你的姓名是?");
	}
	
	public void askNum(){
		System.out.println("老板你的号码是?");
	}
	
}

如何产生一个一定范围的随机数,代码如下:
//我想要商品id是随机产生的,用随机数类Random,通过类名来创建对象,通过对象名.来调用方法
	Random r = new Random();//对象名是r
	int id = r.nextInt(4);//表示我产生随机数的范围是包含0-3,0,1,2,3

