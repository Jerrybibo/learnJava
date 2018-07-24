1:eclipse的使用//了解不用背,知道有这么回事就可以,最好回去做一遍
	概述:常用开发工具,写代码用的工具,自带编译和运行功能,集成开发环境,IDE,用Java语言来写,花了几千万美金
	绿色压缩包,解压得到一个文件夹打开,找到里面以eclipse.exe结尾的文件,双击它,然后就可以打开eclipse这个软件了
	打开弹框,提示选择一个工作空间,工作空间其实就是一个文件夹,用来存放我们写的代码-点浏览-弹框-找到一个文件夹选择为工作空间
	打开工作空间,弹出欢迎界面,点x关闭它
	
	1.新建项目:点文件-新建-Java项目-弹框-写好项目名-点完成-项目就建立好了
	2.展开项目-找到下面src文件夹选中-鼠标右键-新建-类-弹框-写好你的类名(上面有个包,包其实也是一个文件夹)-点完成
	3.新建一个类,如何把一个类运行起来呢,一定要在这个类里面写一个main方法(程序入口开始执行),快捷键写m 按 alt / 提示选择
	  public static void main(String[] args){//在你写好的文件里面鼠标右键-运行方式-Java应用程序
		//args可以写成abc等等,只要是个合法的标识符,组成规则,注意事项
	  }

	4.如何设置字体:窗口-首选项-弹框-输入字体-找到颜色和字体-找到(调试)Java文件夹展开-(控制台字体)Java文本编辑器双击打开-
	  选择字体大小为12-确定-应用-确定
	
	5.窗口乱了如何还原:窗口-perspective-复位透视图-弹框-选是

	6.如何把我的项目发给别人:在eclipse里面选中你的项目-鼠标右键-复制-粘贴发到你的计算机位置,然后就可以发送给别人了

	7.如何导入别人写好的项目到我的eclipse软件里面:文件-导入-弹框-找到一个General文件夹把他展开-现有项目到工作空间-弹框-点浏览-
	  选你的项目文件夹-最好勾选复制项目到我的工作空间

	8.如何导入一个eclipse里面已经有的项目:
	  第一步把你的要导入的项目的名字改为跟eclipse里面项目名字不一样,第二步找到你要导入项目打开它找到一个.project结尾的文件-
	  用文本编辑器打开-找到里面一个叫name的标签,把name的值改为跟你要导入的项目的名字一样

	9.如何删除一个项目:在eclipse里面找到你的项目选中-鼠标右键-删除-如果勾选了删除就没了,具体看你需求
	
2:循环
	概述:循环就是不断的做事情,可以有一定的终止条件,也可以不终止(死循环)
	分类://在控制台输出1到10
	int i = 1;//初始化条件
	while(i<=10){//判断条件
		System.out.println(i);//循环体,就是你要做事情
		i++;//控制条件
	}
	执行流程:首先执行初始化条件一次,执行判断条件,条件满足结果是true的时候进来执行循环体,我想改变条件,执行控制条件,
	         条件就改变了,就要重新判断条件,条件满足就再次进来,如果条件(一开始)都不满足结果是false就不进来执行循环,循环结束了

	int i = 1;//初始化条件
	do {
		System.out.println(i);//循环体,就是你要做事情
		i++;//控制条件
	}
	while (i<=10);//判断条件
	执行流程:首先执行初始化条件一次,直接执行循环体,想要条件改变,执行控制条件,条件改变,就要判断条件是否满足,
	         如果条件满足结果是true,就继续执行循环体,控制条件,如果条件不满足结果是false那就不再进来执行循环,循环结束了
			 (从中do...while至少执行一次循环体,控制条件)

	for(int i = 1;i<=10;i++){//int i = 1;初始化条件	i<=10;判断条件	i++控制条件 i:1-10
		System.out.println(i);//循环体,就是你要做事情
	}
	执行流程:首先执行初始化条件一次,执行判断条件,条件满足结果是true的时候进来执行循环体,我想改变条件,执行控制条件,
	         条件就改变了,就要重新判断条件,条件满足就再次进来,如果条件(一开始)都不满足结果是false就不进来执行循环,循环结束了

	面试题:
		1.do...while循环跟其他两种循环的区别:
		  do...while一开始不用判断条件直接执行循环体,其他两种循环都要先判断条件成立再进来执行循环体,不成立不进来循环就结束了,
		  do...while比其他两种循环至少执行了一次循环体

		2.for循环与其他两种循环的区别:
		  for循环里面定义变量在循环的外面不能进行访问执行,循环里面循环就从内存中消失,提高内存使用效率
		  其他两种循环的变量在循环外面,循环结束后还可以继续使用

		3.什么时候使用for循环,什么时候使用while循环?
		  如果循环次数固定的时候推荐for循环,因为for循环里面定义变量在循环的外面不能进行访问执行,
		  循环完里面循环就从内存中消失,提高内存使用效率
		  如果循环的次数不固定推荐使用while循环,如果你不知道使用哪种循环,就用for循环,原因同上

		4.你能写出三种不同的死循环(循环就是不断做事情,死循环比较特殊,不终止,一直做)
		  while (true) {
			//循环体,就是你要做事情
		  }

		  do {
			//循环体,就是你要做事情
		  } while (true);

		  for (;; ) {
			//循环体,就是你要做事情
		  }

	循环控制跳转语句:
	break://表示跳出整个循环,循环不再执行,下面的代码不走
	代码:
	public class Itheima {
		public void test(){
			for (int i = 1; i <=5; i++) {//
				if (i==4) {
					break;//表示跳出整个循环,循环不再执行,下面的代码不走
				}
				
				System.out.println(i);//1,2,3
			}
			
		}
	}

	continue://跳过本次循环下面的代码不走,继续下一次循环
	代码:
	public class Itheima {
		public void test(){
			for (int i = 1; i <=5; i++) {
				if (i==4) {
					continue;//表示跳出本次循环,循环继续执行,本次不执行下面代码不走,其他次执行(跳过本次循环,继续下一次循环)
				}
				
				System.out.println(i);//1,2,3,5
			}
			
		}
	}

	循环案例加强:
		打星星矩形:
		for (int i=1;i<=5 ; i++) {
			for (int j=1;j<=5 ;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

		打正三角形:
		for (int i=1;i<=5 ; i++) {
			for (int j=1;j<=i ;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

		九九乘法表:
		for (int i=1;i<=9 ; i++) {
			for (int j=1;j<=i ;j++) {
				System.out.print(j+"x"+i+"="+i*j+"	");
			}
			
			System.out.println();
		}

		求1-100之间的偶数
		方式一:
			for (int i = 1; i <=100; i++) {
					if (i%2==0) {
						System.out.println(i);
					}
			}

		方式二:
			for (int i = 2; i <=100; i+=2) {//i = i+2;
					System.out.println(i);
			}

		求1-100之间的偶数的和:
		方式一:
			int sum = 0;
			for (int i = 1; i <=100; i++) {
					if (i%2==0) {
						sum+=i;//sum = sum + i;
					}
			}

			System.out.println(sum);

		方式二:
			int sum = 0;
			for (int i = 2; i <=100; i+=2) {//i = i+2;
				sum +=i;//sum = sum + i;
			}

			System.out.println(sum);

	数组遍历:用循环来得到数组里面的每一个元素,数组名[索引编号];只要我拿到了每一个索引编号就可以拿到每一个元素
	         只要我知道数组索引编号的范围,最小索引0,最大索引长度-1:数组名.length-1;for循环可以表示一定范围,比如1-5;
		int [] arr = {1,2,3};
		for (int i = 0; i <=arr.length-1; i++) {//i:0 +1-arr.length-1;i代表每一个索引
			System.out.println(arr[i]);
		}
		//上面的写法跟下面的效果是一样的
		for (int i = 0; i <arr.length; i++) {//i:0 +1-arr.length-1;i代表每一个索引
				System.out.println(arr[i]);
		}//在eclipse可以for alt /选来快速生成遍历得到数组里面的每一个元素

	循环最值:求数组元素中的最大值,用打擂台的方式,拿到数组的第一个元素当做最大值,不断的跟数组里面的其他元素进行比较,用循环
		int [] arr = {1,0,0,8,6};
		//拿到数组的第一个元素当做最大值,
		int max = arr[0];//1
		//不断的跟数组里面的其他元素进行比较,用循环
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				max = arr[i];//循环,不断的比
			}
		}
		
		System.out.println("最大值是"+max);
	
	/**
	 * @author ywj 5个元素 int[] arr = {1,0,0,8,6};//arr[0],arr[1],arr[2],arr[3],arr[4]
	 * 
	 * 冒泡排序:相邻元素两两比较,大的往后排,第一次比较最大值在最大索引处,这件事情每个元素都可以做一遍:
	 * 第一次比较:arr[0]跟arr[1]比,arr[1]跟arr[2]比,arr[2]跟arr[3]比,arr[3]跟arr[4]比   //arr[4]
	 * 第二次比较:arr[0]跟arr[1]比,arr[1]跟arr[2]比,arr[2]跟arr[3]比//arr[3]
	 * 第三次比较:arr[0]跟arr[1]比,arr[1]跟arr[2]比//arr[2];
	 * 第四次比较:arr[0]跟arr[1]比,//arr[1];
	 */
	public class 数组排序冒泡排序 {

	public static void main(String[] args) {
		int[] arr = {1,0,0,8,6};//5
		//简单版本
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				//相邻元素,如果你比我大,交换位置,你我他
				if (arr[j]<arr[j+1]) {//j+1<arr.length;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		//优化版本
//		for (int i = 0; i < arr.length-1; i++) {//i:0123
//			for (int j = 0; j < arr.length-1-i; j++) {
//				//相邻元素,如果你比我大,交换位置,你我他
//				if (arr[j]<arr[j+1]) {//j+1<arr.length;
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
		
		for (int i = 0; i < arr.length; i++) {
			int j = arr[i];
			System.out.println(j);
		}
		
		
		// 冒泡排序:相邻元素两两比较,大的往后排,第一次比较最大值在最大索引处,这件事情每个元素都可以做一遍:
	    //第一次比较:arr[0]跟arr[1]比,arr[1]跟arr[2]比,arr[2]跟arr[3]比,arr[3]跟arr[4]比   //arr[4]
//		for (int i = 0; i <4; i++) {//i:0,1,2,3
//			for (int j = 0; j < arr.length-1-i; j++) {//j0123
//				if (arr[j]>arr[j+1]) {//j+1<arr.length;-1为了防止索引越界j当前元素,j+1表示隔壁元素
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}//这坨代码都一样,变量,第一次是0,二1,三2,四3
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			int j = arr[i];
//			System.out.println(j);
//		}
		
		//第一次比较:arr[0]跟arr[1]比,arr[1]跟arr[2]比,arr[2]跟arr[3]比,arr[3]跟arr[4]比   //arr[4]
//		for (int j = 0; j < arr.length-1-0; j++) {//j0123
//			if (arr[j]>arr[j+1]) {//j+1<arr.length;-1为了防止索引越界j当前元素,j+1表示隔壁元素
//				int temp = arr[j];
//				arr[j] = arr[j+1];
//				arr[j+1] = temp;
//			}
//		}//这坨代码都一样,变量,第一次是0,二1,三2,四3
//		
//		//第二次比较:arr[0]跟arr[1]比,arr[1]跟arr[2]比,arr[2]跟arr[3]比//arr[3]
//		for (int j = 0; j < arr.length-1-1; j++) {//j0123
//			if (arr[j]>arr[j+1]) {//j+1<arr.length;-1为了防止索引越界j当前元素,j+1表示隔壁元素
//				int temp = arr[j];
//				arr[j] = arr[j+1];
//				arr[j+1] = temp;
//			}
//		}
//		
////	第三次比较:arr[0]跟arr[1]比,arr[1]跟arr[2]比//arr[2];
//		for (int j = 0; j < arr.length-1-2; j++) {//j0123
//			if (arr[j]>arr[j+1]) {//j+1<arr.length;-1为了防止索引越界j当前元素,j+1表示隔壁元素
//				int temp = arr[j];
//				arr[j] = arr[j+1];
//				arr[j+1] = temp;
//			}
//		}
//		
////	第四次比较:arr[0]跟arr[1]比,//arr[1];
//		for (int j = 0; j < arr.length-1-3; j++) {//j0123
//			if (arr[j]>arr[j+1]) {//j+1<arr.length;-1为了防止索引越界j当前元素,j+1表示隔壁元素
//				int temp = arr[j];
//				arr[j] = arr[j+1];
//				arr[j+1] = temp;
//			}
//		}
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		//交换位置,我你它
//		int wo = 666;
//		int ni = 222;
//		int ta = wo;//666
//		wo = ni;
//		ni = ta;
//		
//		System.out.println(wo);//222
//		System.out.println(ni);//666
		
//		int[] arr = {1,0,0,8,6};//5
		
		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length-1; j++) {
//				if (arr[j]<arr[j+1]) {//j+1<arr.length;
//					//交换位置,你我他
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			int j = arr[i];
//			System.out.println(j);
//		}
		
		//冒泡排序,相邻元素两两比较,大的往后排(如果前一个元素比隔壁元素大交换位置),第一次比较最大值在最大索引处,
		//这件事情每个元素都可以做一遍:
		//arr[0]跟arr[1]比,arr[1]跟arr[2]比,arr[2]跟arr[3]比,arr[3]跟arr[4]比   //arr[4],做四次
		
//		for (int i = 0; i < arr.length; i++) {//0-4,比较5次数
//			//arr[0]跟arr[1]比,arr[1]跟arr[2]比,arr[2]跟arr[3]比,arr[3]跟arr[4]比   //arr[4] 
//			for (int j = 0; j < arr.length-1; j++) {//j:0-3,比较过程
//				if (arr[j]>arr[j+1]) {//j+1-1<arr.length-1;
//					//相邻元素交换位置,我你它
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			int j = arr[i];
//			System.out.println(j);
//		}
		
		
//		for (int i = 0; i <arr.length-1; i++) {
//			for (int j = 0; j < arr.length-1; j++) {//0,1,2,3
//				if (arr[j]>arr[j+1]) {//i+1<arr.length;-1防止索引越界
//					//我比隔壁的大,交换位置,我你它
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			int j = arr[i];
//			System.out.println(j);
//		}
			
	}

}

	数组反转,倒序遍历输出即可,不会,正序遍历拿过来修修改改:
		int[] arr = {1,0,0,8,6};//68001
		for (int i = 0; i <=arr.length-1; i++) {
			System.out.println(arr[i]);
		}
		
		for (int i = arr.length-1; i >=0; i--) {
			System.out.println(arr[i]);
		}

	数组变成字符串,定义一个空字符串遍历,在循环里面不断+拼接数组里面的每一个元素即可:
		int[] arr = {1,0,0,8,6};//""+0+1...
		String str = "";
		
		for (int i = 0; i < arr.length; i++) {
			str+=arr[i];//sum = sum+arr[i];//"10086"
		}
		
		System.out.println(str);//"10086"
		System.out.println(str.length());//5

		for (int i = arr.length-1; i >=0; i--) {
			str+=arr[i];//sum = sum+arr[i];//"68001"
		}

3:正则表达式
	概述:正确的规则,表达式指的是字符串,通俗点,就是表示有一定规律或者规则的字符串
	如何查看我们的正则表达式:打开API,搜索一个类Pattern,往下找,你看到的几乎都是正则表达式
	常用套路:掌握*****//用来统计一个长字符串里面到底有多少个小字符串
		public class 常用套路 {
			public static void main(String[] args) {
				//用来统计一个长字符串里面到底有多少个小字符串
				int count = 0;
				String s = "woaiheimaniaimaheimashiwojia";//求字符串里面由多少个小字符串heima
				//常用套路起个名字,pmw,要学会我这个套路,以后就能开bmw
				Pattern p = Pattern.compile("heima");//通过模式类的编译方法得到模式类对象名p
				Matcher m = p.matcher(s);//通过模式类对象名p调用匹配器方法得到匹配器对象名m
				while (m.find()) {//m.find();这个方法返回true的时候,表示通过匹配对象名m找到字符串s匹配的正则表达式
					count++;//count = count + 1;
					//m.group()得到匹配的规则对应内容,heima
					System.out.println(m.group());//heima换行heima
				}
				
				System.out.println(count);//2
				
			}
		}
		//注意,这个find是要部分匹配就返回true表示找到,所以常用的是我的套路,不是下面的matches方法!!!

	作用:
		1.用来校验(匹配)字符串,看看这个字符串是否匹配符合我这个正则表达式的规则规律
		//判断一个字符串是不是手机号码,号码规则:以1开头,第二位3578,总共有11位纯数字,用正则表达式
		public class RegexTest {

			public static void main(String[] args) {
				//1.用来校验(匹配)字符串,看看这个字符串是否匹配符合我这个正则表达式的规则规律
				//判断一个字符串是不是手机号码,号码规则:以1开头,第二位3578,总共有11位纯数字,用正则表达式
				String s = "13866666666000";
				boolean b = isPhoneNum(s);
				System.out.println(b);
			}
			
			//判断一个字符串是不是手机号码,号码规则:以1开头,第二位3578,总共有11位纯数字,用正则表达式
			public static boolean isPhoneNum(String s){//s = "13866666666";
				boolean b = s.matches("^[1][3578][0-9]{9}$");//判断s这个字符串是否匹配等下找到手机号码规则,正则表达式字符串
				return b;//这个matches是要完全匹配才返回true表示找到!!!
			}
		
		}

		2.用来切割字符串,String类里面split(String regex)
		代码:
		String s = "admin.password.123";
		String[] arr = s.split("\\.");//.在正则表达式里面表示任意字符,要表示我们真正的.用\\.
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

		String ss = s.replace(".", "666");//替换所有
		System.out.println(ss);//admin666password666123
		
		String ss = s.replaceAll(".", "666");//.表示正则表达式,任意字符,替换所有为666,如果是替换点的用\\.
		System.out.println(ss);//666666666666666666666666666666666666666666666666666666
		
		



	
		
	
	

	