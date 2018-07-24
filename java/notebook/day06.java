1:黑马文字版RPG---模拟英雄坛说游戏
	概述:角色扮演游戏
	游戏过程:玩家跟电脑人对话,一言不合就开干,双方你打我我打你,血量减减,直到有一个人的血量小于或者等于0,战斗结束
	角色:玩家,电脑人
	业务分析:
	玩家类:
		属性:姓名,血量
		行为:对话,打电脑人,受伤

	电脑人类:
		属性:姓名,血量
		行为:对话,受伤,打回玩家

	测试类:要有一个main方法程序才能运行起来,实时刷新双方血量的方法,用输出语句来模拟

2:this关键字//总结:this就代表对象名,存的是对象的地址值,就能找到对象,.来调用使用拿到对象里面的成员变量和成员方法
	概述:代表本类当前对象的引用(对象名),通俗点,谁来调用我,我就代表谁

	问题:当成员变量跟局部变量重名的时候,我调用set方法设置成员变量的值不成功
	原因:在Java里面使用变量遵循这么一个原则,就近原则:谁靠近我,我就使用谁,局部变量有就使用局部变量,否则使用成员变量,
	     如果都没有就报错
	解决:把成员变量名字跟局部变量的名字不一样;如果我一定要成员变量跟局部变量重名怎么办:
	     只要在你想表示为成员变量的变量之前加上this.
		 //这样这个变量就变成成员变量
	Person p = new Person();
	p.setName("baby");
	public void setName(String name){//n = "baby";
		this.name = name;//this.name这个name就变成成员变量的name,而不再是局部变量,这样就可以给成员变量设置值成功
		//p.name = name;
	}
	理解:对应类Person,有多个对象,比如Person p = new Person();//this,本类当前对象的引用p,延伸代表p2,p3,p...,谁来调用我,我就代表谁

	数据类型:
		基本数据类型:byte,short,int,long,double,float,char,boolean,不是基本数据类型 就一定 是 引用数据类型
			基本数据类型存的是值

		引用数据类型:包括类,数组,接口,凡是可以通过new关键字new出来都是,比如String引用数据类型
			引用数据类型里面存的是地址值,暂时理解为对象的地址值
		引用:就是引用数据类型的变量,比如String s;//s就是引用;Person p = new Person();//p就是引用,对象名,存的是对象的地址值
		     通过对象的地址值就可以找到对象,找到对象就可以使用对象里面的变量和方法,通过对象名(对象).来调用,哪里不会哪里
	
3:static关键字//一个类可以创建多个对象,共享就是多个对象都用同一个东西
	概述:static,静态(共享的)的意思,如果一个类的成员,包括变量和方法,想给类的所有对象共享,就使用static修饰
	特点://记忆
		1.随着类的加载而加载//记忆(类只加载一次,因为我只要一个类就可以创建多个对象,java里面看到类写出来,类就加载了)
		2.优先于对象存在(理解:对象是通过类来创建的,类的加载优先于对象存在)
		3.如果一个类的成员,包括变量和方法,想给类的所有对象共享,就使用static修饰
		4.还可以通过类名.来调用(static修饰的东西随着的类的加载而加载,类加载的时候已经存在了,存在就可以使用!!!)
	
	注意事项://记忆
		1.静态方法里面没有this关键字(this表示当前对象的引用,静态方法是static修饰的东西随着的类的加载而加载,
		  类的加载优先于对象存在,这个时候还没有对象,因为对象是通过类来创建的,所以没有对象的引用this)

		2.静态方法,除非在里面创建对象,否则只能调用静态成员(静态的成员变量和静态的成员方法),调用简记,静态只能调用静态
		 (只有用static修饰的东西随着的类的加载而加载,类加载的时候已经存在了,存在才可以调用使用!!!)

	总结://理解.不用特意去背
		 类的加载:我们写的源文件.java文件经过编译会生成类名.class字节码文件,运行的时候把字节码文件.class(对应就是类)加载进入内存,
		          内存执行的是运行中的数据,里面的数据在程序运行完毕就从内存中消失了,所以每运行一次类就只加载一次,为了便于你记住,
				  在eclipse里面,是自动编译的,那么类在什么时候加载呢,当你运行时看到类名第一次写在哪里,类就在哪里加载了,只加载一次!

		 事物属性对应Java里面就是成员变量,写在类中,方法外,成员变量是属于对象的,随着对象的创建而创建,
		 并且每一个对象里面都有各自的一份成员变量,
	     成员变量属于对象,所以又叫对象变量,实例变量

	     事物的行为对应Java里面的成员方法,写在类中{},成员方法随着对象创建并且调用而存在
		 成员变量和成员方法只能被对象名(对象)调用,成员方法还叫对象方法,实例方法

		 成员变量用static静态修饰就变成了静态变量,还叫类变量(随着类的加载而加载),静态成员变量属于类的,不属于对象,
		 类加载的时候优先于对象存在,静态变量只有一份,因为随着类的加载而加载,类只加载一次,因为创建一个类就可以创建多个对象
		 也就是说静态变量在类加载的时候已经存在了并且只有一份,对象是指类的加载之后通过类来创建的,可以给类的所有对象所共享

		 成员方法用static去修饰就变成了静态方法,属于类的,还叫类方法,随着类的加载而加载并且加载一次,类加载的时候已经存在,那就
		 可以通过类名点来调用,
		 用static修饰的东西,都是随着类的加载而加载,类加载的时候已经存在了,就可以通过类名.来调用
		 并且类的加载优先于对象存在,对象是在类加载之后创建的,所以对象也可以通过对象名.来调用static修饰的东西

4:final关键字
	概述:最终的意思,最后一个的意思,用final修饰的变量是最终变量(常量),只能被赋值一次
	注意事项:成员变量如果被final修饰,它的默认值无效,要手动给他赋值(如果成员变量的默认值如果有效但是用final修饰不能被再次赋值,
	只能使用默认值,没有意义)
	代码:
	public class FinalTest {
	//	final static int i ;//报错,成员变量有默认值的,但是用final修饰的成员变量的默认值无效,要手动赋值,
	//  用final修饰的变量是最终变量(常量),只能被赋值一次
		final static int i  = 666;//手动赋值,成员变量有默认值的,但是用final修饰的成员变量的默认值无效,要手动赋值,
		//用final修饰的变量是最终变量(常量),只能被赋值一次

		public static void main(String[] args) {
			//基本数据类型的局部变量的情况
	//		final int i = 666;//用final修饰的变量是最终变量(常量),只能被赋值一次
	//		i = 999;//报错,用final修饰的变量是最终变量(常量),只能被赋值一次,上面已经赋值一次了
			
	//		i = 999;
	//		System.out.println(i);
			
			//引用数据类型的局部变量,用final修饰的变量是最终变量(常量),只能被赋值一次
			final FinalTest t = new FinalTest();
			t =  new FinalTest();
			System.out.println(t);
			
		}
	}

	//发现用final修饰的变量只能赋值一次,里面的值永远都是固定的,叫做常量,里面的值不能发生变化的量
	常量:在程序的运行过程中,其值不能发生改变的量
	分类:
		字面值常量:从字面上就可以知道他的值,比如0就是0,"abc"就是"abc",值已经固定死了,只能有一个
		自定义常量:就是用final修饰的变量最终变量(常量),因为之能被赋值一次,值已经固定死了,只能有一个
				   比如final int i = 666;i就是自定义常量,一般会把i这个常量写成大写的,这个是个规范不是规则,建议这样做
				       final int I = 666;syso(I);//一般我通过I就知道他表示一个常量

5:Random类的使用
	概述:Random是个类,表示随机数类,通过类名来创建对象,拿到对象名点来调用这个类里面的变量和方法,
	如果这个变量或者方法是用static修饰的,还可以用类名点来调用也可以通过对象名点来调用
	因为这个类是在util包下的,所以要导包(除了lang包下的不用导),就是在类的上面用import关键字表示你要使用哪个包下的哪个类,
	比如:import java.util.Random;(不用记那么多统一用alt /如果要导包就自动帮你导,不用导就不导,推荐使用alt /)
	(当然导包你也可以用鼠标点击生成或者用整理包快捷键ctr shift o,没有帮你导包,有多余的包帮你删掉)
	
	最重要是这个方法得到0到一定范围-1的随机整数:
	代码:
	Random r = new Random();//对象名是r,创建对象格式代码套路 alt/选类 对象名 = new alt /选构造方法,得到对象名点来调用方法
	int i = r.nextInt(4);//产生一个随机数,范围在包含0-3之间,0,1,2,3
	System.out.println(i);

6:补充内容
	A.同一个包下不能有两个相同名字的类,包其实就是一个文件夹
	B.打印一个引用数据类型的变量默认会调用它的toString()方法,不写也是写,系统给你写,所以下面输出的效果是一样的
	  比如,Person p = new Person();System.out.println(p);System.out.println(p.toString());

7:角色扮演游戏总的代码如下
package day06_模拟角色扮演游戏_杨文君;
import java.util.Random;
/**
 * @author ywj
 * 概述:角色扮演游戏
	游戏过程:玩家跟电脑人对话,一言不合就开干,双方你打我我打你,血量减减,直到有一个人的血量小于或者等于0,战斗结束
	角色:玩家,电脑人
	业务分析:
	玩家类:
		属性:姓名,血量
		行为:对话,打电脑人,受伤

	电脑人类:
		属性:姓名,血量
		行为:对话,受伤,打回玩家

	测试类:要有一个main方法程序才能运行起来,实时刷新双方血量的方法,用输出语句来模拟
 */
public class GameTest {
	public static void main(String[] args) {
		//创建对象,alt /
		Wanjia wj = new Wanjia("小男孩", 100);//对象名 wj
		Diannaoren dnr = new Diannaoren("小女孩", 100);//对象名dnr
		
//		//实时刷新双方血量的方法,用输出语句来模拟
//		System.out.println("=============================");
//		System.out.println("           "+wj.getBlood()+"vs"+dnr.getBlood());
//		System.out.println("=============================");
//		//玩家跟电脑人对话,一言不合就开干,双方你打我我打你,血量减减,直到有一个人的血量小于或者等于0,战斗结束
		wj.talk();
		dnr.talk();
		//一言不合就开干,打,受伤
		wj.hitdnr(dnr);//血量减减,待会做
		dnr.hurt();
		
		dnr.hitwj(wj);//血量减减,待会做
		wj.hurt();
		//希望上面这坨代码不断调用,不断做事情,循环,直到有一个人的血量小于或者等于0,战斗结束
		while (true) {
			//程序太快了,希望慢一点,就用下面的代码,
//			try {
//				Thread.sleep(1000);//程序睡着了1秒,醒了,
//			} catch (InterruptedException e) {
//				// TODO 自动生成的 catch 块
//				e.printStackTrace();
//			}
			
			//直到有一个人的血量小于或者等于0,战斗结束
			if (wj.getBlood()<=0 || dnr.getBlood()<=0) {
				//现在血量同时为0不好,修改打人方法,如果你已经挂了你的血量小于等于0,就不能打人,不走掉血的逻辑
				
				//我血量为负数不好,改为0
				if (wj.getBlood()<=0) {
					wj.setBlood(0);
				}
				
				if (dnr.getBlood()<=0) {
					dnr.setBlood(0);
				}
				
				//要记得重新刷新一遍血量
				System.out.println("=============================");
				System.out.println("           "+wj.getBlood()+"vs"+dnr.getBlood());
				System.out.println("=============================");
				
				System.out.println("战斗结束,世界和平");
				break;//跳出整个循环,循环不再执行,下面的代码不走
			}
			
			//实时刷新双方血量的方法,用输出语句来模拟
			System.out.println("=============================");
			System.out.println("           "+wj.getBlood()+"vs"+dnr.getBlood());
			System.out.println("=============================");
			//玩家跟电脑人对话,一言不合就开干,双方你打我我打你,血量减减,直到有一个人的血量小于或者等于0,战斗结束
			wj.talk();
			//程序太快了,希望慢一点,就用下面的代码,
			try {
				Thread.sleep(1000);//程序睡着了1秒,醒了,
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
			dnr.talk();
			//程序太快了,希望慢一点,就用下面的代码,
			try {
				Thread.sleep(1000);//程序睡着了1秒,醒了,
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
			//一言不合就开干,打,受伤
			wj.hitdnr(dnr);//血量减减,待会做
			//程序太快了,希望慢一点,就用下面的代码,
			try {
				Thread.sleep(1000);//程序睡着了1秒,醒了,
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			dnr.hurt();
			//程序太快了,希望慢一点,就用下面的代码,
			try {
				Thread.sleep(1000);//程序睡着了1秒,醒了,
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
			dnr.hitwj(wj);//血量减减,待会做
			//程序太快了,希望慢一点,就用下面的代码,
			try {
				Thread.sleep(1000);//程序睡着了1秒,醒了,
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			wj.hurt();
			//程序太快了,希望慢一点,就用下面的代码,
			try {
				Thread.sleep(1000);//程序睡着了1秒,醒了,
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
		}
		
	}
}

class Wanjia {
	String name;//"小男孩", 100
	int blood;
	
	//有备无患,建议,写好无参有参构造方法,get和set方法,自动生成
	//alt shift s,分别按c无参构造方法
	public Wanjia() {
		
	}

	//alt shift s,分别按o有参构造方法
	public Wanjia(String name, int blood) {//"小男孩", 100
		this.name = name;
		this.blood = blood;
	}

	//alt shift s,分别按rget和set方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBlood() {
		return blood;
	}

	public void setBlood(int blood) {
		this.blood = blood;
	}
	
	//行为:对话,打电脑人,受伤
	public void talk(){
//		System.out.println(name+":"+"约么?");
		
		Random r = new Random();
		int index = r.nextInt(Ci.talk.length);//0-Ci.talk.length-1,索引范围
		System.out.println(name+":"+Ci.talk[index]);
	}
	
	public void hitdnr(Diannaoren dnr){//电脑人对象名dnr拿到了
		//现在血量同时为0不好,修改打人方法,如果玩家已经挂了你的血量小于等于0,就不能打人,不走掉血的逻辑
		if (this.getBlood()<=0) {//this=wj,对象名,谁来调用我,我就代表谁
			return;//返回,方法已经结束了,下面的代码就不走了
		}
		
		//血量减减,待会做,电脑人血量减,随机数
		Random r = new Random();
		int lost = r.nextInt(51)+2;//2-52
		dnr.blood -= lost;//dnr.blood = dnr.blood-5;
		
//		System.out.println(name+"往"+dnr.getName()+"打了一拳");
		
		Random r2 = new Random();
		int index = r2.nextInt(Ci.hit.length);//0-Ci.hit.length-1,
		System.out.println(Ci.hit[index].replace("N", name).replace("SB", dnr.getName()));
	}
	
	public void hurt(){
//		System.out.println(name+":啊,蛋疼");
		
		Random r = new Random();
		int index = r.nextInt(Ci.hurt.length);//0-Ci.hurt.length-1
		System.out.println(Ci.hurt[index].replace("*", name));
	}
	
}

/**
 * @author ywj
 * 	电脑人类:
		属性:姓名,血量
		行为:对话,受伤,打回玩家
 */
class Diannaoren {
	String name;//"小女孩", 100
	int blood;
	
	//alt shift s,分别按c,o,r
	public Diannaoren() {
		
	}

	public Diannaoren(String name, int blood) {//"小女孩", 100
		this.name = name;
		this.blood = blood;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBlood() {
		return blood;
	}

	public void setBlood(int blood) {
		this.blood = blood;
	}
	
	//行为:对话,受伤,打回玩家
	public void talk(){
		//System.out.println(name+":"+"蜀黍,咱们不约!!!");
		
		Random r = new Random();
		int index = r.nextInt(Ci.talk.length);//0-Ci.talk.length-1,索引范围
		System.out.println(name+":"+Ci.talk[index]);
	}
	
	public void hurt(){
//		System.out.println(name+":啊,好痛");
		
		Random r = new Random();
		int index = r.nextInt(Ci.hurt.length);//0-Ci.hurt.length-1
		System.out.println(Ci.hurt[index].replace("*", name));
	}
	
	public void hitwj(Wanjia wj){//玩家的对象名wj拿到了
		//现在血量同时为0不好,修改打人方法,如果电脑人已经挂了你的血量小于等于0,就不能打人,不走掉血的逻辑
		if (this.getBlood()<=0) {//this=dnr,对象名,谁来调用我,我就代表谁
			return;//返回,方法已经结束了,下面的代码就不走了
		}
		
		Random r = new Random();
		int lost = r.nextInt(51)+2;//2-52
		wj.blood -= lost;//wj.blood = wj.blood-5;
		
//		System.out.println(name+"往"+wj.getName()+"踢了一脚");
		
		Random r2 = new Random();
		int index = r2.nextInt(Ci.hit.length);//0-Ci.hit.length-1,
//		System.out.println(Ci.hit[index]);
		System.out.println(Ci.hit[index].replace("N", name).replace("SB", wj.getName()));
	}
	
}

package day06_模拟角色扮演游戏_杨文君;
/**
 * @author ywj
 * 存放词语的类
 */
public class Ci {
	public static final String[] talk = {"我什么都不知道,打死你我也不知道", 
			"今天是个好天气,哈哈哈", 
			"我正忙着呢,找别人唠嗑去吧", 
			"再看我,我就把你吃掉",
			"good morning", "long time no see" };
	
	public static final String[] hurt = {"结果一击命中，*被打肿了一块老高 ",
			"结果一击命中，*痛苦地闷哼了一声 ",
			"结果『砰』的一声，*退了两步 ",
			"结果*连退了好几步，差一点摔倒 ",
			"结果重重的击中，*吐出一口鲜血 ",
			"结果一声巨响，*像捆稻草般飞了出去  ",
			"结果一击命中，*痛得弯下腰 ",
			"结果*痛苦地闷哼了一声，显然受了点内伤 ",
			"结果*摇摇晃晃，一跤摔倒在地 ",
			"结果*脸色一下变得惨白，连退了好几步 ",
			"结果『轰』的一声，*口中鲜血狂喷而出 ",
			"结果*一声惨叫，像滩软泥般塌了下去 ",
			"结果*被抓出了五条淡淡的血痕 ",
			"结果一爪命中，*被抓出了五条血沟 ",
			"结果抓下了*一小块皮肉 ",
			"结果*皮开肉破，鲜血流了下来 ",
			"结果*被抓出了五个血洞，鲜血急喷 ",
			"结果*被连皮带肉抓下了一大块，露出了骨头 ",
			"结果『喀嚓』一声，*的骨头被抓得粉碎 ",
			"结果对*造成了轻微的伤害 ",
			"结果对*造成了一处伤害 ",
			"结果对*造成了颇为严重的伤害 ",
			"结果对*造成了相当严重的伤害 ",
			"结果对*造成了十分严重的伤害 ",
			"结果对*造成了极其严重的伤害 ",
			"结果对*造成了非常可怕的严重伤害  ",
			"结果*被割出了一道伤口 ",
			"结果*被划出了一道血淋淋的伤口 ",
			"结果*被划出了一道又长又深的伤口 ",
			"结果*被砍出了一道深及见骨的可怕伤口 "};
	
	public static final String[] hit = {"N一招「回身劈山刀」，左足踏上一步，蓦地里横刀转身，呼的一声，向SB、头削去。",
			"N踏前数步，「上步劈山」，刀带劲风由上而下劈向SB。",
			"N双手抱刀，急退两步翻身跃起，一招「童子拜佛」，力劈SB。",
			"N一招「朝阳刀」，直劈SB、头，刀身带动劲风直刮得SB耳边生疼。",
			"N一招「削耳撩腮」舞个刀花，SB上盘要害尽被笼罩。",
			"N急踏两步，一招「上步撩刀」，由下而上撩向SB小腹。",
			"N刀交左手「仙人指路」，直刺SB，同时右手骈指点向SB、头。",
			"N一招「夜叉探海」，竟以刀做剑，中宫直进刺向SB。",
			"N一招「背心钉」，转到SB的身后，一掌猛向SB背心灵台穴拍去。",
			"N一招「游空探爪」，飞起身形自半空中变掌为抓锁向SB、头。",
			"N大喝一声，身形下伏，一招「劈雷坠地」，捶向SB双腿。",
			"N运气于掌，一瞬间掌心变得血红，一式「掌心雷」，推向SB。",
			"N阴手翻起阳手跟进，一招「没遮拦」，结结实实的捶向SB的头。",
			"N上步抢身，招中套招，一招「劈挂连环」，连环攻向SB。",
			"N走天阵，跨乾位，使一招「天道无常」，抖臂发劲一掌攻向SB。",
			"N转地阵，居坤位，一招「地震三岗」，直取SB。",
			"N上风阵，取巽位，一招「风起云涌」，掌势变幻击向SB、头。",
			"N过云阵，居震位，一式「云海茫茫」，双掌交错击向SB、头。",
			"N脚下方位变幻，一招「飞龙居坎」，左掌斜引右掌穿出，拍向SB、头。",
			"N脚踏八卦方位，一招「鸟翔归离」，却步抽身双掌一前一后相继击向SB。",
			"N步法虽急但八卦方位丝毫不乱，一招「蜿盘退艮」，守中带攻右掌划向SB、头。",
			"N身法越转越快，一瞬间踏遍天地风云四门，「四正四奇」，连攻八掌。",
			"N默念口诀，由归寐转无妄，自同人趋大有，一招「四开四阖」，连出十六掌。"};
	
}







