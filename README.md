#0. 使用场景
分工合作，代码分离有很多种方法。本文这次讲一种上传本地库方法，就像引用其他公用库方法一样，只不过是本地上传“本地仓库”，直接引用本地仓库。
# 1. 编写本地SDK#
	

1.  新建一个Android 项目（略）
2.  新建一个Android SDK（见第2节截图）
3.  修改SDK，新建一个MyCommon类 
>     public class MyCommon {
>     	public static int Test1(){
>     	Log("call MyCommon.Test1(); ");
>     	return 0;
>     	}
>     	
>     	public static void Log(String str){
>     	Log.i(MyTag, str);
> 
>     	}
>     	
>     	public static String getHelloWorld(){
>     	return "Hello world from SDK";
>     	}
>     }

代码参看 https://github.com/HungryGoogle/LocalRepo

# 2. 上传SDK到本地仓库#
![](https://i.imgur.com/Lmh5Pmf.png)

	// 发布到本地库 ----begin-----------------------------------------
	apply plugin: 'maven'
	uploadArchives{
	    repositories {
	        mavenDeployer {
	            repository(url: uri('../repository'))
	            pom.groupId = "com.deepin"
	            pom.artifactId = "mysdk"
	            pom.version = "1.0.1"
	        }
	    }
	}
	// 发布到本地库 ---- end -----------------------------------------
操作步骤
1. 首先，编写脚本，更新gradle脚本就会出现upload目录
2. 双击upload目录中的uploadArchives，就可以上传到本地仓库（就是一个相对目录，也可以用绝对路径）

# 3. 编写UI#
![](https://i.imgur.com/dontyDm.png)

1. 在步骤2中，已经生成仓库
2. 打开整个项目的build.gradle配置文件，填入2，3，引用刚刚生成的仓库。（也可以添加其他仓库）
3. 之后，在本地引用刚刚的库，如下图所示

![](https://i.imgur.com/gxCiRQE.png)

4. UI代码调用SDK

![](https://i.imgur.com/DQPYxT8.png)
