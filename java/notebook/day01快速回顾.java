day01:
1:计算机语言发展史
2:Java代码的注释
3:变量的作用和常见数据类型
	String name = "";int age = 18;double d = 888.8;char gender = '男';boolean isMarried = true;
	float f = 23.4f;//i alt / 选
4:选择语句if语句
	if(true){
		//true做事情
	}

	if(true){
		//true做事情,下面不走
	}else{
		//false做事情
	}

	if(true){
		//true做事情,下面不走
	}else if(true){//可以有多个,不能省略
		//true做事情,下面不走
	}else {//else可以省略,建议不要省略,给出额外的提示
		//上面都是false做事情
	}

5:常见运算符
	=:int i = 666;
	+=:int j = 2;j+=2;syso(j);//4

	%求余数,++,--
	++:int i = 2;i++;syso(i);//3   int j = 2; int c = j++;syso(c);//2  int j = 2; int c = ++j;syso(c);//3

	<,>,<=,>=,==,!=
6:Java中定义类和方法的格式
public class Itheima {
	public void test(){
		//return;
	}

	public int add(int a,int b){
		return a+b;
	}
}
