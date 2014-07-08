本工程为基于高德地图Android SDK进行封装，实现了三种定义的Marker样式，包括根据2012年各省人口年龄结构数据绘制统计饼图、柱状图以及显示详细信息的例子
效果图如下：
 * ![Screenshot](https://raw.githubusercontent.com/amapapi/Android_CustomMarker_lib/master/resources/%E9%A5%BC%E5%9B%BE.png)
 * ![Screenshot](https://raw.githubusercontent.com/amapapi/Android_CustomMarker_lib/master/resources/%E6%9F%B1%E7%8A%B6%E5%9B%BE.png)
 * ![Screenshot](https://raw.githubusercontent.com/amapapi/Android_CustomMarker_lib/master/resources/%E4%BF%A1%E6%81%AF%E5%9B%BE.png)
<br /><h2>版本更新1.0.0</h2>
<br /> 提供了基本的饼图，柱状图和详细显示的Marker样式的绘制
<br /> <h2>下载资源：</h2>
 <br />**[markerlibrary.jar](https://github.com/amapapi/Android_CustomMarker_lib/raw/master/resources/markerlibrary.jar)** (library)
 <br />**[实例应用](https://github.com/amapapi/Android_CustomMarker_lib/raw/master/resources/ViewMarkerDemo.apk)** (apk)
 <br /> 扫一扫下载应用
 <br />![Screenshot]( https://raw.githubusercontent.com/amapapi/Android_ClusterMarker/master/Resources/%E4%BA%8C%E7%BB%B4%E7%A0%81.png)
<br /><h2> 使用方法：</h2>
<br />  1:搭建高德地图 AndroidSDK工程方法见：**[配置方法](http://developer.amap.com/api/android-sdk/guide/project/)**
<br />  2:接口使用
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
								