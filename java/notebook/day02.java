1:��������ϸ��
	����:ÿ�����ݶ��ж�Ӧ����,23������������Ĭ��дint,���������ڴ�ռ��ʱ�򵽵׶������������ָ��,��Ӧһ���ķ�Χ��С
	����:
		������������:
			��������:
				byte:�ֽ�����,ռһ���ֽ�8λ,��Χ-128��127Ҫ����,��-2��7�η���2��7�η���1
				short:������,ռ�����ֽ�16λ,��Χ��-2��15�η���2��15�η���1 //32767
				int:����Ĭ������,ռ�ĸ��ֽ�32λ,��Χ��-2��31�η���2��31�η���1
				long:������,ռ�˸��ֽ�64λ,��Χ��-2��63�η���2��63�η���1,����������������int�ķ�Χ��Ҫ���Ϻ�׺l����L

			С��(����)����:
				double:С��Ĭ������,ռ�˸��ֽ�64λ,��Χ���ü�,С����Զ��������,˫���ȸ�������,��ʾС����Χ����ȷ
				       ��Ĭ�Ϻ�׺d����D,��дҲ��д,ϵͳ����д,ֱֵ��д

				float:С������,ռ�ĸ��ֽ�32λ,��Χ���ü�,С����Զ��������,�����ȸ�������,��ʾС����Χ������ȷ,һ�㲻��
				      ������������С��,��һ��Ҫ���Ϻ�׺f����F

			�ַ�����:
				char:�ַ�����,ռ�����ֽ�16λ,��ΧҪ��0-65535,����ֵ��''������������,��������ֻ����һ���ַ�

			��������:
				boolean:��������,Java���������û��ָ�����Ĵ�С,����ֵҪô��true,Ҫô��false,��Ӧ�����е�����߼�

		������������:���ǻ����������;���������������,����String����������������,���ǿ���new����,������,�ӿ�,����ȵ�

		�ֽ�:������洢�ļ��Ļ�����λ,������ײ㶼��0��1,������λ,ÿһ��0����1��Ӧһλ,һ���ֽڰ�λ

2:����ת��
	�������ʹ�С��������:byte-short-char(����)-int-long-float-double

	��ʽ����ת��:С���������͵����ݿ��Ը�����������͵����ݸ�ֵ,���С���������͵�ֵ����Ϊ����������͵�����(��������)
	����:
		int i = 666;//iС����������int��Ӧ������
		double d = 23.4;//d�����������double��Ӧ������
		d = i;//С���������͵����ݿ��Ը�����������͵����ݸ�ֵ,���С���������͵�ֵ����Ϊ����������͵�����(��������)
		//����һ����ֵ,����һ������,i������int����,���i��Ӧ����������int����Ϊdouble,С������ֵ�ͱ����666.0������ԭ����666
		System.out.println(d);//666.0

		//������ôдҲ�ǶԵ�,ԭ��������һ��:
		double d = 666;//int666-double666.0

		ע������:byte-short-charͬ����֮�䷢���������ʾΪint����!!!
		char c = 'a';
		System.out.println(c+0);//��һ��С���������͸�����������ͽ�������,���С����������char����Ϊ�����������int
		//��c��Ӧ��char��������Ϊint����,���ַ�a��Ӧint���͵�ֵ97

		char c = 'a';//char+char = int+ int = 97+97,byte-short-charͬ����֮�䷢���������ʾΪint����!!!
		System.out.println(c+c);//194

	ǿ������ת��:�����һ��Ҫ�Ѵ���������͵����ݸ�С���������ͽ��и�ֵ,��Ҫ�õ�ǿ������ת��,��ʽ����:
	����:
		int i = 666;//iС����������int��Ӧ������
		double d = 23.4;//d�����������double��Ӧ������
		i = (int)d;//ǿ��ת���ĸ�ʽ,��double���͵�����ǿ��ת����int���͵�����
		System.out.println(i);//23

	��������ת����ע������:
		1.boolean�������Ͳ��ܸ��������ͽ�������ת��,��Ϊboolean��������Java���������û��ָ�����Ĵ�С
		����:
		boolean i = true;//iС����������int��Ӧ������
		double d = 23.4;//d�����������double��Ӧ������
		i = (boolean)d;//����,��Ϊboolean��������Java���������û��ָ�����Ĵ�С
		d = i;//����,��Ϊboolean��������Java���������û��ָ�����Ĵ�С

		2.�ַ���������Ӧintֵ,��β鿴,ͨ������鿴,�ַ�'a'��Ӧ��intֵ��97,'A'��Ӧ��65,�����32,'b'��Ӧ��98,'B'��66,�����Դ�����
		  '0'�ַ���Ӧ����48,���������ַ��Դ����ƶ��Ǽ�1
		
3:��ʶ��//����,ѡ������ܿ�,ƽʱ���ü���ô��,��д��Ӣ�ĵ��������ּ���
	����:�������������ֵĹ���,����������,����,��������ֶ�Ҫ��ѭ��ôһ������,�������ֽб�ʶ��
	��ɹ���:Ӣ����ĸ��С,����0��9,$,_������һ�����߶�����(����Ҳ�ǿ������������ֵ��ǲ��Ƽ�)
	ע������:
		1.���������ֿ�ͷ
		2.����ʹ�ùؼ���(Java�������⺬��ĵ���)
		3.�ϸ����ִ�Сд
		4.��ü���֪��

	�ؼ���:Java�������⺬��ĵ���,�Ͳ�������������(��������������ҾͿ������ı���ԭ������˼,�����class��ʾ���Ϊ�༶�ȵ�)
	       �ؼ��ֺܶ�,���ü�,�ö��˾���Ϥ��,�ؼ����и��ص�:����Сд��,������Сд��һ���ǹؼ��ֱ���abc,��Ϊabc��������������,
		   �ؼ��ֲ���������������

4:����ѡ�����
	if���:������������е�ѡ������
	��ʽ1:һѡһ,���߶�ѡ�����
	if(true){
		//true�ͽ�������������,�����false�Ͳ�����
	}//i alt /ѡ

	��ʽ2:��ѡһ
	if(true){
		//true�ͽ�������������,���治��,�����false�Ͳ�����
	}else {
		//���������false��ʱ��һ������������������
	}

	��ʽ3:��ѡһ
	if(true){
		//true�ͽ�������������,���治��,�����false�Ͳ�����
	}else if(true){//elseif������ʡ��,���ǿ����ж��
		//true�ͽ�������������,���治��,�����false�Ͳ�����
	}else{//else����ʡ��,���鲻Ҫʡ��,��Ϊ���Ը����������ʾ
		//������涼��false��ʱ��һ������������������
	}

5:�����(�Ƚ�,��ֵ,����,�߼�)
����:��������ķ���
	����:
		��ֵ�����:=,int a = 666;��=��ֵ���ұߵ����ݸ���ߵı���(����)װ�� 
		           +=,��ʾ��+=���������ߵ�������ӵõ������ֵ����߱���,int i = 2; i+=2;//i = i+2;syso(i)//4
				   -=
				   *=
				   /=
				   %=

		���������:+,-,*,/,%ȡģ(������),++,--
			�������ʹ��,����++��ǰ�����ں�,��ʾ�������һ����,int i = 666;i++,����++i,����ͬһ����˼,i = i+1;

			����������˲�������,��Ҫע��:
				���++��ǰ,������Ȼ��ѵõ�����ٸ����˽�������,������ʾ��1����˼,++i + 2;��˽����,

				���++�ں�,�ȸ����˽�������õ�������,Ȼ��������,������ʾ��1����˼,i++ + 2;��˽����

			ע������:
				1.%ȡģ���������ֻ����ߵķ������,���ұ��޹�,//�ɼ����%�߸�����,ģ,�ұ߲�Ҫ,���ұ��޹�

		�Ƚ�(��ϵ)�����:<,>,<=,>=,==,!=,����д�����ܼ򵥻��Ǹ���,���һ���ǲ�������,ֵҪô��true,Ҫô��false
		        <=С�ڻ��ߵ��ڶ�������������,�������,ֻҪ��һ������,��������������,���������,true

		�߼������:&& || ! & |,�߼�������������ߵ����ݲ��ܼ򵥻��Ǹ���,���һ���ǲ�������,ֵҪô��true,Ҫô��false
		//&&�����߼���(˫��),���ҵ���˼,ֻ������ͬʱΪ���,�������������,���������Ϊ��
		System.out.println(true&&true);//�ھ�:ͬΪ��ʱ��Ϊ��,���������Ϊ��,true
		System.out.println(false&&true);//false
		System.out.println(true&&false);//false
		System.out.println(false&&false);//false
	
		//||�����߼���(˫��),���ߵ���˼,ֻ������ͬʱΪ�ٵ�,����������Ǽ�,���������Ϊ��
		System.out.println(true||true);//true
		System.out.println(false||true);//true
		System.out.println(true||false);//true
		System.out.println(false||false);//�ھ�:ͬΪ��ʱ��Ϊ��,���������Ϊ��,false

		//!�����߼���,ȡ����˼,ԭ�������ȡ������Ǽ�,ԭ���Ǽٵ�ȡ���������(���漴��,�Ǽټ���)
		System.out.println(!true);//false
		System.out.println(!false);//true
		System.out.println(!!true);//true,�����һ����ȡ��ż����,���������ԭ������
		System.out.println(!!!false);//true

		������:&&�߼���(˫��)��&�����������ʲô?
			���ǵĽ������һ����(��Ϊ�õĶ���ͬһ���ھ�:ͬΪ��ʱ��Ϊ��,���������Ϊ��)//true&&true//true
			&&���ж�·Ч��(��·��):��������false,����ͨ��&&���������������false,�ұ߲�������,���Ч��,�Ƽ�ʹ��,false&&δ֪//false
			&û�ж�·Ч��:������ʲô���,�������߶�Ҫ��������,Ч�ʱȽϵ�,һ�㲻��
		����:
		int i = 0;
		int j = 1;
		
		if (i++==1 && j++==2) {//��������false,����ͨ��&&���������������false,�ұ߲�������,���Ч��,
			System.out.println(i);//������ʲô���,�������߶�Ҫ��������,
			System.out.println(j);
		}
		
		System.out.println(j);//1,&&
		System.out.println(j);//2&

		������:||�߼���(˫��)��|�����������ʲô?
		���ǵĽ������һ����(��Ϊ�õĶ���ͬһ���ھ�:ͬΪ��ʱ��Ϊ��,���������Ϊ��)//false||false//false,//true||δ֪  //true
			||���ж�·Ч��(��·��):��������true,����ͨ��||���������������true,�ұ߲�������,���Ч��,�Ƽ�ʹ��
			|û�ж�·Ч��:������ʲô���,�������߶�Ҫ��������,Ч�ʱȽϵ�,һ�㲻��

		����������ȼ�:�����Ⱥ�˳��,���ȸ߾�������,=��ֵ�����ȼ����������,���������ұ�,�ٸ���߸�ֵ
		               ����Ҳ�֪�����ȼ�˳��,��()��Χ������������������ȼ�,����������

6:��������ǿ��ѵ��
����:������ʾ�ض����ܵĴ����{},�ֽй���,���к���,��ߴ���ĸ�����(��ߴ����ظ�����Ч��,��д�˺ܶ����ʵ��һ���Ĺ���)
�����Ķ��������һ����������һ������˼,����дһ������,�и���д��:
дһ��������ʱ��,()��������һ������û��ֵ,�����ʽ����,��ʽ����(����),��������:�������� ������

//�޲����޷���ֵ
public void test(){//void��Ӧ���Ƿ�������ֵ���͵�λ��,���һ������û�з���ֵ,�Ǿ�û�з���ֵ����дvoid��ʾ
	//return;//Ĭ�ϲ�дҲ��д,ϵͳ����д,��ôд��ʾû�з���ֵ,return��ʾ���ص���˼,return����ֵ���Ƿ���ֵ
	//return��ʾ���ص���˼,��������Ƿ���ֵ,���ߵ������ʾ�������Ѿ�������,���治����д����
	//����ֵ��ʾ����������ʹ�����֮��õ��Ľ��
	//int i = 66;

}

//�в����޷���ֵ
public void test2(int a){
	
}

//�޲����з���ֵ
public int test3(){
	return 666;//return�����ֵ���Ƿ���ֵ������666,�����з���ֵ,����ֵ���͵�λ�þͲ���дvoid,��Ӧ��д����ֵ��Ӧ����������,������дint
}

//�в����з���ֵ
public int test4(int a){
	return 666;
}
�ܽ�:����˵����ô��,����ѧϰ���ȥ����һ������(дһ������),û����,�ڽ�ѧϵͳ����,��д�õķ�����������ķ�����ȥʹ��ȥ����(�����ĵ���)
�������ƽʱ��������eclipseд�����õĹ�������,дһ�������Ǽ���û���õ�,�ؼ�����Ҫ�����Լ�д�ķ���ʹ������(��������)
�Լ�д����,�Լ�ȥʹ��(�����ĵ��þ��ǲ�����д���������)

7:�����ĵ��û���˵����һ������,��ʵ����ʹ��һ������,���ʹ��?

8:�Ժ�eclipseд�����ʱ��Ҫ����һ������,����Ҫ����һ����Ŀ,��src�ļ��������½�һ������main��������,���������������
����:
public class ����������������õ�������� {
	public static void main(String[] args) {//main���������г�������,һ�г����������濪ʼ��
//		System.out.println(666);
		//���ʹ�õ���������д�õ�test����:���÷�����ʽ:������();
//		test();
		//test2(666);//�ڵ���test2������ʱ��()����д�Ĳ�����ʵ���ʾ���һ��ֵ,ʵ�ʴ����ֵ666,ʵ�ʲ���,���ʵ��,����ʵ�ʲ��������������Ϊ�˸������д������ʱ�������Ǹ���ʽ������ֵ
//		int i = 666;
//		test2(i);
//		System.out.println(888);//ʵ�ʲ���������һ��ֵ
		
//		int j = test3();//�õ�����������ϵĽ��Ҳ���Ƿ����ķ���ֵ666,û�д�ӡ
//		System.out.println(j);
//		System.out.println(test3());//����ָ����test3����,������������ϵĽ��Ҳ���Ƿ����ķ���ֵ666,Ҳ����ӡ
//		System.out.println(999);
//		System.out.println(555);
		
//		int i = 555;
//		System.out.println(i);
		
//		test4(666);//ֱ�ӵ���
//		System.out.println(test4(666));//�������
		
		int i = test4(666);//��ֵ����
		System.out.println(i);
	}
	
	//дһ��������û���õ�,�ؼ�Ҫ���������(ʹ��)��������,��ΰ�һ��������������?�������ø�ʽ
	//�޲����޷���ֵ����
	public static void test(){
		System.out.println("test");
	}
	
	//�в����޷���ֵ������д��,дһ��������ʱ���ڷ���()��������һ�������ͱ�ʾһ������,�����������(����)ֻ������,û�и�ֵ,����û��ֵ,�����ʽ����,��ʽ����,����β�
	public static void test2(int a){//a,û��ֵ,�����ʽ����,��ʽ����, a = 666;//������Ҫ���������test2�����и�Ҫ��,��Ҫ���ҵ���ʽ������������a���и�ֵ,��Ϊ���Ժ���ܻ��õ������ʽ����a
		System.out.println("test2");//a = 666;
		System.out.println(a);//��ʽ����a����Ϊ�˽��յ��õ��õ�ʱ���������ʵ�ʲ�����ֵ,�����������ʽ�����ò���,���忴�������,��ʽ����������ʵһ��û�и�ֵ�ı���
	}
	
	//�޲����з���ֵ
	public static int test3(){
		System.out.println("test3");
		return 666;//666���Ƿ����ķ���ֵ,��ʾ����������ϵõ��Ľ��,���ߵ������ʾ�����Ѿ��������,��Ϊ��û�д�ӡ����������Ͻ�����Կ�����,Ҫ��������������ӡ
	}

	//�в����з���ֵ
	public static  int test4(int a){//a = 666;
		System.out.println("test4"+a);
		return 666;
	}
		
}
