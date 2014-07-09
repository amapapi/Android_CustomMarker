本工程为基于高德地图Android SDK进行封装，实现了三种定义的Marker样式，包括根据2012年各省人口年龄结构数据绘制统计饼图、柱状图以及显示详细信息的例子

##前述：

- [高德官方网站申请key](http://id.amap.com/?ref=http%3A%2F%2Fapi.amap.com%2Fkey%2F).
- 阅读[参考手册](http://api.amap.com/Public/reference/Android%20API%20v2/).
- - 工程基于3D地图2.2.1版本，[基本介绍](https://github.com/amapapi/Android_AMap_3DMapSDK).

##效果图如下：

 * ![Screenshot](https://raw.githubusercontent.com/amapapi/Android_CustomMarker_lib/master/resources/%E9%A5%BC%E5%9B%BE.png)
 * ![Screenshot](https://raw.githubusercontent.com/amapapi/Android_CustomMarker_lib/master/resources/%E6%9F%B1%E7%8A%B6%E5%9B%BE.png)
 * ![Screenshot](https://raw.githubusercontent.com/amapapi/Android_CustomMarker_lib/master/resources/%E4%BF%A1%E6%81%AF%E5%9B%BE.png)

 ##版本更新1.0.0 

 提供了基本的饼图，柱状图和详细显示的Marker样式的绘制
 
 ##下载资源：
 
* [markerlibrary.jar](https://github.com/amapapi/Android_CustomMarker_lib/raw/master/resources/markerlibrary.jar) (library)
* [实例应用](https://github.com/amapapi/Android_CustomMarker_lib/raw/master/resources/ViewMarkerDemo.apk) (apk)
* 扫一扫下载应用

![Screenshot](https://raw.githubusercontent.com/qiyy/Android_CustomMarker_lib/master/resources/%E4%BA%8C%E7%BB%B4%E7%A0%81.png)
 
 ## 使用方法：
 
+ 1:搭建高德地图 AndroidSDK工程方法见：**[配置方法](http://developer.amap.com/api/android-sdk/guide/project/)**
+  2:接口使用

* 绘制饼图接口

``` java
//获取饼图
				MarkerOptions markerOptions = MarkerOptionsFactory
						.createPieChartMarkerOptions(getApplicationContext(),
								ConstantUtils.latlngs[i],
								ConstantUtils.AGEData[i], colors, 50);
```
								
* 绘制柱状图接口	

``` java							
//获取柱状图
				MarkerOptions markerOptions = MarkerOptionsFactory
						.createBarChartMarkerOptions(getApplicationContext(),
								ConstantUtils.latlngs[i],
								ConstantUtils.AGEData[i], colors, 100);
```	

* 绘制详细信息图接口：

``` java
	MarkerOptions markerOptions = MarkerOptionsFactory
						.createInfoWindowMarkerOptions(getApplicationContext(),
								ConstantUtils.latlngs[i],
								ConstantUtils.names[i],
								ConstantUtils.contents[i], drawable,contentDrawable);	
```									
								