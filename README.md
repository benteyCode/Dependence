### Gradle Plugin插件开发流程
#### 创建项目
在Android Studio中新建Java Library module plugin
#### 修改build.gradle文件
![01](https://github.com/bentey/Dependence/blob/master/screenshot/01.png?raw=true)
#### 修改项目文件夹
src/main项目文件如下
* 移除java文件夹，这个项目中用不到java代码
* 添加groovy文件夹
* 添加resources文件夹，存放用于标识gradle插件的meta-data

#### 建立对应文件
![03](https://github.com/bentey/Dependence/blob/master/screenshot/03.png?raw=true)
DependPlugin.groovy文件内容如下：
![02](https://github.com/bentey/Dependence/blob/master/screenshot/02.png?raw=true)
plugin_depend.properties文件内容如下：
```
implementation-class = com.bentey.plugin.depend.DependPlugin
```
#### 注意
* groovy文件夹中的类，一定要修改成.groovy后缀，IDE才会正常识别
* resources/META-INF/gradle-plugins这个文件夹结构是强制要求的，否则不能识别成插件
* plugin_depend.properties中plugin_depend为插件名

#### 在第三方App中使用插件
* 在项目的buildscript添加插件作为classpath
* 在module中使用插件`apply plugin 'plugin_depend'`
